/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HnivGnauq
 */
public abstract class FormatDate {
    public static SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
    
    public static Date nhapNgay(String nhapNgay)
    {
	Date importDate = null;
	if(nhapNgay.equals(""))
            importDate = null;
	else
	{
            try {	
                importDate = formatDate.parse(nhapNgay);
            } catch (ParseException ex) {
                java.util.logging.Logger.getLogger(FormatDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
	}
	return importDate;
    }
}
