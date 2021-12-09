/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;

/**
 *
 * @author HnivGnauq
 */
public class DanhSachQuanLy {
    public static LinkedList<Stuff> list;
    public DanhSachQuanLy()
    {
        list = new LinkedList<>();
    }
    
    public void addStuff(Stuff stuff)
    {
        list.add(stuff);
    }
}
