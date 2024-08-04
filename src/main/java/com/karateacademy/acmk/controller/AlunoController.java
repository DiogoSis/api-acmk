package com.karateacademy.acmk.controller;

import com.karateacademy.acmk.model.Aluno;
import com.karateacademy.acmk.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Aluno> getAluno(@PathVariable Long id){
        return alunoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/alunos")
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }
}
