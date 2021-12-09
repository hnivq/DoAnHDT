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
public abstract class Check {
    public static boolean checkName(String name) {
        boolean isOK = true;
        for (Stuff stuff : DanhSachQuanLy.list) {
                if(stuff.getName().equalsIgnoreCase(name))
                    return false;
        }
        return isOK;
    }
    
    public static boolean checkDate(String dateString) {
        boolean isOK = true;
        Date date = FormatDate.nhapNgay(dateString);
        if(date.getTime() > System.currentTimeMillis())
            return false;
        return isOK;
    }
    
    public static boolean checkSerial(String serial) {
        boolean isOK = true;
        for (Stuff stuff : DanhSachQuanLy.list) {
                if(stuff.getSerialString().equalsIgnoreCase(serial))
                    return isOK;
        }
        return false;
    }
}

