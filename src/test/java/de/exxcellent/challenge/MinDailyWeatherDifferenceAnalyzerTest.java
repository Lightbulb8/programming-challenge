package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinDailyWeatherDifferenceAnalyzerTest {
	MinDailyWeatherDifferenceAnalyzer weatherAnalyzer;
	@BeforeEach
	void setup() {
		CSVReader reader = new CSVReader("src/main/resources/de/exxcellent/challenge/test.csv");
		List<List<String>> testData = reader.getContent();
		weatherAnalyzer = new MinDailyWeatherDifferenceAnalyzer(testData,0,1,2);
	}

	@Test
	void test() {
		assertEquals(2, weatherAnalyzer.getDayWithSmallestTempSpread());
	}

}
