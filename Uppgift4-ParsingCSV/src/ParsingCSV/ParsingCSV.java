package ParsingCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParsingCSV {

	public static void main(String[] args) {
		
		String path ="F:\\Skola\\Eclipse Workspace\\Uppgift4-ParsingCSV/sample.csv";
		
		String line = "";
		
		
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			ArrayList <String> nameArrayList = new ArrayList<>();
		
			ArrayList <String> timeStampArrayList = new ArrayList<>();
		
			ArrayList <String> workSelectionArrayList = new ArrayList<>();
			
						
			while((line=br.readLine()) !=null) {
				
				String[] values = line.split(",");
				nameArrayList.add(values[1]);
				nameArrayList.add(values[2]);
				timeStampArrayList.add(values[0]);
				workSelectionArrayList.add(values[6]);
				//System.out.println("Timestamp: " + values[0] + ", Name 1: " + values[1] + ", Email 1: " + values [3] + ", Name 2: " + values [2] + ", Email 2: " + values[4]);
			}
			
			
			int counter = 0;
			
			
			for (String names : nameArrayList) {
				if (names.toLowerCase().contains("a")) {
					counter++;
				}
			}
			
			System.out.println("Antal namn med bokstaven A: " + counter + "\n");
			
			
			
			
			
			
			
			
			for (int i = 0; i < nameArrayList.size(); i++) {
	            if (i == nameArrayList.size()-1){ // protect to go out of bounds
	                // do nothing man
	            }else{
	                System.out.println(nameArrayList.get(i) + " : " + nameArrayList.get(i+1));
	            }
	            i++;
	        }
			
			
			counter = 0;
			for (String workSelection : workSelectionArrayList) {
				if (workSelection.toLowerCase().contains("android")) {
					counter++;
				}
			}
			
			System.out.println("\nAntal som använder android: " + counter);
			
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
