package com.karateacademy.acmk.repository;

import com.karateacademy.acmk.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Long> {}
