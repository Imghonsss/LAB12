package exercise5;

import java.io.DataInputStream;
import java.io.FileInputStream;

/*
 * Lab 12 - Exercise 5 (Task D: Implementation of Data Consumption)
 * 
 * Generates data for 6 days of daily rainfall
 * output file: "RainFall.txt", DataOutputStream.
 * 
 * @author Imran (B032120025)
 * 
 */


public class RainFallDataReader {
	
	public static void main(String[] args) {

		// 1
		String SourceFile = "RainFall.txt";
		
		// display 
		System.out.println("Reading data from " + SourceFile + "\n");

		try {

			// 2
			DataInputStream DisInput = new DataInputStream(new FileInputStream(SourceFile));
			
			// 3
			// variables to handle data read from the source file
			// receive daily rainfall reading
			double DailyRainfall = 0;
			int NoOfRecords = 0;
			double TotalRainfall = 0.0;
			DailyRainfall = DisInput.read();
			
			System.out.println("The 6 days readings of daily rainfall from station Simpang Ampat in Alor Gajah: ");
			
			// a: read until end of file/stream
			while (DailyRainfall != -1) {
				
				System.out.println(DailyRainfall);

				TotalRainfall = TotalRainfall + DailyRainfall;

				NoOfRecords ++;

				DailyRainfall = DisInput.read();
	
			} 
			
			System.out.println("\nTotal Records: " + NoOfRecords);

			System.out.println("Total Daily Rainfall: " +TotalRainfall);
		
			double averageRainfall = TotalRainfall / Double.valueOf(NoOfRecords);
			
			
			String formattedAverage = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage rainfall for " + NoOfRecords 
					+ " days from station Simpang Ampat in Alor Gajah: " + formattedAverage);
			
			
			// 4
			DisInput.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// End
		System.out.println("\nEnd of program.");
		

	}
}
