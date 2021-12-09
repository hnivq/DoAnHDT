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
public class Food extends Stuff{
    private static int countFD = 1, foodStuff;

    public Food() {
        foodStuff++;
    }

    public Food(String name, Serial serial, long importPrice, float inventory, Date importDate) {
        super("Thực phẩm", name, serial, importPrice, inventory, importDate);
        countFD += 2;
        foodStuff++;
    }
    
    public Food(String type, String name, Serial serial, long importPrice, float inventory, Date importDate) {
        super(type, name, serial, importPrice, inventory, importDate);
        countFD += 2;
        foodStuff++;
    }

    /**
     *
     * @return
     */
    public static int getCountFD() {
        return countFD;
    }

    public static void setCountFD(int countFD) {
        Food.countFD = countFD;
    }

    public static int getFoodStuff() {
        return foodStuff;
    }

    public static void setFoodStuff(int foodStuff) {
        Food.foodStuff = foodStuff;
    }

    @Override
    public String getInventoryString() {
        return super.getInventoryString() + " kg"; 
    }

    @Override
    public String getImportPriceString() {
        return super.getImportPriceString() + "/kg"; 
    }
}
