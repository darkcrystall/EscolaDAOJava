# Projeto Escola utilizando DAO - Java + JDBC

Este projeto foi desenvolvido para demonstrar na prática como funciona a **arquitetura em camadas** utilizando **Java** e **MySQL** aplicando o padrão **DAO (Data Access Object)**.

O sistema permite cadastrar alunos e listar armazenando-os em um banco de dados.

--- 

## Objetivos do projeto

- Separar as responsabilidades no código
- Demonstrar a comunicação entre Java e Banco de Dados
- Aplicar boas práticas como:
- DAO
- Model
- Factory de conexão
- Evitar SQl Injection
- Facilitar a manutenção e evolução do sistema

--- 

## Estrutura do Projeto

<img width="576" height="188" alt="image" src="https://github.com/user-attachments/assets/72dd5d71-13ad-4934-9640-09bbaa5b62f8" />

---

## Descrição das Camadas

- Main (app)

  Responsável por:
  
  Interagir com o usuário via console

  Receber dados

  Chamar o DAO para salvar e listar alunos

  Não contém SQL, apenas regras de fluxo da aplicação

  ---

- Aluno (model)

  Representa a tabela alunos do banco de dados.

  Contém:

  Atributos (id, nome)

  Construtores

  Getters e Setters

  ---
  
- AlunoDAO (dao)

  Responsável por:

  Executar comandos SQL

  Fazer operações CRUD

  Converter dados do banco em objetos Java

  Métodos:

  cadastrar(Aluno aluno)

  listar()

  Centraliza toda a lógica de acesso ao banco.

  ---
  
- ConnectionFactory (config)

  Responsável por:

  Criar e fornecer conexões com o banco de dados

  Centralizar URL, usuário e senha

  Facilita manutenção e evita repetição de código.

  ---
  
## Importância do Padrão DAO

O padrão DAO (Data Access Object) é importante porque:

Separa regras de negócio do acesso ao banco

Facilita testes

Permite trocar o banco sem alterar o restante do sistema

Torna o código mais organizado e profissional

É amplamente usado no mercado de trabalho

  
