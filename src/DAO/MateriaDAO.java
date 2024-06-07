/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexao.ConexaoPostgreSQL;
import Model.ModelCursoMateria;
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
public class MateriaDAO extends ConexaoPostgreSQL {

    /**
     * Salva uma Materia no Banco de Dados
     * @param modelCursoMateria
     * @return
     */
    public boolean salvarMateriaDAO(ModelCursoMateria modelCursoMateria) {
        try {
            conectar();

            String sql = "INSERT INTO curso_materia ("
                    + "    nome_curso, "
                    + "    nome_materia, "
                    + "    periodo, "
                    + "    carga_horaria, "
                    + "    horario_inicio, "
                    + "    horario_fim, "
                    + "    semestre, "
                    + "    ano"
                    + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = criarPreparedStatement(sql, 0);

            preparedStatement.setString(1, modelCursoMateria.getNome_curso());
            preparedStatement.setString(2, modelCursoMateria.getNome_materia());
            preparedStatement.setString(3, modelCursoMateria.getPeriodo());
            preparedStatement.setInt(4, modelCursoMateria.getCarga_horaria());
            preparedStatement.setString(5, modelCursoMateria.getHorario_inicio());
            preparedStatement.setString(6, modelCursoMateria.getHorario_fim());
            preparedStatement.setInt(7, modelCursoMateria.getSemestre());
            preparedStatement.setInt(8, modelCursoMateria.getAno());

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        desconectar();

        return true;
    }

    /**
     * Lista todas Matérias do Banco de Dados
     * @return
     */
    public List<ModelCursoMateria> listarMateriasDAO() {

        List<ModelCursoMateria> listarCursoMaterias = new ArrayList<>();
        ModelCursoMateria modelCursoMateria = new ModelCursoMateria();

        conectar();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT "
                + "    id, "
                + "    nome_curso, "
                + "    nome_materia, "
                + "    periodo, "
                + "    carga_horaria, "
                + "    horario_inicio, "
                + "    horario_fim, "
                + "    semestre, "
                + "    ano "
                + "FROM curso_materia";

        try {
            preparedStatement = criarPreparedStatement(sql);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelCursoMateria = new ModelCursoMateria();
                modelCursoMateria.setId(resultSet.getInt(1));
                modelCursoMateria.setNome_curso(resultSet.getString(2));
                modelCursoMateria.setNome_materia(resultSet.getString(3));
                modelCursoMateria.setPeriodo(resultSet.getString(4));
                modelCursoMateria.setCarga_horaria(resultSet.getInt(5));
                modelCursoMateria.setHorario_inicio(resultSet.getString(6));
                modelCursoMateria.setHorario_fim(resultSet.getString(7));
                modelCursoMateria.setSemestre(resultSet.getInt(8));
                modelCursoMateria.setAno(resultSet.getInt(9));

                listarCursoMaterias.add(modelCursoMateria);
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }

        desconectar();

        return listarCursoMaterias;
    }

    /**
     * Deleta uma Matéria pelo ID
     * @param pId
     * @return
     */
    public boolean excluirMateria(int pId) {

        conectar();
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM curso_materia WHERE id = ?";

        try {
            preparedStatement = this.criarPreparedStatement(sql);
            preparedStatement.setInt(1, pId);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return false;
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.desconectar();
            return true;
        }
    }

    /**
     * Edita um Curso pegando seu ID
     * @param pId
     * @return
     */
    public ModelCursoMateria editarMateria(int pId) {
    ModelCursoMateria modelCursoMateria = null;
    conectar();

    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;

    String sql = "SELECT id, "
            + "nome_curso, "
            + "nome_materia, "
            + "periodo, "
            + "carga_horaria, "
            + "horario_inicio, "
            + "horario_fim, "
            + "semestre, "
            + "ano "
            + "FROM curso_materia "
            + "WHERE id = ?";

    try {
         preparedStatement = criarPreparedStatement(sql);
        preparedStatement.setInt(1, pId);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            modelCursoMateria = new ModelCursoMateria();
            modelCursoMateria.setId(resultSet.getInt("id"));
            modelCursoMateria.setNome_curso(resultSet.getString("nome_curso"));
            modelCursoMateria.setNome_materia(resultSet.getString("nome_materia"));
            modelCursoMateria.setPeriodo(resultSet.getString("periodo"));
            modelCursoMateria.setCarga_horaria(resultSet.getInt("carga_horaria"));
            modelCursoMateria.setHorario_inicio(resultSet.getString("horario_inicio"));
            modelCursoMateria.setHorario_fim(resultSet.getString("horario_fim"));
            modelCursoMateria.setSemestre(resultSet.getInt("semestre"));
            modelCursoMateria.setAno(resultSet.getInt("ano"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        desconectar();
    }

    return modelCursoMateria;
}


    /**
     * Atualiza um Curso pelo seu ID
     * @param modelCursoMateria
     * @return
     */
    public boolean atualizarMateria(ModelCursoMateria modelCursoMateria) {
        conectar();

        String sql = "UPDATE curso_materia SET "
                + "    nome_curso = ?, "
                + "    nome_materia = ?, "
                + "    periodo = ?, "
                + "    carga_horaria = ?, "
                + "    horario_inicio = ?, "
                + "    horario_fim = ?, "
                + "    semestre = ?, "
                + "    ano = ? "
                + "WHERE id = ?";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = criarPreparedStatement(sql);
            preparedStatement.setString(1, modelCursoMateria.getNome_curso());
            preparedStatement.setString(2, modelCursoMateria.getNome_materia());
            preparedStatement.setString(3, modelCursoMateria.getPeriodo());
            preparedStatement.setDouble(4, modelCursoMateria.getCarga_horaria());
            preparedStatement.setString(5, (modelCursoMateria.getHorario_inicio()));
            preparedStatement.setString(6, (modelCursoMateria.getHorario_fim()));
            preparedStatement.setInt(7, modelCursoMateria.getSemestre());
            preparedStatement.setInt(8, modelCursoMateria.getAno());
            preparedStatement.setInt(9, modelCursoMateria.getId());

            int linhasAfetadas = preparedStatement.executeUpdate();
            return linhasAfetadas > 0;

        } catch (SQLException ex) {
            Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            desconectar();
        }
    }
}
