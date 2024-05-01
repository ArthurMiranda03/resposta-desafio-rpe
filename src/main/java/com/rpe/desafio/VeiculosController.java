package com.rpe.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// Define esta classe como um controlador REST
@RestController
// Define o caminho base para este controlador, ou seja, http://localhost:8080/api/veiculos
@RequestMapping("/api/veiculos")
public class VeiculosController {
    @Autowired
    private VeiculoPasseioService passeioService;

    @Autowired
    private VeiculoCargaService cargaService;

    // Endpoint para obter todos os veículos de passeio e carga
    @GetMapping
    public Map<String, List<?>> getAllVeiculos() {
        Map<String, List<?>> result = new HashMap<>();
        result.put("veiculosPasseio", passeioService.findAll());
        result.put("veiculosCarga", cargaService.findAll());
        return result;
    }

    // Adicionar Veículo de Passeio
    @PostMapping("/passeio")
    public VeiculoPasseio createVeiculoPasseio(@RequestBody VeiculoPasseio veiculoPasseio) {
        return passeioService.save(veiculoPasseio);
    }

    // Adicionar Veículo de Carga
    @PostMapping("/carga")
    public VeiculoCarga createVeiculoCarga(@RequestBody VeiculoCarga veiculoCarga) {
        return cargaService.save(veiculoCarga);
    }

    // Consultar Veículo de Passeio
    @GetMapping("/passeio/{id}")
    public Optional<VeiculoPasseio> getVeiculoPasseioById(@PathVariable Long id) {
        return passeioService.findById(id);
    }

    // Consultar Veículo de Carga
    @GetMapping("/carga/{id}")
    public Optional<VeiculoCarga> getVeiculoCargaById(@PathVariable Long id) {
        return cargaService.findById(id);
    }

    // Alterar Veículo de Passeio
    @PutMapping("/passeio/{id}")
    public VeiculoPasseio updateVeiculoPasseio(@PathVariable Long id, @RequestBody VeiculoPasseio veiculoPasseio) {
        veiculoPasseio.setId(id); // Certifica-se de que o ID está correto
        return passeioService.save(veiculoPasseio);
    }

    // Alterar Veículo de Carga
    @PutMapping("/carga/{id}")
    public VeiculoCarga updateVeiculoCarga(@PathVariable Long id, @RequestBody VeiculoCarga veiculoCarga) {
        veiculoCarga.setId(id); // Certifica-se de que o ID está correto
        return cargaService.save(veiculoCarga);
    }

    // Remover Veículo de Passeio
    @DeleteMapping("/passeio/{id}")
    public void deleteVeiculoPasseio(@PathVariable Long id) {
        passeioService.deleteById(id);
    }

    // Remover Veículo de Carga
    @DeleteMapping("/carga/{id}")
    public void deleteVeiculoCarga(@PathVariable Long id) {
        cargaService.deleteById(id);
    }
}

