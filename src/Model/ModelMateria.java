/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

/**
 *
 * @author gustavo
 */

public class ModelMateria {
    
    private int id;
    private String nome;
    private int id_curso;
    private int id_professor;
    private int periodo;
    private float carga_horaria;
    private int semestre;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the id_curso
     */
    public int getId_curso() {
        return id_curso;
    }

    
    /**
     * @param id_curso the id_curso to set
     */
    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    /**
     * @return the id_professor
     */
    public int getId_professor() {
        return id_professor;
    }

    
    /**
     * @param id_professor the id_professor to set
     */
    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    
    /**
     * @return the periodo
     */
    public int getPeriodo() {
        return periodo;
    }

    
    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
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
}
