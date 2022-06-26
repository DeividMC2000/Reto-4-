package com.mycompany.reto4;

import java.time.Duration;
import java.time.LocalDate;

public class Seguro {
    private String nombreEmpresaSeguros;
    private LocalDate fechaInicioCobertura;
    private LocalDate fechaFinalizacionCobertura;
    private String descripcion;
    private int idPanel;

    public Seguro(String nombreEmpresaSeguros, LocalDate fechaInicioCobertura, LocalDate fechaFinalizacionCobertura, String descripcion, int idPanel) {
        this.nombreEmpresaSeguros = nombreEmpresaSeguros;
        this.fechaInicioCobertura = fechaInicioCobertura;
        this.fechaFinalizacionCobertura = fechaFinalizacionCobertura;
        this.descripcion = descripcion;
        this.idPanel = idPanel;
    }
    
    public int calcularDiasCobertura(){
        Duration diasCobertura = Duration.between(fechaInicioCobertura.atStartOfDay(), fechaFinalizacionCobertura.atStartOfDay());
        return (int) diasCobertura.toDays();
    }

    public String getNombreEmpresaSeguros() {
        return nombreEmpresaSeguros;
    }

    public void setNombreEmpresaSeguros(String nombreEmpresaSeguros) {
        this.nombreEmpresaSeguros = nombreEmpresaSeguros;
    }

    public LocalDate getFechaInicioCobertura() {
        return fechaInicioCobertura;
    }

    public void setFechaInicioCobertura(LocalDate fechaInicioCobertura) {
        this.fechaInicioCobertura = fechaInicioCobertura;
    }

    public LocalDate getFechaFinalizacionCobertura() {
        return fechaFinalizacionCobertura;
    }

    public void setFechaFinalizacionCobertura(LocalDate fechaFinalizacionCobertura) {
        this.fechaFinalizacionCobertura = fechaFinalizacionCobertura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdPanel() {
        return idPanel;
    }

    public void setIdPanel(int idPanel) {
        this.idPanel = idPanel;
    }

    @Override
    public String toString() {
        return "Empresa de seguro: " + nombreEmpresaSeguros + ", Inicio de cobertura: " + fechaInicioCobertura + ", Finalizacion de cobertura: " + fechaFinalizacionCobertura + ", Descripción: " + descripcion + ", Identificador numérico: " + idPanel;
    }
    
}
