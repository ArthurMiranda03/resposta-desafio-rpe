package com.rpe.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoPasseioService {

    @Autowired
    private VeiculoPasseioRepository repository;

    public List<VeiculoPasseio> findAll() {
        return repository.findAll();
    }

    public Optional<VeiculoPasseio> findById(Long id) {
        return repository.findById(id);
    }

    public VeiculoPasseio save(VeiculoPasseio veiculoPasseio) {
        return repository.save(veiculoPasseio);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}