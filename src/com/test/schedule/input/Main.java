package com.test.schedule.input;

import java.text.ParseException;

public class Main {

	public static void main(String[] args) {
		TennisMatchScheduler matches= new TennisMatchScheduler();
		String[] slots=new String[] {"9:00 AM","2:00 PM"};
		try {
			matches.getData("17/03/2021",4,2,slots);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
