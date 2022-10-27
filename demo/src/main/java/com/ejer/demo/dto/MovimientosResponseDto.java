package com.ejer.demo.dto;

public class MovimientosResponseDto {
    private Long id;
    private String tipo;
    private int cantidad;
    private int saldo;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public MovimientosResponseDto() {
    }
    public MovimientosResponseDto(Long id, String tipo, int cantidad, int saldo) {
        this.id = id;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.saldo = saldo;
    }
   

}
