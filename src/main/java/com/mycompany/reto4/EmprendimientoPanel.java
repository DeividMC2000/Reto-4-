package com.mycompany.reto4;

import java.util.ArrayList;

public class EmprendimientoPanel {
    private ArrayList<PanelesSolares> Paneles;
    private ArrayList<Seguro> Seguros;
    private ArrayList<Venta> Ventas;

    public EmprendimientoPanel() {
        this.Paneles = new ArrayList();
        this.Seguros = new ArrayList();
        this.Ventas = new ArrayList();
    }

    public ArrayList<PanelesSolares> getPaneles() {
        return Paneles;
    }

    public void setPaneles(ArrayList<PanelesSolares> Paneles) {
        this.Paneles = Paneles;
    }

    public ArrayList<Seguro> getSeguros() {
        return Seguros;
    }

    public void setSeguros(ArrayList<Seguro> Seguros) {
        this.Seguros = Seguros;
    }

    public ArrayList<Venta> getVentas() {
        return Ventas;
    }

    public void setVentas(ArrayList<Venta> Ventas) {
        this.Ventas = Ventas;
    }
    public void addPaneles(PanelesSolares panel) {
        this.Paneles.add(panel);
    }
    
    public void addSeguros(Seguro seguros) {
        this.Seguros.add(seguros);
    }
    
    public void addVentas(Venta venta) {
        this.Ventas.add(venta);
    }


}
