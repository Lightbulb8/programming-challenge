package de.exxcellent.challenge.minDifferenceAnalyzer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.exxcellent.challenge.callculator.Callculator;



public class MinDifferenceAnalyzer {

	
	public static String getMinDifference(List<Callculator> callculatorList) {
		List<Integer> diffMinMax = new ArrayList<>();
		for(int i = 0; i<callculatorList.size(); i++){
			diffMinMax.add(callculatorList.get(i).difference());
		}
		int minIndex = diffMinMax.indexOf(Collections.min(diffMinMax));
		return callculatorList.get(minIndex).getID();
	}
	
	
}
