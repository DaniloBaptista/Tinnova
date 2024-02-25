package com.tinnova.exercicio5.exercicio5;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tinnova.exercicio5.exercicio5.DTO.VeiculoDTO;
import com.tinnova.exercicio5.exercicio5.entity.Veiculo;
import com.tinnova.exercicio5.exercicio5.repository.VeiculoRepository;
import com.tinnova.exercicio5.exercicio5.service.VeiculoService;
import com.tinnova.exercicio5.exercicio5.service.impl.VeiculoServiceImpl;
import com.tinnova.exercicio5.exercicio5.service.mappers.VeiculoMapperService;

public class VeiculoServiceImplTest {
	
	
	@Mock
    private VeiculoRepository veiculoRepository;

    @Mock
    private VeiculoMapperService veiculoMapperService;

    @InjectMocks
    private VeiculoServiceImpl veiculoService;
    
    public VeiculoServiceImplTest() {
        MockitoAnnotations.initMocks(this);
    }
	
    @Test
    public void testGetAllVeiculos() {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Veiculo("Ford", "Fiesta"));
        veiculos.add(new Veiculo("Toyota", "Corolla"));

        List<VeiculoDTO> veiculoDTOs = new ArrayList<>();
        veiculoDTOs.add(new VeiculoDTO("Ford", "Fiesta"));
        veiculoDTOs.add(new VeiculoDTO("Toyota", "Corolla"));

        when(veiculoRepository.findAll()).thenReturn(veiculos);

        when(veiculoMapperService.convertToDto(veiculos.get(0))).thenReturn(veiculoDTOs.get(0));
        when(veiculoMapperService.convertToDto(veiculos.get(1))).thenReturn(veiculoDTOs.get(1));

        List<VeiculoDTO> resultado = veiculoService.getAllVeiculos();

        assertEquals(2, resultado.size());
        assertEquals("Ford", resultado.get(1).getMarca());
        assertEquals("Fiesta", resultado.get(1).getVeiculo());
        assertEquals("Toyota", resultado.get(0).getMarca());
        assertEquals("Corolla", resultado.get(0).getVeiculo());
    }

}
