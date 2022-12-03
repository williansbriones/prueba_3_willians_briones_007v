
package com.mycompany.prueba_3.mto;

import java.time.LocalDate;


public class auto {
 
     //Patente, número de motor, número de chasis, marca, modelo, año, tipo de combustible.Además el vehículo puede ser Automóvil o Camioneta
    
    private String patente;
    private int numeroMotor;
    private int numeroChasis;
    private String marca;
    private String modelo;
    private LocalDate año;
    private String tipoConbustible;
    private String tipoVehiculo;

    public auto(String patente, int numeroMotor, int numeroChasis, String marca, String modelo, LocalDate año, String tipoConbustible, String tipoVehiculo) {
        this.patente = patente;
        this.numeroMotor = numeroMotor;
        this.numeroChasis = numeroChasis;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipoConbustible = tipoConbustible;
        this.tipoVehiculo = tipoVehiculo;
    }

    public auto() {
        this.patente = "";
        this.numeroMotor = 0;
        this.numeroChasis = 0;
        this.marca = "";
        this.modelo = "";
        this.año = LocalDate.now();
        this.tipoConbustible = "";
        this.tipoVehiculo = "";
    
    
    }
    
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public int getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAño() {
        return año;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    public String getTipoConbustible() {
        return tipoConbustible;
    }

    public void setTipoConbustible(String tipoConbustible) {
        this.tipoConbustible = tipoConbustible;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
    
    
    
   
    
}
