/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dv.tpfinal.models;
import java.util.ArrayList;

/**
 *
 * @author nico
 */
public class Garage {
    private final ArrayList<Integer> autos;
    private final ArrayList<Integer> motos;
    private int capacidadMaxima;
    private double precioRueda = 0.0;

    public Garage(int capacidadMaxima, double precioRueda) {
        this.capacidadMaxima = capacidadMaxima;
        this.precioRueda = precioRueda;
        this.autos = new ArrayList<>();
        this.motos = new ArrayList<>();
    }

    public ArrayList<Integer> getAutos() {
        return autos;
    }

    public ArrayList<Integer> getMotos() {
        return motos;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getPrecioRueda() {
        return precioRueda;
    }

    public void setPrecioRueda(double precioRueda) {
        this.precioRueda = precioRueda;
    }
}
