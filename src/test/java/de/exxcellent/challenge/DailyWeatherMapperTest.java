package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class DailyWeatherMapperTest {

	@Test
	void test() {
		FileReader reader = new CSVReader("src/main/resources/de/exxcellent/challenge/test.csv");
		List<List<String>> readerData = reader.getRowsFromFile();
		List<DailyWeather> dailyWeatherTestData = new ArrayList<>();
		dailyWeatherTestData.add(new DailyWeather(1, 41, 2));
		dailyWeatherTestData.add(new DailyWeather(2, 30, 10));
		dailyWeatherTestData.add(new DailyWeather(3, 20, 0));
		assertEquals(dailyWeatherTestData, DailyWeatherMapper.convertCSVtoDailyWeather(readerData, 0, 1, 2));
		
	}

}
