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
public class Electronic extends Stuff{
    private static int countEC = 1, electronicStuff;

    public Electronic() {
    }

    public Electronic(String type, String name, Serial serial, long importPrice, float inventory, Date importDate) {
        super(type, name, serial, importPrice, inventory, importDate);
        countEC += 2;
        electronicStuff++;
    }
    
    public Electronic(String name, Serial serial, long importPrice, float inventory, Date importDate) {
        super("Đồ điện tử", name, serial, importPrice, inventory, importDate);
        countEC += 2;
        electronicStuff++;
    }

    public static int getCountEC() {
        return countEC;
    }

    public static void setCountEC(int countEC) {
        Electronic.countEC = countEC;
    }

    public static int getElectronicStuff() {
        return electronicStuff;
    }

    public static void setElectronicStuff(int electronicStuff) {
        Electronic.electronicStuff = electronicStuff;
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
