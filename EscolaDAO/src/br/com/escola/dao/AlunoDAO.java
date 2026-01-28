/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.dao;

import br.com.escola.config.ConnectionFactory;
import br.com.escola.model.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author EDUARDACRISTINADOSSA
 */

// responsabilidade: SQL + CRUD
public class AlunoDAO {
    // CREATE: inserir o aluno no banco
    public void cadastrar(Aluno aluno) {
        // SQL com ? (parâmetro para evitar SQL injection)
        String sql = "INSERT INTO alunos (nome) VALUES (?)";
        // tratamento de possíveis erros | no caso fecha automaticamente a conexão e o statement
        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            // troca o ? pelo nome do aluno
            stmt.setString(1, aluno.getNome());
            // executa o INSERT (podemos utilizar o executeUpdate para INSERT/UPDATE/DELETE)
            stmt.executeUpdate();
        } catch (Exception e) {
            // se der erro, mostramos uma mensagem clara
            throw new RuntimeException("Erro ao cadastrar aluno", e);
        }
    }
    // READ: listar todos alunos
    public List<Aluno> listar() {
        // SQL para buscar todos
        String sql = "SELECT id, nome FROM alunos";
        // lista qye vamos devolver preenchida
        List<Aluno> alunos = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {
            // enquanto tiver linha de resultado
            while (rs.next()) {
                // pega os dados da linha atual
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                // monta um objeto Aluno com os dados
                Aluno aluno = new Aluno(id, nome);
                // adiciona na lista
                alunos.add(aluno);
            } 
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar os alunos", e);
        }
        // devolve a lista pronta
        return alunos;
    }
}
