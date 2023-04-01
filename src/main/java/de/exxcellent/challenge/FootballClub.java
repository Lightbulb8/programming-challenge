package de.exxcellent.challenge;

public class FootballClub implements Callculator{
	public String clubName;
	public int goalsScored;
	public int goalsAllowed;
	
	public FootballClub(String clubName, int goalsScored, int goalsAllowed) {
		this.clubName = clubName;
		this.goalsScored = goalsScored;
		this.goalsAllowed = goalsAllowed;
	}
	
	public int difference() {
		return Math.abs(goalsScored-goalsAllowed);
	}

	public String getID() {
		return clubName;
	}
}
