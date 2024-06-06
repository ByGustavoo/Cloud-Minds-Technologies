/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.FuncionarioDAO;
import Model.ModelFuncionario;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class FuncionarioController {

    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    
    /**
     * Salvar um novo Funcionário no Banco
     *
     * @param modelFuncionario
     * @return
     */
    public boolean salvarFuncionarioController(ModelFuncionario modelFuncionario) {
        return this.funcionarioDAO.salvarFuncionarioDAO(modelFuncionario);
    }

    
    /**
     * Lista todos os Funcionários
     *
     * @return
     */
    public List<ModelFuncionario> listarFuncionarios() {
        return this.funcionarioDAO.listarFuncionariosDAO();
    }

    
    /**
     * Realiza uma Exclusão Lógica de um Funcionário no Banco de Dados
     *
     * @param codigo
     */
    public boolean excluirFuncionario(int codigo) {
        return this.funcionarioDAO.excluirFuncionario(codigo);
    }
    
    
    public ModelFuncionario editarFuncionario(int codigo) {
        return this.funcionarioDAO.editarFuncionario(codigo);
    }
    
    
    public boolean atualizarFuncionarioController(ModelFuncionario modelFuncionario) {
        return this.funcionarioDAO.atualizarFuncionario(modelFuncionario);
    }

    public boolean validarLoginController(ModelFuncionario modelFuncionario) {
        return this.funcionarioDAO.validarLogin(modelFuncionario);
    }
}
