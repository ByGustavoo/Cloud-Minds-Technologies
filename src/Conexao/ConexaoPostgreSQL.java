/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gustavo
 */

public class ConexaoPostgreSQL {
    
    
    private Connection conexao;
    
    
    /**
     * Conecta a um Banco de Dados
     * @return
     */
    public boolean conectar() {
        
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String usuario = "postgres";
            String senha = "postgres";
            
            this.conexao = DriverManager.getConnection(url, usuario, senha);
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
        
        return true;
    }
    
    
    /**
     * Desconecta do Banco de Dados
     * @return 
     */
    public boolean desconectar() {
        
        try {
            if (this.conexao.isClosed() == false) {
                this.conexao.close();
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
        
        return true;
    }
    
    
    /**
     * Criam os Statements para os SQLs serem executados
     * @return 
     */
    public Statement criarStatement() {
        
        try {
            return this.conexao.createStatement();
        
        } catch (SQLException ex) {
             return null;
        }
    }
    
    
    /**
     * Criam os Statements para os SQLs serem executados
     * @param pSQL
     * @param RETURN_GENERATED_KEYS
     * @return 
     */
    public PreparedStatement criarPreparedStatement(String pSQL, int RETURN_GENERATED_KEYS) {
        
        try {
            return conexao.prepareStatement(pSQL, RETURN_GENERATED_KEYS);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
             System.err.println(ex.getMessage());
             return null;
        }
    }
    
    
    public Connection getConexao() {
        return this.conexao;
    }
    
    
    /**
     * Criam os Statements para os SQLs serem executados
     * @param sql
     * @return 
     */
    public PreparedStatement criarPreparedStatement(String sql) {
        
        try {
            return this.conexao.prepareStatement(sql);
            
        } catch (SQLException ex) {
            return null;
        }
    }
}
