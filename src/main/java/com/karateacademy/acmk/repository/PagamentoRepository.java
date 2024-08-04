package com.karateacademy.acmk.repository;

import com.karateacademy.acmk.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository <Pagamento, Long> {}
