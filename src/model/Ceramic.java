/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author HnivGnauq
 */
public class Ceramic extends Stuff{
    private static int countCM = 1, ceramicStuff;

    public Ceramic() {
    }

    public Ceramic(String type, String name, Serial serial, long importPrice, float inventory, Date importDate) {
        super(type, name, serial, importPrice, inventory, importDate);
        countCM += 2;
        ceramicStuff++;
    }
    
     public Ceramic(String name, Serial serial, long importPrice, float inventory, Date importDate) {
        super("Sành sứ", name, serial, importPrice, inventory, importDate);
        countCM += 2;
        ceramicStuff++;
    }

    public static int getCountCM() {
        return countCM;
    }

    public static void setCountCM(int countCM) {
        Ceramic.countCM = countCM;
    }

    public static int getCeramicStuff() {
        return ceramicStuff;
    }

    public static void setCeramicStuff(int ceramicStuff) {
        Ceramic.ceramicStuff = ceramicStuff;
    }
    
    @Override
    public String getInventoryString() {
        return super.getInventoryString() + " cái"; 
    }

    @Override
    public String getImportPriceString() {
        return super.getImportPriceString() + "/cái"; 
    }
}
