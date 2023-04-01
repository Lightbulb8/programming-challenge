package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.List;

public class DailyWeatherMapper {
	
	public static List<DailyWeather> convertCSVtoDailyWeather(List<List<String>> csvFile, int columnDay, int columnMax, int columnMin) {
		List<DailyWeather> weatherList = new ArrayList<>();
		for(int i = 1; i<csvFile.size();i++) {
			List<String> line = csvFile.get(i);
			weatherList.add(new DailyWeather(Integer.parseInt(line.get(columnDay)), Integer.parseInt(line.get(columnMax)), Integer.parseInt(line.get(columnMin))));
		}
		return weatherList;
	}
	

}
