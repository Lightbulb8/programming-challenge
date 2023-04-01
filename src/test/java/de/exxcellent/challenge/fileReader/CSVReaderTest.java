package de.exxcellent.challenge.fileReader;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


class CSVReaderTest {
	
	@Test
	void testGetRowsFromFile() {
		CSVReader reader = new CSVReader("src/main/resources/de/exxcellent/challenge/test.csv");
		List<List<String>> test = Arrays.asList(Arrays.asList("day", "max", "min"),
									Arrays.asList("1", "41", "2"),
									Arrays.asList("2", "30", "10"),
									Arrays.asList("3", "20", "0"));
		assertEquals(test, reader.getRowsFromFile());
	}

}
