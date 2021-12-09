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
public class PriceDecreaseComparator implements Comparator<Stuff>{

    public int compare(Stuff stuff1,Stuff stuff2) {
        if(stuff1.getImportPrice() == stuff2.getImportPrice())
			return 0;
		else if(stuff1.getImportPrice() < stuff2.getImportPrice())
			return 1;
		else
			return -1;
    }
}
