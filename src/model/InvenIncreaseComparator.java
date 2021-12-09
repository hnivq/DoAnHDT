/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;

/**
 *
 * @author HnivGnauq
 */
public class InvenIncreaseComparator implements Comparator<Stuff>{

    public int compare(Stuff stuff1,Stuff stuff2) {
        if(stuff1.getInventory() == stuff2.getInventory())
			return 0;
		else if(stuff1.getInventory() > stuff2.getInventory())
			return 1;
		else
			return -1;
    }
}
