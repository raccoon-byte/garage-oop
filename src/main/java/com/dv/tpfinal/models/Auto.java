/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dv.tpfinal.models;

/**
 *
 * @author nico
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(int id, int kilometraje, String marca, int cantidadPuertas) {
        this.id = id;
        this.kilometraje = kilometraje;
        this.marca = marca;
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}
