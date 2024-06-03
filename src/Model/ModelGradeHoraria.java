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

public class ModelGradeHoraria {
    
    private int id;
    private int id_curso;
    private int id_materia;
    private int id_professor;
    private LocalTime horario;
    private int dia_semana;
    private int ano;
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
     * @return the id_materia
     */
    public int getId_materia() {
        return id_materia;
    }

    
    /**
     * @param id_materia the id_materia to set
     */
    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
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
     * @return the horario
     */
    public LocalTime getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    
    /**
     * @return the dia_semana
     */
    public int getDia_semana() {
        return dia_semana;
    }

    
    /**
     * @param dia_semana the dia_semana to set
     */
    public void setDia_semana(int dia_semana) {
        this.dia_semana = dia_semana;
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
