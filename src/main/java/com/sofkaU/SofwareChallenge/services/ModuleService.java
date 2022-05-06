package com.sofkaU.SofwareChallenge.services;

import com.sofkaU.SofwareChallenge.entities.Module;
import com.sofkaU.SofwareChallenge.entities.Task;

import java.util.List;

public interface ModuleService {

    Module createModule(Module module);

    Module createTask(Task task);

    Module updateModule(Module note);

    Module updateTask(Task task);

    void deleteTask(Long id);

    void deleteModule(Long id);

    List<Module> getAllModules();

}
