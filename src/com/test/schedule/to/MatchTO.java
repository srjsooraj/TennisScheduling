package com.test.schedule.to;

import java.util.Date;

public class MatchTO {

	private Date matchDate;
	private int player1;
	private int player2;
	private String matchTime;
	private int matchGround;



	public MatchTO(Date matchDate, int player1, int player2, String matchTime, int matchGround) {
		super();
		this.matchDate = matchDate;
		this.player1 = player1;
		this.player2 = player2;
		this.matchTime = matchTime;
		this.matchGround = matchGround;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public int getPlayer1() {
		return player1;
	}
	public void setPlayer1(int player1) {
		this.player1 = player1;
	}
	public int getPlayer2() {
		return player2;
	}
	public void setPlayer2(int player2) {
		this.player2 = player2;
	}
	public String getMatchTime() {
		return matchTime;
	}
	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}
	public int getMatchGround() {
		return matchGround;
	}
	public void setMatchGround(int matchGround) {
		this.matchGround = matchGround;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matchDate == null) ? 0 : matchDate.hashCode());
		result = prime * result + matchGround;
		result = prime * result + ((matchTime == null) ? 0 : matchTime.hashCode());
		result = prime * result + player1;
		result = prime * result + player2;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatchTO other = (MatchTO) obj;
		if (matchDate == null) {
			if (other.matchDate != null)
				return false;
		} else if (!matchDate.equals(other.matchDate))
			return false;
		if (matchGround != other.matchGround)
			return false;
		if (matchTime == null) {
			if (other.matchTime != null)
				return false;
		} else if (!matchTime.equals(other.matchTime))
			return false;
		if (player1 != other.player1)
			return false;
		if (player2 != other.player2)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MatchTO [matchDate=" + matchDate + ", player1=" + player1 + ", player2=" + player2 + ", matchTime="
				+ matchTime + ", matchGround=" + matchGround + "]";
	}


}
