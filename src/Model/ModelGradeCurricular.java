/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

/**
 *
 * @author gustavo
 */

public class ModelGradeCurricular {
    
    private int id;
    private String nome_materia;
    private String nome_curso;
    private float carga_horaria;
    private int semestre;
    private int ano;

    
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
     * @return the nome_materia
     */
    public String getNome_materia() {
        return nome_materia;
    }

    
    /**
     * @param nome_materia the nome_materia to set
     */
    public void setNome_materia(String nome_materia) {
        this.nome_materia = nome_materia;
    }

    
    /**
     * @return the nome_curso
     */
    public String getNome_curso() {
        return nome_curso;
    }

    
    /**
     * @param nome_curso the nome_curso to set
     */
    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    /**
     * @return the carga_horaria
     */
    public float getCarga_horaria() {
        return carga_horaria;
    }

    
    /**
     * @param carga_horaria the carga_horaria to set
     */
    public void setCarga_horaria(float carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    
    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    
    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    
    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
