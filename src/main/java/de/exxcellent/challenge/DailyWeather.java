package de.exxcellent.challenge;

public class DailyWeather {
	public int day;
	public int maxToday;
	public int minToday;
	
	public DailyWeather(int day, int maxToday, int minToday) {
		this.day = day;
		this.maxToday = maxToday;
		this.minToday = minToday;
	}
	
	public int difference() {
		return maxToday-minToday;
	}

	public int getDay() {
		return day;
	}
}
