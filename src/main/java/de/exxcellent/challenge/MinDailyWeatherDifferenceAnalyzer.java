package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinDailyWeatherDifferenceAnalyzer {

	
	public static String getDayWithSmallestTempSpread(List<DailyWeather> weatherList) {
		List<Integer> diffMinMax = new ArrayList<>();
		for(int i = 0; i<weatherList.size(); i++){
			diffMinMax.add(weatherList.get(i).difference());
		}
		int minIndex = diffMinMax.indexOf(Collections.min(diffMinMax));
		return weatherList.get(minIndex).getID();
	}
	
	
}
