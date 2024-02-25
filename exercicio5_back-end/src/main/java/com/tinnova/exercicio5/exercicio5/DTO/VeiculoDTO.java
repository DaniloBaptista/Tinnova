package com.tinnova.exercicio5.exercicio5.DTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VeiculoDTO {
    private Long id;
    private String veiculo;
    private String marca;
    private Long ano;
    private String descricao;
    private Long vendido;
    private Date created;
    private Date updated;
    private String cor;
    
    public VeiculoDTO(String veiculo, String marca) {
		super();
		this.veiculo = veiculo;
		this.marca = marca;
	}
}

