/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author HnivGnauq
 */
public abstract class FormatNumber {
    private static Locale locale = new Locale("vi", "VN");
    private static DecimalFormat formatCurrency = (DecimalFormat)DecimalFormat.getCurrencyInstance(locale);
    private static DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols();
    
    public static String formatNumString(long importPrice)
    {
        formatSymbols.setGroupingSeparator(',');
        formatSymbols.setCurrencySymbol("vnđ");
        formatCurrency.setDecimalFormatSymbols(formatSymbols);
        return formatCurrency.format(importPrice);
    }
}
