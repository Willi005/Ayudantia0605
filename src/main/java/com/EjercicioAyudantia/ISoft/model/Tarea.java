package com.EjercicioAyudantia.ISoft.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarea {
    private long id;
    private String titulo;
    private String prioridad;
    private LocalDate fechaLimite;
    private boolean completada=false;
}
