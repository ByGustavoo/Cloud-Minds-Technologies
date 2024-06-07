/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controller;

import DAO.ProfessorCursoDAO;
import Model.ModelProfessorMateria;
import java.util.List;

/**
 *
 * @author gustavo
 */

public class GradeCurricularController {
    
    
    ProfessorCursoDAO professorCursoDAO = new ProfessorCursoDAO();
    
    
    public List<ModelProfessorMateria> listaGradeCurricularController() {
        return this.professorCursoDAO.listarProfessorMateriaDAO();
    }
}
