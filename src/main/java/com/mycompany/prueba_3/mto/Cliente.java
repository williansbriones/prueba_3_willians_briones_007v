
package com.mycompany.prueba_3.mto;

import java.time.LocalDate;


public class Cliente {
    //RUT, nombre completo, fecha de nacimiento, dirección, correo electrónicoy teléfono
    private String rut;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String CorreoElectronico;
    private String Telefono;

    public Cliente(String rut, String nombre, LocalDate fechaNacimiento, String direccion, String CorreoElectronico, String Telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.CorreoElectronico = CorreoElectronico;
        this.Telefono = Telefono;
    }

    
    public Cliente() {
        this.rut = "";
        this.nombre = "";
        this.fechaNacimiento = LocalDate.now();
        this.direccion = "";
        this.CorreoElectronico = "";
        this.Telefono = "";
    }
    
    
    
    
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
    
    
}
