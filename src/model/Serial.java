/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HnivGnauq
 */
public class Serial {
    private String serialChar;
    private long serialNum;

    public String getSerialChar() {
        return serialChar;
    }

    public void setSerialChar(String serialChar) {
        this.serialChar = serialChar;
    }

    public long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }

    public Serial(String serialChar, long serialNum) {
        this.serialChar = serialChar;
        this.serialNum = serialNum;
    }
    
    private String convert(String serialChar, long serialNum)
    {
        String serial = null;
	if(serialNum >= 0 && serialNum <= 9)
	{
            serial = "00000" + serialNum;
            return serialChar + " " + serial;
	}
	else if(serialNum >= 10 && serialNum <=99)
	{
            serial = "0000" + serialNum;
            return serialChar + " " + serial;
	}
	else if(serialNum >= 100 && serialNum <= 999)
	{
            serial = "000" + serialNum;
            return serialChar + " " + serial;
	}
	else if(serialNum >=1000 && serialNum <= 9999)
	{
            serial = "00" + serialNum;
            return serialChar + " " + serial;
	}
	else if(serialNum >=10000 && serialNum <= 99999)
	{
            serial = "0" + serialNum;
            return serialChar + " " + serial;
	}
	else 
	{
            return serialChar + " " + serialNum;
	}
    }

    public String getSerial()
    {
        return convert(serialChar, serialNum);
    }
}
