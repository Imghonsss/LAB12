package exercise6;

import java.io.DataInputStream;
import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * Lab 12 - Exercise 6 (Processing Daily Rainfall Data from Selected Station using Byte-Based Stream)
 * 
 * byte-based stream
 * DataInputStream.class
 * 
 * @author Imran(B032120025)
 * 
 */

public class RainFallByteReader {

	public static void main(String[] args) {

		// 1
		String SourceFile = "RainfallByte.txt";
		System.out.println("Reading data from " + SourceFile + "\n");
		
		try {

			// 2
			DataInputStream DisIn = new DataInputStream(new FileInputStream(SourceFile));

			// Variables for processing byte-based data
			// Station Id
			int id = 0;
			
			// Station Name and District
			String Station = " ", District = " ";
			
			// Daily rainfall readings from 3 June 2023 to 8 June 2023
			double readings1 = 0.0, readings2 = 0.0, readings3 = 0.0;
			double readings4 = 0.0, readings5 = 0.0, readings6 = 0.0;
		
			// Total 
			int NoOfRecords = 0;

			double sum = 0.0;
			ArrayList <Double> totalRainfall = new ArrayList<Double>();

			ArrayList<String> Stations = new ArrayList<String>();
			HashSet<String> DistrictCount = new HashSet<String>();
			
			
			// 3. Process data until end-of-file
			while(DisIn.available() > 0) {
				
				// Read data
				
				// station id
				id = DisIn.readInt();
				
				// station name
				Station = DisIn.readUTF();
				
				// district
				District = DisIn.readUTF();
				
				// daily rainfall readings for 1 June 2023
				readings1 = DisIn.readDouble();
				
				// daily rainfall readings for 2 June 2023
				readings2 = DisIn.readDouble();
				
				// daily rainfall readings for 3 June 2023
				readings3 = DisIn.readDouble();
				
				// daily rainfall readings for 4 June 2023
				readings4 = DisIn.readDouble();
				
				// daily rainfall readings for 5 June 2023
				readings5 = DisIn.readDouble();
				
				// daily rainfall readings for 6 June 2023
				readings6 = DisIn.readDouble();
				
				System.out.println( id + "\t" + Station + "\t" + District
						+ "\t" + readings1 + "\t" + readings2 + "\t" + readings3 
						+ "\t" + readings4 + "\t" + readings5 + "\t" + readings6 );
				
				// calculate total daily rainfall readings for each station
				sum = readings1 + readings2 + readings3 + readings4 + readings5 + readings6;
				totalRainfall.add(sum);
				Stations.add(Station);
				DistrictCount.add(District);
				NoOfRecords ++;
			}
			
			System.out.println("\n");
			
			// Calculation for average daily rainfall readings in each station
			for(int index = 0; index < Stations.size(); index++)
			{
				double average = totalRainfall.get(index) / NoOfRecords;
				
				String formattedAverage = String.format("%.1f", average);

				System.out.println("The total daily rainfall readings in " + Stations.get(index) + " : " 
						+ totalRainfall.get(index) );
				System.out.println("The average daily rainfall readings in " + Stations.get(index) + " : " 
						+ formattedAverage + "\n");
			}
			
			System.out.println("There are " + Stations.size() + " stations and "
						+ DistrictCount.size() + " districts in Melaka.");
			
			// 4
			DisIn.close();
	
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// End
		System.out.println("\nEnd of program.");
	}
}