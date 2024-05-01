package com.rpe.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoCargaService {

    @Autowired
    private VeiculoCargaRepository repository;

    public List<VeiculoCarga> findAll() {
        return repository.findAll();
    }

    public Optional<VeiculoCarga> findById(Long id) {
        return repository.findById(id);
    }

    public VeiculoCarga save(VeiculoCarga veiculoCarga) {
        return repository.save(veiculoCarga);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}