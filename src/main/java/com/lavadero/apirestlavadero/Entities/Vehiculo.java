package com.lavadero.apirestlavadero.Entities;

import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Vehiculo {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    @NotBlank(message = "Por favor ingrese una placa, no registrada anteriormente")
    private String placa;
    private String nombre;
    private Long telefono;
    private int numero_lavadas;
    private String descripcion; 

    // public Vehiculo(Long id, String nombre){
    //     this.nombre=nombre;
    // }

    //constructor
    // public Vehiculo(String placa, int lavadas){
    //     this.placa = placa;
    //     this.numero_lavadas = lavadas;
    // }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumero_lavadas() {
        return numero_lavadas;
    }
    public void setNumero_lavadas(int numero_lavadas) {
        this.numero_lavadas = numero_lavadas;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    
    // public Long getId() {
    //     return id;
    // }
    // public void setId(Long id) {
    //     this.id = id;
    // }

}