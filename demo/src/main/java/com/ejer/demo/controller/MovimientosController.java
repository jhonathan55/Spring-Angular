package com.ejer.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejer.demo.dto.MovimientosDto;
import com.ejer.demo.service.MovimientosService;

@RestController
@RequestMapping("/movimientos")
public class MovimientosController {
    
    @Autowired
    private MovimientosService movimientosService;
   
    @PostMapping
    public ResponseEntity<MovimientosDto> newMovimiento(@RequestBody MovimientosDto movimientosDto) {
        MovimientosDto mDto = movimientosService.newMovimiento(movimientosDto);
        return ResponseEntity.ok(mDto);
    }
    @GetMapping
    public List<MovimientosDto> getMovimientos() {
        return movimientosService.getMovimientos();
    }
}
