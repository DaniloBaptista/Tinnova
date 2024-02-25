package com.tinnova.exercicio5.exercicio5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tinnova.exercicio5.exercicio5.entity.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
	
	@Query("SELECT v FROM Veiculo v WHERE v.marca = :marca AND v.ano = :ano AND v.cor =:cor")
	public List<Veiculo> getVeiculosPorParametro(@Param("marca") String marca,
            @Param("ano") Long ano,
            @Param("cor") String cor);
}
