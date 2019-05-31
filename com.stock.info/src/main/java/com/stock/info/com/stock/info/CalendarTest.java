package com.stock.info.com.stock.info;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMyyyy");
		dateFormat.setTimeZone(cal.getTimeZone());
		System.out.println(dateFormat.format(cal.getTime()));
		
		List<Object[]> binSearch = ArrayList();
		
	}

}
