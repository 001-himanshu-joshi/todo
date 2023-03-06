package com.example.todo.service;


import com.example.todo.dao.ToDORepository;
import com.example.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


@Service
public class TodoService {

    @Autowired
    ToDORepository toDORepository;

    public void addTodo(Todo todo) {
        toDORepository.save(todo);
    }

    public List<Todo> findAll() {
       return toDORepository.findAll();
    }

    public Todo findById(int id) {
       Todo todo = toDORepository.findById(id).get();
       return todo;
    }
    public void updateTodo(int id,Todo newTodo) {
        Todo todo = toDORepository.findById(id).get();
        todo.setId(newTodo.getId());
        todo.setTitle(newTodo.getTitle());
        todo.setStatus(newTodo.isStatus());
    }

    public void deleteTodo(int id) {
        toDORepository.deleteById(id);
    }
}



















// return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//return new ResponseEntity<>(todoService.getTodoById(todoId), HttpStatus.OK);
//return new ResponseEntity<>(todo, HttpStatus.CREATED);
/*

{
    "id":100,
    "title": "Buy eggs from supermarket",
    "status": false
}

Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;

Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);

 */