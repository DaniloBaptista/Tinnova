package com.tinnova.exercicio5.exercicio5.entity;



import java.sql.Date;
import java.util.Calendar;

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
    private Calendar created;
    private Calendar updated;
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

	public Veiculo(Long id, String veiculo, String marca, Long ano, String descricao, Long vendido, Calendar created,
			Calendar updated, String cor) {
		super();
		this.id = id;
		this.veiculo = veiculo;
		this.marca = marca;
		this.ano = ano;
		this.descricao = descricao;
		this.vendido = vendido;
		this.created = created;
		this.updated = updated;
		this.cor = cor;
	}
	
	
    


    
    
}
