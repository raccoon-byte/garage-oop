/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dv.tpfinal.controllers;

import com.dv.tpfinal.models.Moto;
import com.dv.tpfinal.models.Auto;
import com.dv.tpfinal.models.Garage;
import com.dv.tpfinal.sys.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nico
 */
public class GarageController {
    private final Garage garage;
    private static GarageController instance;
    private static final String KILOMETRAJE_MEDIO_QUERY = "SELECT AVG(kilometraje) AS kilometraje_medio FROM vehiculo;";

    public GarageController(Garage garage) {
        instance = this;
        this.garage = garage;
    }

    public static GarageController getInstance() {
        if (instance == null) {
            instance = new GarageController(new Garage(1, 1));
        }
        return instance;
    }
    
    public boolean addAuto(int kilometraje, String marca, int cantidadPuertas) {
        int id = this.getNextId();
        if ((garage.getAutos().size() + garage.getMotos().size()) == garage.getCapacidadMaxima()) {
            return false;
        }
        Auto model = new Auto(id, kilometraje, marca, cantidadPuertas);
        AutoController auto = new AutoController(model);
        this.addAuto(id);
        auto.store();
        return true;
    }

    public boolean addMoto(int kilometraje, String marca, int cilindrada) {
        int id = this.getNextId();
        if ((garage.getAutos().size() + garage.getMotos().size()) == garage.getCapacidadMaxima()) {
            return false;
        }
        Moto model = new Moto(id, kilometraje, marca, cilindrada);
        MotoController moto = new MotoController(model);
        this.addMoto(id);
        moto.store();
        return true;
    }
    
    public void removeVehiculo(int id) {
        DB db = DB.getInstance();
        ArrayList<String> queries = new ArrayList<>();
        
        queries.add(String.format("DELETE FROM dato_auto " +
                        "WHERE id_dato_auto = (SELECT id_dato_auto FROM vehiculo WHERE id_vehiculo = %d)"
                        , id));
        queries.add(String.format("DELETE FROM dato_moto " +
                        "WHERE id_dato_moto = (SELECT id_dato_moto FROM vehiculo WHERE id_vehiculo = %d)"
                        , id));
        queries.add(String.format("DELETE FROM vehiculo " +
                        "WHERE id_vehiculo = %d", id));
       
        queries.forEach(query -> db.executeUpdate(query));
        
        this.getAutos().remove(Integer.valueOf(id));
        this.getMotos().remove(Integer.valueOf(id));
    }

    public double getPrecioTotalRuedas() {
        double total = 0.0;
        for (@SuppressWarnings("unused") int auto : garage.getAutos()) {
            total += garage.getPrecioRueda() * 4;
        }
        for (@SuppressWarnings("unused") int moto : garage.getMotos()) {
            total += garage.getPrecioRueda() * 2;
        }
        return total;
    }
    
    public double getKilometrajeMedio() {
        double medio = 0.0;
        DB db = DB.getInstance();
        
        try (ResultSet rs = db.executeQuery(KILOMETRAJE_MEDIO_QUERY).get()){
            if (rs.next()) {
                medio = rs.getDouble("kilometraje_medio");
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al ejecutar query (get): " + e.getMessage());
        }

        return medio;
    }
    
    public int getNextId() {
        int ultimoIdMotos = 0, ultimoIdAutos = 0;
        if (!garage.getMotos().isEmpty()) {
            ultimoIdMotos = garage.getMotos().get(garage.getMotos().size() - 1);
        }
        if (!garage.getAutos().isEmpty()) {
            ultimoIdAutos = garage.getAutos().get(garage.getAutos().size() - 1);
        }
        return Math.max(ultimoIdMotos, ultimoIdAutos) + 1;
    }

    public ArrayList<Integer> getAutos() {
        return garage.getAutos();
    }
    
    public ArrayList<Integer> getMotos() {
        return garage.getMotos();
    }
    
    public void addAuto(Integer auto) {
        this.garage.getAutos().add(auto);
    }
    
    public void addMoto(Integer moto) {
        this.garage.getMotos().add(moto);
    }

    public int getCapacidadMaxima() {
        return garage.getCapacidadMaxima();
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.garage.setCapacidadMaxima(capacidadMaxima);
    }

    public double getPrecioRueda() {
        return garage.getPrecioRueda();
    }

    public void setPrecioRueda(double precioRueda) {
        this.garage.setPrecioRueda(precioRueda);
    }
}
