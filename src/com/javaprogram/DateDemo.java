package com.javaprogram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//general format
		Date d=new Date();
		System.out.println(d.toString());
		//for customized format
		SimpleDateFormat sd=new SimpleDateFormat("yyyy/M/d");
		 System.out.println(sd.format(d));
		  
		 SimpleDateFormat sde=new SimpleDateFormat("yyyy/M/d hh:mm:ss");
		 System.out.println(sde.format(d));
		

	}

}
