package com.sofkaU.SofwareChallenge.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Module")
@Table(name = "module")
@Data
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Task> tasks = new ArrayList<>();

    public Module addTask(Task task) {
        this.tasks.add(task);
        return this;
    }
}
