package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MinDailyWeatherDifferenceAnalyzerTest {

	@Test
	void test() {
		List<DailyWeather> testData = new ArrayList<>();
		testData.add(new DailyWeather("1",22,15));
		testData.add(new DailyWeather("2",30,20));
		testData.add(new DailyWeather("3",25,22));
		assertEquals(3, MinDailyWeatherDifferenceAnalyzer.getDayWithSmallestTempSpread(testData));
	}

}
