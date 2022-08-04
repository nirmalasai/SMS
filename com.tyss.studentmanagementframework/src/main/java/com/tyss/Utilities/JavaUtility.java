package com.tyss.Utilities;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author SanjayBabu
 *
 */



public class JavaUtility {
	/**
	 * 
	 * @return
	 */
	public int getRandomNum()
	{
		Random random=new Random();
		int randNum = random.nextInt(1000);
		return randNum;
	}
	/**
	 * 
	 * @return
	 */
	public String getSystemDate()
	{
		Date date=new Date();
		return date.toString();
		
	}
	/**
	 * to get system date and time in required format
	 * @return
	 */
	public String getSystemDateInFormat()
	{
		Date datte =new Date();
		String dateTime=datte.toString();
		String[] dateArr=dateTime.split("");
		int month=datte.getMonth()+1;
		String date=dateArr[2];
		String year=dateArr[5];
		int day=datte.getDay();
		String time=dateArr[3];
		String finalFormat=month+" "+date+" "+year+" "+day+" "+time;
		return finalFormat;
		}
	

}
