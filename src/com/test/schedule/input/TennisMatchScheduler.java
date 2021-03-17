package com.test.schedule.input;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.test.schedule.to.MatchTO;

public class TennisMatchScheduler {

	private int numberOfSlots=0;
	private int numberOfGrounds=0;
	private int currentGround=1;
	private int prevGround=0;
	private int prevSlot=1;
	private int currentSlot=0;
	Date matchDate=null;
	private String[] availableSlots=null;
	List<MatchTO> matches=new ArrayList<>();
	public void getData(String date,int players, int grounds, String[] slots) throws ParseException {
		matchDate=new SimpleDateFormat("dd/MM/yyyy").parse(date);
		availableSlots=slots;
		numberOfGrounds=grounds;
		numberOfSlots=slots.length;
		int gap =1;
		while (gap < players) {
			for (int i=1; i<=players-gap; i++) {
				if(i+gap>players) break;
				setSchedule(i, i+gap);
			}
			gap++;
		}
		for(MatchTO match : matches ) {
			System.out.println("Person "+ match.getPlayer1() + " vs Person "+ match.getPlayer2() + " at Ground " + match.getMatchGround()+" on "+new SimpleDateFormat("dd/MM/yyyy").format(match.getMatchDate())+" at "+ match.getMatchTime());
		}
	}

	public void setSchedule(int player1,int player2) {

		if (currentSlot==prevSlot) currentSlot++;
		if(currentSlot>=numberOfSlots) {
			currentGround++;
			currentSlot=0;
			if(currentGround==prevGround)currentGround++;
			if(currentGround>numberOfGrounds) {
				currentGround=1;
				currentSlot=0;
				Calendar c = Calendar.getInstance(); 
				c.setTime(matchDate); 
				c.add(Calendar.DATE, 1);
				matchDate = c.getTime();
			}
		}


		matches.add(new MatchTO(matchDate, player1, player2, availableSlots[currentSlot], currentGround));
		prevSlot=currentSlot;
		prevGround=currentGround;
	}

}
