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
public class Stuff {
    private String type, name;
    private Serial serial;
    private long importPrice;
    private float inventory;
    private Date importDate;
    private static long totalStuff;
    
    public Stuff()
    {
        totalStuff++;
    }

    public Stuff(String type, String name, Serial serial, long importPrice, float inventory, Date importDate) {
        this.type = type;
        this.name = name;
        this.serial = serial;
        this.importPrice = importPrice;
        this.inventory = inventory;
        this.importDate = importDate;
        totalStuff++;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serial getSerial() {
        return serial;
    }

    public void setSerial(Serial serial) {
        this.serial = serial;
    }

    public long getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(long importPrice) {
        this.importPrice = importPrice;
    }

    public float getInventory() {
        return inventory;
    }

    public void setInventory(float inventory) {
        this.inventory = inventory;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public static long getTotalStuff() {
        return totalStuff;
    }

    public static void setTotalStuff(long totalStuff) {
        Stuff.totalStuff = totalStuff;
    }
    
    public long getTotalPrice()
    {
        return (long)getInventory() * getImportPrice();
    }
    
    public String getSerialString()
    {
        return serial.getSerial();
    }
    
    public String getImportDateString()
    {
        return FormatDate.formatDate.format(this.importDate);
    }
    
    public String getImportPriceString()
    {
        return FormatNumber.formatNumString(importPrice);
    }
    
    public String getInventoryString()
    {
        return Float.toString(inventory);
    }

    @Override
    public String toString() {
        return type + ";" + name + ";" + getSerialString() + ";" + getImportPrice() + ";" + getInventory() + ";" + getImportDateString();
    }
}
