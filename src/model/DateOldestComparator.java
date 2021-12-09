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
public class DateOldestComparator implements Comparator<Stuff>{
	@Override
	public int compare(Stuff stuff1, Stuff stuff2) {
		if(stuff1.getImportDate() == stuff2.getImportDate())
			return 0;
		else if(stuff1.getImportDate().after(stuff2.getImportDate()))
		 	return 1;
		else
			return -1;
	}
}
