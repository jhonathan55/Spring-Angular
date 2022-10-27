package com.ejer.demo.dto;

public class UserDto {
    private Long id;
    private String name;
    private int cuenta;
    private int saldo;
   
    public UserDto(Long id, String name, int cuenta, int saldo) {
        this.id = id;
        this.name = name;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }
    public UserDto() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
