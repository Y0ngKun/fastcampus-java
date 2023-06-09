package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoEntity add (TodoRequest todoRequest){
        TodoEntity todoEntity = new TodoEntity();
        todoEntity.setTitle(todoRequest.getTitle());
        todoEntity.setOrder(todoRequest.getOrder());
        todoEntity.setCompleted(todoRequest.getCompleted());

        return this.todoRepository.save(todoEntity);
    }



    public TodoEntity searchById(Long id){
       return this.todoRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public List<TodoEntity> searchAll(){

        return this.todoRepository.findAll();
    }

    public TodoEntity updateById(Long id, TodoRequest todoRequest){
        TodoEntity todoEntity = this.searchById(id);
        if (todoRequest.getTitle() != null){
            todoEntity.setTitle(todoRequest.getTitle());
        }
        if (todoRequest.getOrder() != null){
            todoEntity.setOrder(todoRequest.getOrder());
        }
        if (todoRequest.getCompleted() != null){
            todoEntity.setCompleted(todoRequest.getCompleted());
        }
        return this.todoRepository.save(todoEntity);

    }

    public void deleteById(Long id){
        this.todoRepository.deleteById(id);
    }


    public void deleteAll(){
        this.todoRepository.deleteAll();
    }
}
