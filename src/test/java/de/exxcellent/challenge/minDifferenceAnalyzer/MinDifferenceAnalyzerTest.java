package de.exxcellent.challenge.minDifferenceAnalyzer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.callculator.Callculator;
import de.exxcellent.challenge.callculator.DailyWeather;
import de.exxcellent.challenge.callculator.FootballClub;



class MinDifferenceAnalyzerTest {

	@Test
	void testDailyWeatherMinDifference() {
		List<Callculator> testData = new ArrayList<>();
		testData.add(new DailyWeather("1",22,15));
		testData.add(new DailyWeather("2",30,20));
		testData.add(new DailyWeather("3",25,22));
		assertEquals("3", MinDifferenceAnalyzer.getMinDifference(testData));
	}
	
	@Test
	void testFootballClubMinDifference() {
		List<Callculator> testData = new ArrayList<>();
		testData.add(new FootballClub("BVB",30,10));
		testData.add(new FootballClub("Lilien",50,40));
		testData.add(new FootballClub("FCB",10,80));
		assertEquals("Lilien", MinDifferenceAnalyzer.getMinDifference(testData));
	}

}
