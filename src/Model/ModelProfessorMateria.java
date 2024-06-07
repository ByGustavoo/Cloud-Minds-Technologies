/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

import java.security.Timestamp;

/**
 *
 * @author gustavo
 */

public class ModelProfessorMateria {
    
    private int id;
    private ModelFuncionario funcionario;
    private ModelCursoMateria cursoMateria;
    private Timestamp data_relacionamento;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the funcionario
     */
    public ModelFuncionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(ModelFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the cursoMateria
     */
    public ModelCursoMateria getCursoMateria() {
        return cursoMateria;
    }

    /**
     * @param cursoMateria the cursoMateria to set
     */
    public void setCursoMateria(ModelCursoMateria cursoMateria) {
        this.cursoMateria = cursoMateria;
    }

    /**
     * @return the data_relacionamento
     */
    public Timestamp getData_relacionamento() {
        return data_relacionamento;
    }

    /**
     * @param data_relacionamento the data_relacionamento to set
     */
    public void setData_relacionamento(Timestamp data_relacionamento) {
        this.data_relacionamento = data_relacionamento;
    }

   
}
