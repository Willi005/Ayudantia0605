package com.EjercicioAyudantia.ISoft.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Tarea {
    private long id;
    private String titulo;
    private String prioridad;
    private String fechaLimite;
    private boolean completada=false;
}
