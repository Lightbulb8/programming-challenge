package de.exxcellent.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader implements FileReader {
	public String csvPath;
	
	public CSVReader(String csvpath) {
		this.csvPath = csvpath;
	}
	
	public List<List<String>> getRowsFromFile() {
		List<List<String>> records = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(csvPath));) {
		    while (scanner.hasNextLine()) {
		        records.add(splitLineAtSeperator(scanner.nextLine()));
		    }
		} catch (FileNotFoundException e) {
			System.out.println("File not found at path: " + this.csvPath);
		}
		return records;
	}
	
	private List<String> splitLineAtSeperator(String line) {
		List<String> values = new ArrayList<String>();
	    Scanner rowScanner = new Scanner(line);
		rowScanner.useDelimiter(",");
	    while (rowScanner.hasNext()) {
	        values.add(rowScanner.next());
	    }
	    rowScanner.close();
	    return values;
	}
}
