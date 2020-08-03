package com.example.springboot.restful.full_stack.todo;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository stockRepository;

    public TodoService() {
        stockRepository = null;
    }

    public List<Todo> findAll() {return stockRepository.findAll(); }
    public List<Todo> saveAll(List<Todo> todos) {return stockRepository.saveAll(todos);}
}
