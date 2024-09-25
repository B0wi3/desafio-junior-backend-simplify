package com.bowie.desafio.service;

import com.bowie.desafio.entity.Todo;
import com.bowie.desafio.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> list() {
            return todoRepository.findAll();
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return todoRepository.findAll();
    }

    public List<Todo> updateStatus(Long id) {
        Optional<Todo> opTodo = todoRepository.findById(id);
        if (opTodo.isPresent()) {
            Todo todo = opTodo.get();
            updateDone(todo);
            todoRepository.save(todo);
        }
        return todoRepository.findAll();
    }

    public List<Todo> updatePriority(Long id, int priority) {
        Optional<Todo> opTodo = todoRepository.findById(id);
        if (opTodo.isPresent()) {
            Todo todo = opTodo.get();
            updatePriority(todo, priority);
            todoRepository.save(todo);
        }
        return todoRepository.findAll();
    }

    public List<Todo> delete(Long id) {
        Optional<Todo> opTodo = todoRepository.findById(id);
        if (opTodo.isPresent()) {
            todoRepository.delete(opTodo.get());
        }
        return todoRepository.findAll();
    }

    private Todo updateDone(Todo todo) {
        if (todo.isDone()) {
            todo.setDone(false);
            return todo;
        } else {
            todo.setDone(true);
            return todo;
        }
    }

    private Todo updatePriority(Todo todo, int priority) {
        todo.setPriority(priority);
        return todo;
    }

}
