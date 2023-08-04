package aula0308b;

import java.sql.Connection;
import conexao.Conexao;
import java.sql.Statement;

public class Aula0308b {
    public static void main(String[] args) {
        Connection conn = Conexao.getConexao();
        try {
            String sql = "INSERT INTO aluno (nome,ra) VALUES ('Samuel', 'cv3015624')";
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Aluno cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }
    
}
