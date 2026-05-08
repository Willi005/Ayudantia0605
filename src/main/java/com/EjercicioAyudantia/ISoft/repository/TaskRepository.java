package com.EjercicioAyudantia.ISoft.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.EjercicioAyudantia.ISoft.model.Tarea;

@Repository
public class TaskRepository {

    private final List<Tarea> tareas = new ArrayList<>();

    public List<Tarea> findAll() {
        return tareas;
    }

    public Tarea save(Tarea tarea) {
        int id = tareas.size() + 1;
        tarea.setId(id);
        tareas.add(tarea);
        return tarea;
    }
}