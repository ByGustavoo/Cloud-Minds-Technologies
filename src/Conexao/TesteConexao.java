/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

/**
 *
 * @author gustavo
 */
public class TesteConexao {
   

    public static void main(String[] args) {
        ConexaoPostgreSQL conexao = new ConexaoPostgreSQL();

        // Tente conectar ao banco de dados
        if (conexao.conectar()) {
            System.out.println("Conexão bem-sucedida!");

            // Tente desconectar do banco de dados
            if (conexao.desconectar()) {
                System.out.println("Desconexão bem-sucedida!");
            } else {
                System.err.println("Falha ao desconectar.");
            }
        } else {
            System.err.println("Falha na conexão.");
        }
    }
}


