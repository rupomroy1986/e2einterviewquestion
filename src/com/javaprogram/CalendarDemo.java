package com.javaprogram;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to get for feature, we use calendar class.
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy/M/d hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		             System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		             System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		             System.out.println(cal.get(Calendar.AM_PM));
		             System.out.println(cal.get(Calendar.MINUTE));
		             
		             

		

	}

}
