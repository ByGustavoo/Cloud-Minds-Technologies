/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DAO;

import Conexao.ConexaoPostgreSQL;
import Model.ModelCursoMateria;
import Model.ModelFuncionario;
import Model.ModelProfessorMateria;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author gustavo
 */

public class ProfessorCursoDAO extends ConexaoPostgreSQL {

    public List<ModelProfessorMateria> listarProfessorMateriaDAO() {

        List<ModelProfessorMateria> listarProfessorMateria = new ArrayList<>();
        conectar();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "select\n"
                + "    pm.id,\n"
                + "    f.id as id_professor,\n"
                + "    f.nome as nome_professor,\n"
                + "    cm.nome_curso,\n"
                + "    cm.nome_materia,\n"
                + "    cm.periodo,\n"
                + "    cm.carga_horaria,\n"
                + "    cm.horario_inicio,\n"
                + "    cm.horario_fim,\n"
                + "    cm.semestre,\n"
                + "    cm.ano \n"
                + "from\n"
                + "    professor_materia pm \n"
                + "join funcionario f on pm.id_funcionario = f.id \n"
                + "join curso_materia cm on pm.id_curso_materia = cm.id";

        try {
            preparedStatement = criarPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                ModelProfessorMateria modelProfessorMateria = new ModelProfessorMateria();
                ModelFuncionario modelFuncionario = new ModelFuncionario();
                ModelCursoMateria modelCursoMateria = new ModelCursoMateria();

                modelProfessorMateria.setId(resultSet.getInt("id"));
                modelFuncionario.setId(resultSet.getInt("id_professor"));
                modelFuncionario.setNome(resultSet.getString("nome_professor"));
                modelCursoMateria.setNome_curso(resultSet.getString("nome_curso"));
                modelCursoMateria.setNome_materia(resultSet.getString("nome_materia"));
                modelCursoMateria.setPeriodo(resultSet.getString("periodo"));
                modelCursoMateria.setCarga_horaria(resultSet.getInt("carga_horaria"));
                modelCursoMateria.setHorario_inicio(resultSet.getString("horario_inicio"));
                modelCursoMateria.setHorario_fim(resultSet.getString("horario_fim"));
                modelCursoMateria.setSemestre(resultSet.getInt("semestre"));
                modelCursoMateria.setAno(resultSet.getInt("ano"));

                modelProfessorMateria.setFuncionario(modelFuncionario);
                modelProfessorMateria.setCursoMateria(modelCursoMateria);

                listarProfessorMateria.add(modelProfessorMateria);
            }
        } 
        
        catch (Exception ex) {
            System.err.println(ex);
        } 
        
        finally {
            desconectar();
        }

        return listarProfessorMateria;
    }
}
