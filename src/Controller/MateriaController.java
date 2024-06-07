/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controller;

import DAO.MateriaDAO;
import Model.ModelCursoMateria;
import java.util.List;

/**
 *
 * @author gustavo
 */

public class MateriaController {

    MateriaDAO materiaDAO = new MateriaDAO();

    
    /**
     * Salva uma Matéria no Banco
     *
     * @param modelCursoMateria
     * @return
     */
    public boolean salvarMateriaController(ModelCursoMateria modelCursoMateria) {
        return this.materiaDAO.salvarMateriaDAO(modelCursoMateria);
    }

    
    /**
     * Carrega uma Lista de Matérias
     *
     * @return
     */
    public List<ModelCursoMateria> listarMateriaController() {
        return this.materiaDAO.listarMateriasDAO();
    }

    
    /**
     * Deleta uma Matéria pelo ID
     *
     * @param codigo
     * @return
     */
     public boolean excluirMateriaController(int codigo) {
         return this.materiaDAO.excluirMateria(codigo);
     }

     
     /**
      * Pega o ID para Editar
      * @param codigo
      * @return 
      */
    public ModelCursoMateria editarMateriaController(int codigo) {
        return this.materiaDAO.editarMateria(codigo);
    } 

    
    /**
     * Atualiza um Curso pelo ID
     * @param modelCursoMateria
     * @return 
     */
    public boolean atualizarMateriaController(ModelCursoMateria modelCursoMateria) {
        return this.materiaDAO.atualizarMateria(modelCursoMateria);
    }
}
