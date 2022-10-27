package com.ejer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejer.demo.entity.Movimientos;

public interface MovimientosRepository extends JpaRepository<Movimientos, Long> {
    
}
