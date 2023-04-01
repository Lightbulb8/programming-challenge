package de.exxcellent.challenge.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.callculator.Callculator;
import de.exxcellent.challenge.callculator.DailyWeather;
import de.exxcellent.challenge.callculator.FootballClub;
import de.exxcellent.challenge.fileReader.CSVReader;
import de.exxcellent.challenge.fileReader.FileReader;

class MapperTest {

	@Test
	void testConvertCSVtoDailyWeather() {
		FileReader reader = new CSVReader("src/main/resources/de/exxcellent/challenge/test.csv");
		List<List<String>> readerData = reader.getRowsFromFile();
		List<Callculator> dailyWeatherTestData = new ArrayList<>();
		dailyWeatherTestData.add(new DailyWeather("1", 41, 2));
		dailyWeatherTestData.add(new DailyWeather("2", 30, 10));
		dailyWeatherTestData.add(new DailyWeather("3", 20, 0));
		assertEquals(dailyWeatherTestData, Mapper.convertCSVtoDailyWeather(readerData, 0, 1, 2));
		
	}
	
	@Test
	void testConvertCSVtoFootballClub() {
		FileReader reader = new CSVReader("src/main/resources/de/exxcellent/challenge/test.csv");
		List<List<String>> readerData = reader.getRowsFromFile();
		List<Callculator> footballClubTestData = new ArrayList<>();
		footballClubTestData.add(new FootballClub("1", 41, 2));
		footballClubTestData.add(new FootballClub("2", 30, 10));
		footballClubTestData.add(new FootballClub("3", 20, 0));
		assertEquals(footballClubTestData, Mapper.convertCSVtoFootballClub(readerData, 0, 1, 2));
		
	}

}
