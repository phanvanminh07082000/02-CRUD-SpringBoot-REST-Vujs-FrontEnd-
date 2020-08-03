package com.example.springboot.restful.full_stack.todo;


import com.sun.istack.NotNull;
import lombok.Data;
import org.assertj.core.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.hibernate.annotations.NotFound;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 100)
    private String title;
    private boolean completed;
    private Date updateDate = new Date();
}
