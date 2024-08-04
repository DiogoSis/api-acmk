package com.karateacademy.acmk.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeEvento;
    private LocalDate dataEvento;
    private String local;
    private String descricao;
}
