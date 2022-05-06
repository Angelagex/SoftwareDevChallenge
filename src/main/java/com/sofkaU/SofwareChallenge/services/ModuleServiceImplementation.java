package com.sofkaU.SofwareChallenge.services;

import com.sofkaU.SofwareChallenge.entities.Module;
import com.sofkaU.SofwareChallenge.entities.Task;
import com.sofkaU.SofwareChallenge.repositories.ModuleRepository;
import com.sofkaU.SofwareChallenge.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImplementation implements ModuleService{

    @Autowired
    private ModuleRepository moduleRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Module createModule(Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public Module createTask(Task task) {
        Module module = moduleRepository.findById(task.getFkModuleId()).get();
        module.addTask(task);
        taskRepository.save(task);
        return moduleRepository.save(module);
    }

    @Override
    public Module updateModule(Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public Module updateTask(Task task) {
        Module module = moduleRepository.findById(task.getFkModuleId()).get();
        //taskRepository.deleteById(task.getId());
        module.addTask(task);
        taskRepository.save(task);
        return moduleRepository.save(module);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public void deleteModule(Long id) {
        Module moduleToDelete = moduleRepository.findById(id).get();
        if(moduleToDelete.getTasks().size() > 0 ){
            moduleToDelete.getTasks().forEach(task -> taskRepository.deleteById(task.getId()));
        }
    }

    @Override
    public List<Module> getAllModules() {
        return moduleRepository.findAll();
    }
}
