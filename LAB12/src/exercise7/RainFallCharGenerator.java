package exercise7;


import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * Lab 12 - Exercise 7 (Processing Daily Rainfall Data from Selected Station using Character-Based Stream)
 * 
 * use BufferedWriter
 * RainFallDataWriter.java (package exercise 5)
 * 
 * @author Imran(B032120025)
 * 
 */

public class RainFallCharGenerator {

	public static void main (String [] args)
	{
		// 1
		String OutFile = "RainfallChar.txt";
		try
		{		
			// 2
			FileWriter files = new FileWriter(OutFile);
			BufferedWriter bwOutput = new BufferedWriter(files);
			int [] array= {5,0,5,2,1,1};
			
			// 3
			for (int index = 0; index < array.length; index++) {
				bwOutput.write(String.valueOf(array[index]));
				bwOutput.newLine();
			}
			
			
			// 4
			bwOutput.flush(); 
			
			// 5
			bwOutput.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// End
		System.out.println("End of program. Check out " + OutFile); 
	}
	
}