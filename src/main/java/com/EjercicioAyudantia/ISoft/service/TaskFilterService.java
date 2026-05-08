package com.EjercicioAyudantia.ISoft.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.EjercicioAyudantia.ISoft.model.Tarea;
import com.EjercicioAyudantia.ISoft.repository.TaskRepository;

@Service
public class TaskFilterService {

    private final TaskRepository tareaRepository;

    public TaskFilterService(TaskRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public List<Tarea> filterTasks(String prioridad, String titulo, String fechaLimite) {
        List<Tarea> tareasFiltradas = new ArrayList<>();

        for (Tarea t : tareaRepository.findAll()) {
            if (prioridad != null && (t.getPrioridad() == null || !t.getPrioridad().equalsIgnoreCase(prioridad))) {
                continue;
            }

            if (titulo != null && (t.getTitulo() == null || !t.getTitulo().toLowerCase().contains(titulo.toLowerCase()))) {
                continue;
            }
            
            if (fechaLimite != null && (t.getFechaLimite() == null || !t.getFechaLimite().toString().equals(fechaLimite))) {
                continue;
            }

            tareasFiltradas.add(t);
        }
        return tareasFiltradas;
    }
}
