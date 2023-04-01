package de.exxcellent.challenge.callculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class DailyWeatherTest {

	@Test
	void test() {
		DailyWeather day = new DailyWeather("2",20,12);
		assertEquals(8,day.difference());
	}

}
