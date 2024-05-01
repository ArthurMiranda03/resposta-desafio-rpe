package com.rpe.desafio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

// Marca a classe como uma entidade JPA
@Entity
// Define sequência para geração de IDs
@SequenceGenerator(name = "passeio_seq", sequenceName = "passeio_sequence", allocationSize = 1)
public class VeiculoPasseio {

    // Define o ID da entidade e especifica a geração automática de valores
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passeio_seq")
    private Long id;
    private String placa;
    private String nome;
    private String marca;
    private int numeroPassageiros;

    // Construtor padrão
    public VeiculoPasseio() {}

    // Construtor parametrizado
    public VeiculoPasseio(String placa, String nome, String marca, int numeroPassageiros) {
        this.placa = placa;
        this.nome = nome;
        this.marca = marca;
        this.numeroPassageiros = numeroPassageiros;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
}
