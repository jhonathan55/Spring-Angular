package com.ejer.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejer.demo.dto.MovimientosDto;
import com.ejer.demo.entity.Movimientos;
import com.ejer.demo.repository.MovimientosRepository;

@Service
public class MovimientosServiceImp implements MovimientosService {

    @Autowired
    private MovimientosRepository movimientosRepository;
    
    @Override
    public MovimientosDto newMovimiento(MovimientosDto movimientosDto) {
        Movimientos movimientos = mapDtoToEntity(movimientosDto);
        movimientosRepository.save(movimientos);
        MovimientosDto mDto = mapEntityToDto(movimientos);
        return mDto;
    }
    @Override
    public List<MovimientosDto> getMovimientos(){
        List<Movimientos> movimientos = movimientosRepository.findAll();
        return movimientos.stream().map(m->mapEntityToDto(m)).collect(Collectors.toList());
    }


    private MovimientosDto mapEntityToDto(Movimientos movimientos) {
        MovimientosDto movimientosDto = new MovimientosDto();
        movimientosDto.setId(movimientos.getId());
        movimientosDto.setTipo(movimientos.getTipo());
        movimientosDto.setCantidad(movimientos.getCantidad());
        movimientosDto.setSaldo(movimientos.getSaldo());
        
        return movimientosDto;
    }
    private Movimientos mapDtoToEntity(MovimientosDto movimientosDto) {
        Movimientos movimientos = new Movimientos();
        movimientos.setId(movimientosDto.getId());
        movimientos.setTipo(movimientosDto.getTipo());
        movimientos.setCantidad(movimientosDto.getCantidad());
        movimientos.setSaldo(movimientosDto.getSaldo());
        
        return movimientos;
    }
}
