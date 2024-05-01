package com.rpe.desafio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

// Marca a classe como uma entidade JPA
@Entity
// Define sequência para geração de IDs
@SequenceGenerator(name = "carga_seq", sequenceName = "carga_sequence", allocationSize = 1)
public class VeiculoCarga {

    // Define o ID da entidade e especifica a geração automática de valores
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carga_seq")
    private Long id;
    private String placa;
    private String nome;
    private String marca;
    private double capacidade;
    private int quantidadeCarroceria;

    // Construtor padrão
    public VeiculoCarga() {}

    // Construtor parametrizado
    public VeiculoCarga(String placa, String nome, String marca, double capacidade, int quantidadeCarroceria) {
        this.placa = placa;
        this.nome = nome;
        this.marca = marca;
        this.capacidade = capacidade;
        this.quantidadeCarroceria = quantidadeCarroceria;
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

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadeCarroceria() {
        return quantidadeCarroceria;
    }

    public void setQuantidadeCarroceria(int quantidadeCarroceria) {
        this.quantidadeCarroceria = quantidadeCarroceria;
    }
}