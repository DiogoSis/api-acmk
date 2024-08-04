package com.karateacademy.acmk.controller;

import com.karateacademy.acmk.model.Pagamento;
import com.karateacademy.acmk.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {
    @Autowired
    private PagamentoRepository pagamentoRepository;

    @PostMapping
    private Pagamento createPagamento (@RequestBody Pagamento pagamento){
        return pagamentoRepository.save(pagamento);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pagamento>getPagamento(@PathVariable Long id){
        return pagamentoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
