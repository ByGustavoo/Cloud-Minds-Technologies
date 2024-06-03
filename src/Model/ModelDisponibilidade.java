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

public class ModelDisponibilidade {
    
    private int id;
    private int id_funcionario;
    private int dia_semana;
    private LocalTime horario_inicio;
    private LocalTime horario_fim;

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
    
}
