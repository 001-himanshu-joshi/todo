package com.example.todo.dao;

import com.example.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDORepository extends JpaRepository<Todo, Integer> {
}
