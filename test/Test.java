/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;
import model.Food;
import model.FormatDate;
import model.FormatNumber;
import model.Serial;
import model.Stuff;
/**
 *
 * @author HnivGnauq
 */
public class Test {
    public static void main(String[] args) {
        String dateString = "30/11/2021";
        Date date = FormatDate.nhapNgay(dateString);
        System.out.println(dateString);
        System.out.println(date);
        String dateconvert = FormatDate.formatDate.format(date);
        System.out.println("Date convert: " + dateconvert);
        
        System.out.println("200000");
        System.out.println(FormatNumber.formatNumString(200000));
        Food food = null;
        Serial serialFood = new Serial("FD", Food.getCountFD()) ;
        Date dateFood = FormatDate.nhapNgay("1/12/2021");
        food = new Food("Carrot",  serialFood, 2300, 1, dateFood);
        
        System.out.println(food.toString()); 
    }
}
