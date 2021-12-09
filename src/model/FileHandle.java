/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

/**
 *
 * @author HnivGnauq
 */
public abstract class FileHandle {
    static DanhSachQuanLy list = new DanhSachQuanLy();
      
    public static void readFile() throws Exception{
	    FileReader fr = null;
        BufferedReader br = null;
	try {
		Food food;
		Ceramic ceramic;
		Electronic electronic;
		fr = new FileReader("stuff.txt");
		br = new BufferedReader(fr);
		String line = "";
		while(true)
		{
                    line = br.readLine();
                    if(line == null)
			break;
                    String txt[] = line.split(";");
                    String type = txt[0];
                    String name = txt[1];
                    String serialString = txt[2];
                    String[] serialTxt = serialString.split(" ");
                    String serialChar = serialTxt[0];
                    String serialNumString = serialTxt[1];
                    int serialNum = Integer.parseInt(serialNumString);
                    Serial serial = new Serial(serialChar, serialNum);
                    String importPriceString = txt[3];
                    long importPrice = Long.parseLong(importPriceString);
                    String inventoryString = txt[4];
                    float inventory = Float.parseFloat(inventoryString);
                    String importDateString = txt[5];
                    Date importDate = FormatDate.nhapNgay(importDateString);
                    if(serialChar.equals("FD"))
			{
                            food = new Food(type, name, serial, importPrice, inventory, importDate);
                            list.addStuff(food);
			}
                    else if(serialChar.equals("CM"))
			{
                            ceramic = new Ceramic(type, name, serial, importPrice, inventory, importDate);
                            list.addStuff(ceramic);
			}
                    else
			{
                            electronic = new Electronic(type, name, serial, importPrice, inventory, importDate);
                            list.addStuff(electronic);
			}
		}
            } catch (Exception e) {
                    e.printStackTrace();
		}finally{
                    try {
                        fr.close();
                        br.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
    }
    public static void saveFile() throws Exception{
        FileWriter fw = null;
        BufferedWriter bw = null;
	try {
		fw = new FileWriter("stuff.txt");
		bw = new BufferedWriter(fw);
		for (Stuff stuff : DanhSachQuanLy.list) {
			bw.write(stuff.toString());
			bw.newLine();	
		}
	} catch (Exception e) {
            e.printStackTrace();
	} finally{
            try {
                    bw.close();
                    fw.close();
        } catch (Exception e) {
                e.printStackTrace();
        }
        }
    }
}
