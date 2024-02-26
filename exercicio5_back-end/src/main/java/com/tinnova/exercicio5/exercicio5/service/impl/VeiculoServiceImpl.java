package com.tinnova.exercicio5.exercicio5.service.impl;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tinnova.exercicio5.exercicio5.DTO.VeiculoDTO;
import com.tinnova.exercicio5.exercicio5.entity.Veiculo;
import com.tinnova.exercicio5.exercicio5.repository.VeiculoRepository;
import com.tinnova.exercicio5.exercicio5.service.VeiculoService;
import com.tinnova.exercicio5.exercicio5.service.mappers.VeiculoMapperService;

@Service
public class VeiculoServiceImpl implements VeiculoService {
	@Autowired
	private VeiculoRepository veiculoRepository;
	@Autowired
	private VeiculoMapperService veiculoMapperService;

	@Override
	public List<VeiculoDTO> getAllVeiculos() {
		return veiculoRepository.findAll().stream().map(veiculoMapperService::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public List<VeiculoDTO> getVeiculosPorParametro(String marca, Long ano, String cor) {
		return veiculoRepository.getVeiculosPorParametro(marca, ano, cor).stream()
				.map(veiculoMapperService::convertToDto).collect(Collectors.toList());
	}

	@Override
	public VeiculoDTO getVeiculosById(Long id) {
		return veiculoMapperService.convertToDto(veiculoRepository.getById(id));
	}

	@Override
	public VeiculoDTO saveVeiculo(Veiculo veiculo) {
		long millisAtual = System.currentTimeMillis();
		veiculo.setUpdated(Calendar.getInstance());
		veiculo.setCreated(Calendar.getInstance());
		return veiculoMapperService.convertToDto(veiculoRepository.save(veiculo));
	}

	@Override
	public void deletarVeiculo(Long id) {
		veiculoRepository.deleteById(id);
	}

	@Override
	public ResponseEntity<VeiculoDTO> atualizarVeiculoPut(Long id, Veiculo veiculoRecebido) {
		Veiculo veiculoExistente = veiculoRepository.getById(id);

		if (veiculoExistente == null) {
			return ResponseEntity.notFound().build();
		}
		Veiculo veic = this.setarObjetoAtualizado(veiculoRecebido, veiculoExistente);

		return ResponseEntity.ok(veiculoMapperService.convertToDto(veic));
	}

	@Override
	public ResponseEntity<VeiculoDTO> atualizarVeiculoPatch(Long id, String marca) {
		Veiculo veiculoExistente = veiculoRepository.getById(id);

		if (veiculoExistente == null) {
			return ResponseEntity.notFound().build();
		}
		veiculoExistente.setMarca(marca);
		veiculoRepository.save(veiculoExistente);
		return ResponseEntity.ok(veiculoMapperService.convertToDto(veiculoExistente));
	}

	
	public Veiculo setarObjetoAtualizado(Veiculo veiculo, Veiculo veiculoExistente) {
		veiculoExistente.setVeiculo(veiculo.getVeiculo());
		veiculoExistente.setMarca(veiculo.getMarca());
		veiculoExistente.setAno(veiculo.getAno());
		veiculoExistente.setDescricao(veiculo.getDescricao());
		veiculoExistente.setVendido(veiculo.getVendido());
		veiculoExistente.setCreated(Calendar.getInstance());
		veiculoExistente.setUpdated(Calendar.getInstance());
		veiculoExistente.setCor(veiculo.getCor());
		return veiculoExistente;
	}
}
