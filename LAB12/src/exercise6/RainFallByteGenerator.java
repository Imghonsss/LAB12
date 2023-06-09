package exercise6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * Lab 12 - Exercise 6 (Processing Daily Rainfall Data from Selected Station using Byte-Based Stream)
 * 
 * byte-based stream
 * DataOutputStream.class
 * 
 * @author Imran(B032120025)
 * 
 */


public class RainFallByteGenerator {
	
	public static void main (String [] args)
	{
		// 1
		String OutFile = "RainfallByte.txt";
		
		// DECLARE DATA
		// Station id
		int id[] = {2421003, 2322006, 2321006, 2222002, 2424031, 2324032};
		
		// Station name
		String Stations[] = {"Simpang Ampat", "Melaka Pindah", "Ladang Lendu", "Durian Tunggal", "Datoh Kramat di Nyalas Melaka", "Ldg. Sing Lian di Bkt. Senggeh Melaka"};
		
		// district name
		String District[] = {"Alor Gajah", "Alor Gajah", "Alor Gajah", "Alor Gajah", "Jasin", "Jasin"};
		
		// READING ON
		//3 June 2023
		double readings1[] = {4.0, 0.0, 2.0, 0.0, 0.0, 0.0};
		
		//4 June 2023
		double readings2[] = {1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		
		//5 June 2023
		double readings3[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		
		//6 June 2023
		double readings4[] = {6.0, 2.0, 3.0, 37.0, 0.0, 0.5};
		
		//7 June 2023
		double readings5[] = {19.0, 18.5, 4.0, 6.0, 17.0, 4.5};
		
		//8 June 2023
		double readings6[] = {1.0, 2.5, 0.0, 9.0, 0.0, 0.0};
		
		try {
			
			// 2
			DataOutputStream DosOut = new DataOutputStream(new FileOutputStream(OutFile));
			
			// Process data
			for (int index = 0; index < Stations.length; index++) {
				
				// 3
				DosOut.writeInt(id[index]);
				DosOut.writeUTF(Stations[index]);
				DosOut.writeUTF(District[index]);
				DosOut.writeDouble(readings1[index]);
				DosOut.writeDouble(readings2[index]);
				DosOut.writeDouble(readings3[index]);
				DosOut.writeDouble(readings4[index]);
				DosOut.writeDouble(readings5[index]);
				DosOut.writeDouble(readings6[index]);
				
				// 4
				DosOut.flush();
			}
			
			// 5
			DosOut.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// end
		System.out.println("End of program. Check out " + OutFile); 
	}
}