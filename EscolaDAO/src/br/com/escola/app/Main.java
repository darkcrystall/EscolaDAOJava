/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.app;

import br.com.escola.model.Aluno;
import br.com.escola.dao.AlunoDAO;
import java.util.Scanner;

/**
 *
 * @author EDUARDACRISTINADOSSA
 */

// responsabilidade: usar o DAO e receber dados do usuário
public class Main {
    public static void main(String[] args) {
        // Scanner = entrada de dados (nosso prompt pro Java)
        Scanner sc = new Scanner(System.in);
        // DAO = quem conversa com o banco 
        AlunoDAO dao = new AlunoDAO();
        System.out.println("Quantos alunos deseja cadastrar? ");
        int qt = sc.nextInt();
        sc.nextLine();
        // loop para cadastrar os alunos
        for(int i = 1; i <= qt; i++) {
            System.out.println("Digite o nome do aluno " + i + ":");
            String nome = sc.nextLine();
            // cria o aluno (model)
            Aluno aluno = new Aluno(nome);
            // envia para o DAO salvar no banco
            dao.cadastrar(aluno);
            // lista os alunos cadastrados 
            System.out.println("\n === Alunos cadastrados ===\n");
            dao.listar().forEach(alunos -> {
                System.out.println(alunos.getId() + " - " + alunos.getNome());
            });
            sc.close();
        }
    }
}
