/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

import java.time.LocalTime;

/**
 *
 * @author gustavo
 */

public class ModelGradeCurricular {
    
    private int id;
    private int id_funcionario;
    private String nome_curso;
    private String nome_materia;
    private String periodo;
    private float carga_horaria;
    private LocalTime horario_inicio;
    private LocalTime horario_fim;
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
     * @return the id_funcionario
     */
    public int getId_funcionario() {
        return id_funcionario;
    }

    /**
     * @param id_funcionario the id_funcionario to set
     */
    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
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
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
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
     * @return the horario_inicio
     */
    public LocalTime getHorario_inicio() {
        return horario_inicio;
    }

    /**
     * @param horario_inicio the horario_inicio to set
     */
    public void setHorario_inicio(LocalTime horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    /**
     * @return the horario_fim
     */
    public LocalTime getHorario_fim() {
        return horario_fim;
    }

    /**
     * @param horario_fim the horario_fim to set
     */
    public void setHorario_fim(LocalTime horario_fim) {
        this.horario_fim = horario_fim;
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
