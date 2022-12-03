
package com.mycompany.prueba_3.mto;

import java.time.LocalDate;


public class Arriendos {
    
    //fecha, Vendedor, Cliente, Fecha de Término, Patente del Vehículo, observaciones delArriendo y el valor.
    private LocalDate fecha;
    private Vendedor vendedor;
    private LocalDate fechaArriendo;
    private Cliente cliente;
    private LocalDate fechaTermino;
    private String Patente;
    private String Observacion;
    private int Valor;

    public Arriendos(LocalDate fechaArriendo, Cliente cliente, LocalDate fechaTermino, String Patente, String Observacion, int Valor) {
        this.fechaArriendo = fechaArriendo;
        this.cliente = cliente;
        this.fechaTermino = fechaTermino;
        this.Patente = Patente;
        this.Observacion = Observacion;
        this.Valor = Valor;
    }
    
    public Arriendos() {
        this.fechaArriendo = LocalDate.now();
        this.cliente = new Cliente();
        this.fechaTermino = LocalDate.now();
        this.Patente = "";
        this.Observacion = "";
        this.Valor = 0;
    
    }

    public LocalDate getFechaArriendo() {
        return fechaArriendo;
    }

    public void setFechaArriendo(LocalDate fechaArriendo) {
        this.fechaArriendo = fechaArriendo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(LocalDate fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
    
    
    
    
}
