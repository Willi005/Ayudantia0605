package com.EjercicioAyudantia.ISoft.service;

import com.EjercicioAyudantia.ISoft.model.Tarea;
import com.EjercicioAyudantia.ISoft.repository.TareaRepositoryluis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaServicioluis {
    private final TareaRepositoryluis tareaRepositoryluis;

    public TareaServicioluis(TareaRepositoryluis tareaRepositoryluis) {
        this.tareaRepositoryluis = tareaRepositoryluis;
    }

    public Tarea crearTarea(Tarea t){
        return tareaRepositoryluis.guardar(t);
    }


}
