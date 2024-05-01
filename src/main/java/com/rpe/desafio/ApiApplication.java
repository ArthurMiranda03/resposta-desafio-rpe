package com.rpe.desafio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    // Inicialização de alguns dados de exemplo
    @Bean
    CommandLineRunner initDatabase(VeiculoPasseioService passeioService, VeiculoCargaService cargaService) {
        return args -> {
            // Adiciona veículos de passeio de exemplo
            passeioService.save(new VeiculoPasseio("AAA-1234", "Modelo A", "Marca A", 5));
            passeioService.save(new VeiculoPasseio("BBB-5678", "Modelo B", "Marca B", 4));

            // Adiciona veículos de carga de exemplo
            cargaService.save(new VeiculoCarga("CCC-9101", "Modelo C", "Marca C", 2000.0, 2));
            cargaService.save(new VeiculoCarga("DDD-1121", "Modelo D", "Marca D", 3000.0, 3));
        };
    }
}