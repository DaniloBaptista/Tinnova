package com.tinnova.exercicio5.exercicio5.service.mappers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinnova.exercicio5.exercicio5.DTO.VeiculoDTO;
import com.tinnova.exercicio5.exercicio5.entity.Veiculo;

@Service
public class VeiculoMapperService {

    @Autowired
    private ModelMapper modelMapper;

    public VeiculoDTO convertToDto(Veiculo veiculo) {
        VeiculoDTO veiculoDTO = modelMapper.map(veiculo, VeiculoDTO.class);
        return veiculoDTO;
    }
}
