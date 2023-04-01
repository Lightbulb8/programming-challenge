package de.exxcellent.challenge.callculator;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(clubName, goalsAllowed, goalsScored);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FootballClub other = (FootballClub) obj;
		return Objects.equals(clubName, other.clubName) && goalsAllowed == other.goalsAllowed
				&& goalsScored == other.goalsScored;
	}
	
	
}
