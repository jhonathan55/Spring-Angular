package com.ejer.demo.service;

import java.util.List;

import com.ejer.demo.dto.MovimientosDto;

public interface MovimientosService {
  public MovimientosDto newMovimiento(MovimientosDto movimientosDto);  
  public List<MovimientosDto> getMovimientos();
}
