
package com.mycompany.prueba_3.mto;


public class Vendedor {
    
    //registrar el RUT, nombre completo, fono, dirección y correo electrónico
    
    private String rut;
    private String fono;
    private String nombre;
    private String direccion;
    private String correo;

    public Vendedor(String rut, String fono, String direccion, String correo,String nombre) {
        this.rut = rut;
        this.fono = fono;
        this.direccion = direccion;
        this.correo = correo;
        this.nombre = nombre;
    }

    public Vendedor() {
        this.rut = "";
        this.fono = "";
        this.direccion = "";
        this.correo = "";
        this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    
    public String toString(){
    
    
    return this.nombre+"\n"+this.direccion;
    }
    
    
    
}
