package com.tinnova.exercicio5.exercicio5.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.tinnova.exercicio5.exercicio5.DTO.VeiculoDTO;
import com.tinnova.exercicio5.exercicio5.entity.Veiculo;

public interface VeiculoService {
	List<VeiculoDTO> getAllVeiculos(); 
	List<VeiculoDTO> getVeiculosPorParametro(String marca, Long ano, String cor);
	VeiculoDTO getVeiculosById(Long id);
	VeiculoDTO saveVeiculo(Veiculo veiculo);
	void deletarVeiculo(Long id);
	ResponseEntity<VeiculoDTO> atualizarVeiculoPut(Long id, Veiculo veiculo);
	ResponseEntity<VeiculoDTO> atualizarVeiculoPatch(Long id, String marca);



}
