package com.tinnova.exercicio5.exercicio5.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tinnova.exercicio5.exercicio5.DTO.VeiculoDTO;
import com.tinnova.exercicio5.exercicio5.entity.Veiculo;
import com.tinnova.exercicio5.exercicio5.service.VeiculoService;
import com.tinnova.exercicio5.exercicio5.service.mappers.VeiculoMapperService;

@RestController
@RequestMapping("/api")
public class veiculoController {

	@Autowired
	private VeiculoService veiculoService;

	@Autowired
	private VeiculoMapperService veiculoMapperService;

	@GetMapping("/veiculos")
	public List<VeiculoDTO> getAllVeiculos() {
		return veiculoService.getAllVeiculos();
	}

	@GetMapping("/veiculos-parametros")
	public List<VeiculoDTO> getVeiculosByParametro(@RequestParam(name = "marca") String marca,
			@RequestParam(name = "ano") Long ano, @RequestParam(name = "cor") String cor) {

		return veiculoService.getVeiculosPorParametro(marca, ano, cor);
	}

	@GetMapping("/veiculos-by-id")
	public VeiculoDTO getVeiculosById(@RequestParam(name = "id") Long id) {

		return veiculoService.getVeiculosById(id);
	}

	@PostMapping(path = "/veiculos", consumes = "application/json")
	public ResponseEntity<VeiculoDTO> adicionarVeiculo(@RequestBody Veiculo veiculo) {
		return new ResponseEntity<>(veiculoService.saveVeiculo(veiculo), HttpStatus.CREATED);
	}

	@DeleteMapping("/veiculo-deletar")
	public ResponseEntity<VeiculoDTO> deletarVeiculo(@RequestParam(name = "id") Long id) {
		veiculoService.deletarVeiculo(id);
		return ResponseEntity.ok().build();

	}

	@PutMapping(path = "/veiculo", consumes = "application/json")
	public ResponseEntity<VeiculoDTO> atualizarVeiculoPut(@RequestParam(name = "id") Long id,
			@RequestBody Veiculo veiculo) {
		veiculoService.atualizarVeiculoPut(id, veiculo);
		return ResponseEntity.ok().build();

	}

	@PatchMapping(path = "/veiculo", consumes = "application/json")
	public ResponseEntity<VeiculoDTO> atualizarVeiculoPatch(@RequestParam(name = "id") Long id,
			@RequestBody Veiculo veiculo) {
		veiculoService.atualizarVeiculoPatch(id, veiculo.getMarca());
		return ResponseEntity.ok().build();

	}
}
