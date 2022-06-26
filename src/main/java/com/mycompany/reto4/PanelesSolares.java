package com.mycompany.reto4;

import java.time.LocalDate;

public class PanelesSolares {
    private int idPanel;
    private String identificador;
    private String descripcion;
    private String tipo;
    private String modelo;
    private int anioFabricacion;
    private double precio;
    
    
    public PanelesSolares(int id, String identificador , String descripcion, String tipo, String modelo, int anioFabricacion, double precio){
        this.idPanel = id; 
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        
    }
    
    public String calcularAntiguedad(){
        int fechaActual = LocalDate.now().getYear();
        int antiguedad = fechaActual - anioFabricacion;
        if(antiguedad >= 0 && antiguedad <= 1){
            return "Nuevo";
        }else if(antiguedad >= 2 && antiguedad <= 4){
            return "Medianamente usado";
        }else if(antiguedad >= 5){
            return "Usado";
        }else{
            return "Año de fabricacion incorrecto";
        }
        
    }

    public int getId() {
        return idPanel;
    }

    public void setId(int id) {
        this.idPanel = id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Identificador numérico: " + idPanel + ", Serie: " + identificador + ", Descripción: " + descripcion + ", Tipo: " + tipo + ", Modelo: " + modelo + ", Año de fabricación: " + anioFabricacion + ", Precio=" + precio;
    }
    
}
