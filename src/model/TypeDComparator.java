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
public class TypeDComparator implements Comparator<Stuff>{

    @Override
    public int compare(Stuff stuff1, Stuff stuff2) {
        if(stuff1.getType().compareTo(stuff2.getType()) == 0)
			return 0;
		else if(stuff1.getType().compareTo(stuff2.getType()) < 0)
		 	return 1;
		else
			return -1;
    }
    
}
