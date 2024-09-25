# Desafio sistema de gerenciamento de tarefas (To-Do List)
Repositório para ser usado pelos candidatos à vaga de Desenvolvedor Júnior Backend Liferay da Simplify

# Como usar

## Inicialmente a base de dados estará vazia. O app usa H2.

## - Para listar itens: GET - http://localhost:8080/api/todos
## - Para criar itens: POST - http://localhost:8080/api/todos (Corpo do item num body JSON no formato: { "name": "teste2", "description": "testando create", "priority": 3 })
## - Para alterar estado (feito ou não feito): PATCH - http://localhost:8080/api/todos/{idDoTodo}/status
## - Para alterar nível de prioridade de um item: PATCH - http://localhost:8080/api/todos/{idDoTodo}/priority?priority={novoNivelDePrioridade}


## Descrição
- Desenvolva uma aplicação web utilizando uma linguagem de programação e um framework de sua escolha. A aplicação deve consistir em um sistema de gerenciamento de tarefas, onde os usuários podem criar, visualizar, editar e excluir tarefas.
## Requisitos
- Usar banco de dados
- Campos mínimos da entidade de tarefa
    - Nome
    - Descrição
    - Realizado
    - Prioridade
- Criar CRUD de tarefas
## Instruções
- Fazer um fork do repositório para sua conta pessoal do git
- Trabalhar utilizando commits
- Documentar como executar sua aplicação
- Descrever as funcionalidades do software
