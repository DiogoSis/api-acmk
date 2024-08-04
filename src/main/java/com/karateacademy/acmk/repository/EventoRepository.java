package com.karateacademy.acmk.repository;

import com.karateacademy.acmk.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository <Evento, Long> {}
