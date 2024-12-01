/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dv.tpfinal.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

import com.dv.tpfinal.models.Moto;
import com.dv.tpfinal.sys.DB;

/**
 *
 * @author nico
 */
public class MotoController {
    private Moto moto;
    private static final String GET_QUERY = "SELECT v.id_vehiculo, v.kilometraje, v.marca, d.cilindrada FROM vehiculo v" +
    " INNER JOIN dato_moto d ON v.id_dato_moto = d.id_dato_moto" +
    " WHERE id_vehiculo = %d";

    public MotoController(Moto moto) {
        this.moto = moto;
    }
    
    public void store() {
        DB db = DB.getInstance();
        ArrayList<String> queries = new ArrayList<>();
        queries.add(String.format("INSERT INTO `dato_moto` " +
                        "(`id_dato_moto`, `cilindrada`) " +
                        "VALUES (NULL, %d);", moto.getCilindrada()));
        queries.add(String.format("INSERT INTO `vehiculo` " +
                        "(`id_vehiculo`, `kilometraje`, `marca`, `id_dato_moto`) " + 
                        "VALUES (%d, %d, '%s', last_insert_rowid());", moto.getId(), moto.getKilometraje(), moto.getMarca()));

        queries.forEach(query -> db.executeUpdate(query));
    }
    
    public static Optional<Moto> get(int id) {
        DB db = DB.getInstance();
        String query = String.format(GET_QUERY, id);
        
        try (ResultSet rs = db.executeQuery(query).get()) {
            if (rs.next()) {
                int kilometraje = rs.getInt("kilometraje");
                String marca = rs.getString("marca");
                int cilindrada = rs.getInt("cilindrada");

                return Optional.of(new Moto(id, kilometraje, marca, cilindrada));
            } else {
                return Optional.empty();
            }
        }
        catch (SQLException e) {
            System.out.println("Error al obtener datos de moto " + id + ": " + e.getMessage());
        }
       
        return Optional.empty();
    }
}
