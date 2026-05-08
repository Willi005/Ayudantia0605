package com.EjercicioAyudantia.ISoft.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class RequestTaskDTO {
    private String titulo;
    private String prioridad;
    private LocalDate fechaLimite;
}
