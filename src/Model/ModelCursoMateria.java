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

public class ModelCursoMateria {
    
    private int id;
    private String nome_curso;
    private String nome_materia;
    private String periodo;
    private int carga_horaria;
    private String horario_inicio;
    private String horario_fim;
    private int semestre;
    private int ano;
    private int id_situacao;

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
    public int getCarga_horaria() {
        return carga_horaria;
    }

    /**
     * @param carga_horaria the carga_horaria to set
     */
    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    /**
     * @return the horario_inicio
     */
    public String getHorario_inicio() {
        return horario_inicio;
    }

    /**
     * @param horario_inicio the horario_inicio to set
     */
    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    /**
     * @return the horario_fim
     */
    public String getHorario_fim() {
        return horario_fim;
    }

    /**
     * @param horario_fim the horario_fim to set
     */
    public void setHorario_fim(String horario_fim) {
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

    /**
     * @return the id_situacao
     */
    public int getId_situacao() {
        return id_situacao;
    }

    /**
     * @param id_situacao the id_situacao to set
     */
    public void setId_situacao(int id_situacao) {
        this.id_situacao = id_situacao;
    }
}
