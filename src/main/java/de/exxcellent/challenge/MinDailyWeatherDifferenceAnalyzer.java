package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinDailyWeatherDifferenceAnalyzer {
	public List<List<String>> csvList;
	public int columnDay;
	public int columnMax;
	public int columnMin;
	
	public MinDailyWeatherDifferenceAnalyzer(List<List<String>> csvFile, int columnDay, int columnMax, int columnMin) {
		this.csvList = csvFile;
		this.columnDay = columnDay;
		this.columnMax = columnMax;
		this.columnMin = columnMin;
	}
	
	public int getDayWithSmallestTempSpread() {
		List<DailyWeather> weatherList = convertCSVtoDailyWeather();
		List<Integer> diffMinMax = new ArrayList<>();
		for(int i = 0; i<weatherList.size(); i++){
			diffMinMax.add(weatherList.get(i).difference());
		}
		int minIndex = diffMinMax.indexOf(Collections.min(diffMinMax));
		return weatherList.get(minIndex).getDay();
	}
	
	private List<DailyWeather> convertCSVtoDailyWeather() {
		List<DailyWeather> weatherList = new ArrayList<>();
		for(int i = 1; i<csvList.size();i++) {
			List<String> line = csvList.get(i);
			weatherList.add(new DailyWeather(Integer.parseInt(line.get(columnDay)), Integer.parseInt(line.get(columnMax)), Integer.parseInt(line.get(columnMin))));
		}
		return weatherList;
	}
	
	
}
