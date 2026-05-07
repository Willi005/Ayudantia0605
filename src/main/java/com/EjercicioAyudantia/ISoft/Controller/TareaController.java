package com.EjercicioAyudantia.ISoft.Controller;

import com.EjercicioAyudantia.ISoft.model.Tarea;
import com.EjercicioAyudantia.ISoft.service.TareaServicioluis;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TareaController {
    private final TareaServicioluis tareaServicioluis;

    public TareaController(TareaServicioluis tareaServicioluis) {
        this.tareaServicioluis = tareaServicioluis;
    }

    @PostMapping
    public ResponseEntity<Tarea> postTask(@RequestBody Tarea t){
        Tarea tareaCreada = tareaServicioluis.crearTarea(t);
        return new ResponseEntity<>(tareaCreada, HttpStatus.CREATED);
    }
}
