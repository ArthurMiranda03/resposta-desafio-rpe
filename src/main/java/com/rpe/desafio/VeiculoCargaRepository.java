package com.rpe.desafio;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface do repositório para a entidade VeiculoCarga, usando JpaRepository
public interface VeiculoCargaRepository extends JpaRepository<VeiculoCarga, Long> {
}