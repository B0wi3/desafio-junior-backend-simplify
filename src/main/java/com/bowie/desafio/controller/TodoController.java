package com.bowie.desafio.controller;

import com.bowie.desafio.entity.Todo;
import com.bowie.desafio.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> listTodos() {
        return todoService.list();
    }

    @PostMapping
    public List<Todo> createTodo(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @PatchMapping("/{id}/status")
    public List<Todo> updateTodoStatus(@PathVariable Long id) {
        return todoService.updateStatus(id);
    }

    @PatchMapping("/{id}/priority")
    public List<Todo> updateTodoPriority(@PathVariable Long id, @RequestParam int priority) {
        return todoService.updatePriority(id, priority);
    }

    @DeleteMapping("/{id}")
    public List<Todo> deleteTodo(@PathVariable Long id) {
        return todoService.delete(id);
    }

}
