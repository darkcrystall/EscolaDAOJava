/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.model;

/**
 *
 * @author EDUARDACRISTINADOSSA
 */

// responsabilidade: representar os dados da tabela dos alunos
public class Aluno {
    // colunas da tabela
    private int id;
    private String nome;
    // construtor vazio (útil em vários casos)
    public Aluno() {}
    // construtor para criar um aluno novo (sem id ainda)
    public Aluno(String nome) {
        this.nome = nome;
    }
    // construtor para quando vem do banco (já tem o id)
    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    // getter e setter do id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // getter e setter do nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }   
}
