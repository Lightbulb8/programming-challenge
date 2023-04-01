package de.exxcellent.challenge;

import java.util.List;

import de.exxcellent.challenge.callculator.Callculator;
import de.exxcellent.challenge.fileReader.CSVReader;
import de.exxcellent.challenge.fileReader.FileReader;
import de.exxcellent.challenge.mapper.Mapper;
import de.exxcellent.challenge.minDifferenceAnalyzer.MinDifferenceAnalyzer;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

    	FileReader weatherDataReader = new CSVReader("src/main/resources/de/exxcellent/challenge/weather.csv");
		List<List<String>> weatherData = weatherDataReader.getRowsFromFile();
		List<Callculator> weatherList = Mapper.convertCSVtoDailyWeather(weatherData,0,1,2);

        String dayWithSmallestTempSpread = MinDifferenceAnalyzer.getMinDifference(weatherList);     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
        
        FileReader footballDataReader = new CSVReader("src/main/resources/de/exxcellent/challenge/football.csv");
        List<List<String>> footballData = footballDataReader.getRowsFromFile();
        List<Callculator> footballList = Mapper.convertCSVtoFootballClub(footballData, 0, 5, 6);
        
        String teamWithSmallestGoalSpread = MinDifferenceAnalyzer.getMinDifference(footballList); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
