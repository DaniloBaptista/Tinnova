package com.tinnova.exercicio5.exercicio5.entity;



import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Veiculos")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String veiculo;
    private String marca;
    private Long ano;
    private String descricao;
    private Long vendido;
    private Date created;
    private Date updated;
    private String cor;
    
	public Veiculo(String marca,String veiculo) {
		super();
		this.veiculo = veiculo;
		this.marca = marca;
	}

	public Veiculo(String veiculo, String marca, Long ano, String descricao, Long vendido, String cor) {
		super();
		this.veiculo = veiculo;
		this.marca = marca;
		this.ano = ano;
		this.descricao = descricao;
		this.vendido = vendido;
		this.cor = cor;
	}
    


    
    
}
