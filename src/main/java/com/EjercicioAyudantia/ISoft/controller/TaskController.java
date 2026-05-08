package com.EjercicioAyudantia.ISoft.controller;

import com.EjercicioAyudantia.ISoft.model.Tarea;
import com.EjercicioAyudantia.ISoft.service.TaskFilterService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskFilterService taskFilterService;

    public TaskController(TaskFilterService taskFilterService) {
        this.taskFilterService = taskFilterService;
    }

    @GetMapping
    public ResponseEntity<List<Tarea>> getTasks(
            @RequestParam(required = false) String prioridad,
            @RequestParam(required = false) String titulo,
            @RequestParam(required = false) String fechaLimite) {

        List<Tarea> tareasFiltradas = taskFilterService.filterTasks(prioridad, titulo, fechaLimite);
        return ResponseEntity.ok(tareasFiltradas);
    }
}

