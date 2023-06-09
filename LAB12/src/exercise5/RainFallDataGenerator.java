package exercise5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/*
 * Lab 12 - Exercise 5 (Task B: Implementation of Data Creation)
 * 
 * Generates data for 6 days of daily rainfall
 * output file: "RainFall.txt", DataOutputStream.
 * 
 * @author Imran (B032120025)
 * 
 */

public class RainFallDataGenerator {

	public static void main (String [] args)
	{
		// 1
		String OutFile = "RainFall.txt";
		
		try
		{
			// 2
			DataOutputStream DosOutput = new DataOutputStream(new FileOutputStream(OutFile));
			
			// 3) Write the 6 days reading of daily rainfall - 3 June 2023 to  9 June 2023
			DosOutput.write(4);
			DosOutput.write(1);
			DosOutput.write(0);
			DosOutput.write(6);
			DosOutput.write(19);
			DosOutput.write(1);
			
			// 4
			DosOutput.flush();
			
			// 5
			DosOutput.close(); 
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		// End
		System.out.println("End of program. Check out " + OutFile); 
	}
}