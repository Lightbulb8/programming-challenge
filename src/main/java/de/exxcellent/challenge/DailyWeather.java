package de.exxcellent.challenge;

import java.util.Objects;

public class DailyWeather implements Callculator {
	public String day;
	public int maxToday;
	public int minToday;
	
	public DailyWeather(String day, int maxToday, int minToday) {
		this.day = day;
		this.maxToday = maxToday;
		this.minToday = minToday;
	}
	
	public int difference() {
		return maxToday-minToday;
	}

	public String getID() {
		return day;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, maxToday, minToday);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DailyWeather other = (DailyWeather) obj;
		return Objects.equals(day, other.day) && maxToday == other.maxToday && minToday == other.minToday;
	}


}
