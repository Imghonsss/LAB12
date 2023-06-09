package exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
 * Lab 12 - Exercise 7 (Processing Daily Rainfall Data from Selected Station using Character-Based Stream)
 * 
 * use BufferedReader
 * RainFallDataReader.java (package exercise 5)
 * 
 * @author Imran(B032120025)
 * 
 */

public class RainFallCharReader {

	public static void main (String [] args)
	{
		// 1
		String SourceFile = "RainfallChar.txt";
		
		// display 
		System.out.println("Reading data from " + SourceFile + "\n");
		try
		{
			
			// 2
			BufferedReader brInput = new BufferedReader(new FileReader(SourceFile));
			
			// 3
			// variables to handle data read from the source file
			
			// receive daily rainfall reading
			String DailyRainfall = "";

			int NoOfRecords = 0;

			double TotalRainfall = 0.0;
			
			
			// 3
			DailyRainfall = brInput.readLine();
			while (DailyRainfall != null) {

				System.out.println(DailyRainfall);

				TotalRainfall = TotalRainfall + Double.parseDouble(DailyRainfall);
				NoOfRecords ++;
				DailyRainfall = brInput.readLine();
			}

			System.out.println("\nTotal Records: " + NoOfRecords);

			System.out.println("Total Daily Rainfall: " + TotalRainfall);
			double averageRainfall = TotalRainfall / Double.valueOf(NoOfRecords);
			
			
			String formattedAverage = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage rainfall for " + NoOfRecords 
					+ " days from station Simpang Ampat in Alor Gajah: " + formattedAverage);
						
			// 4
			brInput.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
					
	}
	
	
}