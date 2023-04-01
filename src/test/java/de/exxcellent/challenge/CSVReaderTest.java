package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CSVReaderTest {
	CSVReader reader;
	
	@BeforeEach
	void setup() {
		reader = new CSVReader("src/main/resources/de/exxcellent/challenge/test.csv");
	}
	
	@Test
	void test() {
		List<List<String>> test = Arrays.asList(Arrays.asList("day", "max", "min"),
									Arrays.asList("1", "41", "2"),
									Arrays.asList("2", "30", "10"),
									Arrays.asList("3", "20", "0"));
		assertEquals(test, reader.getRowsFromFile());
	}

}
