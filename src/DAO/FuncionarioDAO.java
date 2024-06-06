/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexao.ConexaoPostgreSQL;
import Model.ModelFuncionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author gustavo
 */
public class FuncionarioDAO extends ConexaoPostgreSQL {

    /**
     * Salvar Funcionários no Banco de Dados
     *
     * @param modelFuncionario
     * @return
     */
    public boolean salvarFuncionarioDAO(ModelFuncionario modelFuncionario) {

        try {
            conectar();

            String sql = "INSERT INTO FUNCIONARIO (\n"
                    + "    NOME, \n"
                    + "    CPF, \n"
                    + "    TELEFONE, \n"
                    + "    ENDERECO, \n"
                    + "    BAIRRO, \n"
                    + "    COMPLEMENTO, \n"
                    + "    NUMERO, \n"
                    + "    LOGIN, \n"
                    + "    SENHA, \n"
                    + "    ID_TIPO_PESSOA,\n"
                    + "    ID_SITUACAO\n"
                    + ")"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, 3, 1)";

            PreparedStatement preparedStatement = criarPreparedStatement(sql, 0);

            preparedStatement.setString(1, modelFuncionario.getNome());
            preparedStatement.setString(2, modelFuncionario.getCpf());
            preparedStatement.setString(3, modelFuncionario.getTelefone());
            preparedStatement.setString(4, modelFuncionario.getEndereco());
            preparedStatement.setString(5, modelFuncionario.getBairro());
            preparedStatement.setString(6, modelFuncionario.getComplemento());
            preparedStatement.setInt(7, modelFuncionario.getNumero());
            preparedStatement.setString(8, modelFuncionario.getLogin());
            preparedStatement.setString(9, modelFuncionario.getSenha());

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        desconectar();

        return true;
    }

    /**
     * Listar todos os Funcionários do Banco de Dados,
     * onde a situação seja diferente de 0 (EXCLUIDO).
     * @return
     */
    public List<ModelFuncionario> listarFuncionariosDAO() {

        List<ModelFuncionario> listarFuncionarios = new ArrayList<>();
        ModelFuncionario modelFuncionario = new ModelFuncionario();

        conectar();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "select\n"
                + "	id,\n"
                + "	nome,\n"
                + "	login,\n"
                + "	senha\n"
                + "from\n"
                + "	funcionario\n"
                + "where\n"
                + "	id_situacao != 0";

        try {
            preparedStatement = criarPreparedStatement(sql);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelFuncionario = new ModelFuncionario();
                modelFuncionario.setId(resultSet.getInt(1));
                modelFuncionario.setNome(resultSet.getString(2));
                modelFuncionario.setLogin(resultSet.getString(3));
                modelFuncionario.setSenha(resultSet.getString(4));

                listarFuncionarios.add(modelFuncionario);
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }

        desconectar();

        return listarFuncionarios;
    }

    /**
     * Realiza uma Exclusão Lógica de Funcionário,
     * mudando o seu Status de Ativo para Excluído.
     */
    public boolean excluirFuncionario(int pId) {

        conectar();
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE FUNCIONARIO SET id_situacao = ? WHERE ID = ?";

        try {
            preparedStatement = this.criarPreparedStatement(sql);
            preparedStatement.setInt(1, 0); // 0 representa a situação "excluído"
            preparedStatement.setInt(2, pId);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return false;
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.desconectar();
            return true;
        }
    }
    
    
    /**
     * Editar Funcionários
     * @param pId
     * @return 
     */
    public ModelFuncionario editarFuncionario(int pId) {

    ModelFuncionario modelFuncionario = new ModelFuncionario();

    conectar();

    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;

    String sql = "select id, "
            + "nome, "
            + "cpf, "
            + "telefone, "
            + "endereco, "
            + "bairro, "
            + "complemento, "
            + "numero, "
            + "login, "
            + "senha "
            + "from funcionario "
            + "where id = '" + pId + "'";

    preparedStatement = criarPreparedStatement(sql);
    try {
        resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            modelFuncionario.setId(resultSet.getInt("id"));
            modelFuncionario.setNome(resultSet.getString("nome"));
            modelFuncionario.setCpf(resultSet.getString("cpf"));
            modelFuncionario.setTelefone(resultSet.getString("telefone"));
            modelFuncionario.setEndereco(resultSet.getString("endereco"));
            modelFuncionario.setBairro(resultSet.getString("bairro"));
            modelFuncionario.setComplemento(resultSet.getString("complemento"));
            modelFuncionario.setNumero(resultSet.getInt("numero"));
            modelFuncionario.setLogin(resultSet.getString("login"));
            modelFuncionario.setSenha(resultSet.getString("senha"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            desconectar();
        }

        return modelFuncionario;
  }
    
    
    /**
     * Atualizar Funcionário pelo ID
     * @param modelFuncionario
     * @return 
     */
    public boolean atualizarFuncionario(ModelFuncionario modelFuncionario) {
    this.conectar();
    
    String sql = "UPDATE funcionario SET "
                + "nome = ?, "
                + "cpf = ?, "
                + "telefone = ?, "
                + "endereco = ?, "
                + "bairro = ?, "
                + "complemento = ?, "
                + "numero = ?, "
                + "login = ?, "
                + "senha = ? "
                + "WHERE id = ?";
    
    PreparedStatement preparedStatement = null;
    try {
        preparedStatement = criarPreparedStatement(sql);
        preparedStatement.setString(1, modelFuncionario.getNome());
        preparedStatement.setString(2, modelFuncionario.getCpf());
        preparedStatement.setString(3, modelFuncionario.getTelefone());
        preparedStatement.setString(4, modelFuncionario.getEndereco());
        preparedStatement.setString(5, modelFuncionario.getBairro());
        preparedStatement.setString(6, modelFuncionario.getComplemento());
        preparedStatement.setInt(7, modelFuncionario.getNumero());
        preparedStatement.setString(8, modelFuncionario.getLogin());
        preparedStatement.setString(9, modelFuncionario.getSenha());
        preparedStatement.setInt(10, modelFuncionario.getId());
        
        int linhasAfetadas = preparedStatement.executeUpdate();
        return linhasAfetadas > 0;
        
    } catch (SQLException ex) {
        Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    } finally {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.desconectar();
    }
}

    
    /**
     * Valida o Login e a Senha no Banco de Dados
     * @param modelFuncionario
     * @return 
     */
    public boolean validarLogin(ModelFuncionario modelFuncionario) {
        conectar();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT id, nome, cpf, telefone, endereco, bairro, complemento, numero, login, senha "
                + "FROM funcionario "
                + "WHERE login = ? AND senha = ?";

        try {
            preparedStatement = criarPreparedStatement(sql);
            preparedStatement.setString(1, modelFuncionario.getLogin());
            preparedStatement.setString(2, modelFuncionario.getSenha());

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            desconectar();
        }
    }
}
