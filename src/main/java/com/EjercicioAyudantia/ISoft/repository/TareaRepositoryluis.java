package com.EjercicioAyudantia.ISoft.repository;

import com.EjercicioAyudantia.ISoft.model.Tarea;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TareaRepositoryluis {
    private final List<Tarea> tareas = new ArrayList<>();
    private final AtomicLong generadorId = new AtomicLong(1);

    public Tarea guardar(Tarea t){
        t.setId(generadorId.getAndIncrement());
        t.setCompletada(false);
        tareas.add(t);
        return t;
    }
    public List<Tarea> findAll(){
        return tareas;
    }

}
