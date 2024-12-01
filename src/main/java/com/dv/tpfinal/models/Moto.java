/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dv.tpfinal.models;

/**
 *
 * @author nico
 */
public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(int id, int kilometraje, String marca, int cilindrada) {
        this.id = id;
        this.kilometraje = kilometraje;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}