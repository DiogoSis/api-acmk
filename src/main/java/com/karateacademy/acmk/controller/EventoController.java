package com.karateacademy.acmk.controller;

import com.karateacademy.acmk.model.Evento;
import com.karateacademy.acmk.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController {
    @Autowired
    private EventoRepository eventoRepository;

    @PostMapping
    public Evento createEvento(@RequestBody Evento evento){
        return eventoRepository.save(evento);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> getEvento(@PathVariable Long id){
        return eventoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/eventos")
    public List<Evento> getAllEventos(){
        return eventoRepository.findAll();
    }
}
