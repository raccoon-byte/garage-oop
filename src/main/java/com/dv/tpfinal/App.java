package com.dv.tpfinal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import com.dv.tpfinal.controllers.GarageController;
import com.dv.tpfinal.sys.DB;
import com.dv.tpfinal.menu.Menu;
import com.dv.tpfinal.models.Garage;

/**
 *
 * @author nico
 */
public class App {
    public static void main(String[] args) {    
        DB db = DB.getInstance();
        db.init();
        GarageController garage = new GarageController(new Garage(5, 1231.20));
        
        garage.addMoto(250000, "Toyota", 4);
        garage.addAuto(60000, "Ford", 3);
        garage.addMoto(30000, "Kawasaki", 50);
        garage.addMoto(140000, "Honda", 30);
        
        Menu mainMenu = new Menu();
        mainMenu.setVisible(true);
        //db.close();
    }
}
