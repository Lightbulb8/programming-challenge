package de.exxcellent.challenge.mapper;

import java.util.ArrayList;
import java.util.List;

import de.exxcellent.challenge.callculator.Callculator;
import de.exxcellent.challenge.callculator.DailyWeather;
import de.exxcellent.challenge.callculator.FootballClub;



public class Mapper {
	
	public static List<Callculator> convertCSVtoDailyWeather(List<List<String>> csvFile, int columnDay, int columnMax, int columnMin) {
		List<Callculator> weatherList = new ArrayList<>();
		for(int i = 1; i<csvFile.size();i++) {
			List<String> line = csvFile.get(i);
			weatherList.add(new DailyWeather(line.get(columnDay), Integer.parseInt(line.get(columnMax)), Integer.parseInt(line.get(columnMin))));
		}
		return weatherList;
	}
	
	public static List<Callculator> convertCSVtoFootballClub(List<List<String>> csvFile, int columnClubName, int columnGoalsScored, int columnGoalsAllowed) {
		List<Callculator> clubList = new ArrayList<>();
		for(int i = 1; i<csvFile.size();i++) {
			List<String> line = csvFile.get(i);
			clubList.add(new FootballClub(line.get(columnClubName), Integer.parseInt(line.get(columnGoalsScored)), Integer.parseInt(line.get(columnGoalsAllowed))));
		}
		return clubList;
	}
	

}
