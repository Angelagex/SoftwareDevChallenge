package com.sofkaU.SofwareChallenge.controller;


import com.sofkaU.SofwareChallenge.entities.Module;
import com.sofkaU.SofwareChallenge.entities.Task;
import com.sofkaU.SofwareChallenge.services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private ModuleService service;

    @GetMapping
    public List<Module> getModules() { return service.getAllModules(); }

    @PostMapping("create/module")
    public Module createModule(@RequestBody Module module){
        return service.createModule(module);
    }

    @PostMapping("create/task")
    public Module createTask(@RequestBody Task task){
        return service.createTask(task);
    }

    @PutMapping("update/module")
    public Module updateModule(@RequestBody Module module) { return service.updateModule(module);}

    @PutMapping("update/task")
    public Module updateTask(@RequestBody Task task) { return service.updateTask(task);}

    @DeleteMapping("delete/module/{id}")
    public void deleteModule(@PathVariable Long id){
        service.deleteModule(id);
    }
    @DeleteMapping("delete/task/{id}")
    public void deleteTask(@PathVariable Long id){
        service.deleteTask(id);
    }
}
