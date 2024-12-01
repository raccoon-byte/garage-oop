/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dv.tpfinal.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

import com.dv.tpfinal.models.Auto;
import com.dv.tpfinal.sys.DB;

/**
 *
 * @author nico
 */
public class AutoController {
    private Auto auto;
    private static final String GET_QUERY = "SELECT v.id_vehiculo, v.kilometraje, v.marca, d.cantidad_puertas FROM vehiculo v " +
                        "INNER JOIN dato_auto d ON v.id_dato_auto = d.id_dato_auto " +
                        "WHERE id_vehiculo = %d";

    public AutoController(Auto auto) {
        this.auto = auto;
    }

    public void store() {
        DB db = DB.getInstance();
        ArrayList<String> queries = new ArrayList<>();
        queries.add(String.format("INSERT INTO `dato_auto` " +
                        "(`id_dato_auto`, `cantidad_puertas`) " +
                        "VALUES (NULL, %d);", auto.getCantidadPuertas()));
        queries.add(String.format("INSERT INTO `vehiculo` " +
                        "(`id_vehiculo`, `kilometraje`, `marca`, `id_dato_auto`) " +
                        "VALUES (%d, %d, '%s', last_insert_rowid());", auto.getId(), auto.getKilometraje(), auto.getMarca()));
        
        queries.forEach(query -> db.executeUpdate(query));
    }

    public static Optional<Auto> get(int id) {    
        DB db = DB.getInstance();
        String query = String.format(GET_QUERY, id);
        
        try (ResultSet rs = db.executeQuery(query).get()) {
            if (rs.next()) {
                int kilometraje = rs.getInt("kilometraje");
                String marca = rs.getString("marca");
                int cantidad_puertas = rs.getInt("cantidad_puertas");

                return Optional.of(new Auto(id, kilometraje, marca, cantidad_puertas));
            } else {
                return Optional.empty();
            }
        }
        catch (SQLException e) {
            System.out.println("Error al obtener datos de auto " + id + ": " + e.getMessage());
        }
       
        return Optional.empty();
    }
}

