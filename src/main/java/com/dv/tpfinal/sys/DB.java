/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dv.tpfinal.sys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Optional;

/**
 *
 * @author nico
 */
public class DB {
    private static final String DB_URL = "jdbc:sqlite:garage.db";
    private static DB instance;
    private static Connection connection;

    private DB() {
        try {
            connection = DriverManager.getConnection(DB_URL);
            instance = this;
        } catch (SQLException e) {
            System.out.println("Error de conexion a la base de datos: " + e.getMessage());
        }
    }

    public static DB getInstance() {
        if (instance == null) {
            instance = new DB();
        }
        return instance;
    }
    
    public static Connection getConnection() {
        if (instance == null) {
            instance = new DB();
        }
        return connection;
    }

    public void init() {
        ArrayList<String> queries = new ArrayList<>();

        queries.add("DROP TABLE IF EXISTS vehiculo;");
        queries.add("CREATE TABLE vehiculo (" +
                "id_vehiculo INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "kilometraje INTEGER NOT NULL, " +
                "marca TEXT NOT NULL, " +
                "id_garage INTEGER, " + 
                "id_cliente INTEGER, " + 
                "id_dato_auto INTEGER, " + 
                "id_dato_moto INTEGER" + 
                ");");
        queries.add("DROP TABLE IF EXISTS dato_auto;");
        queries.add("CREATE TABLE dato_auto (" +
                "id_dato_auto INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "cantidad_puertas INTEGER NOT NULL" + 
                ");");
        queries.add("DROP TABLE IF EXISTS dato_moto;");
        queries.add("CREATE TABLE dato_moto (" +
                "id_dato_moto INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "cilindrada INTEGER NOT NULL" + 
                ");");

        queries.add("DROP TABLE IF EXISTS cliente;");
        queries.add("CREATE TABLE IF NOT EXISTS cliente (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nombre TEXT NOT NULL, " +
                "dni TEXT NOT NULL, " +
                "telefono TEXT NOT NULL" +
                ");");

        queries.add("DROP TABLE IF EXISTS garage;");
        queries.add("CREATE TABLE IF NOT EXISTS garage (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nombre TEXT NOT NULL" +
                ");");

        queries.forEach(query -> this.executeUpdate(query));
    }
    
    public Optional<ResultSet> executeQuery(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        var rs = stmt.executeQuery(query);
        if (rs != null) {
            return Optional.of(rs);
        }
        return Optional.empty();
    }

    public int executeUpdate(String query) {
        try (Statement stmt = connection.createStatement()) {
            return stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return 0;
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
