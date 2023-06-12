// calculating population 
//1 birth every 7sec
//1 death every 13 second 
//1 immigrant every 45 second
//current 312,032,486 peoples in us

package population;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Population {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private static Scanner sc = new Scanner(System.in)
			;
	public static void main(String [] args)
	{
		double currentPopulation = 312032486;
		double birthsPeryear =4505142.897;
		double deathsPeryear = 2425846.154;
		int immigrantsPerYear = 700800;
		
		
		System.out.println(
				"How many year do you want to calculate? ");
		int howMany = sc.nextInt();
		
				
		for (int count = 0;count < howMany;count++) {
			
			
			System.out.println(
					"Population in year" + count +  "= " + df2.format(currentPopulation));
			
			currentPopulation = currentPopulation 
					+ birthsPeryear 
					+ immigrantsPerYear 
					- deathsPeryear;
		}
		
		
	}

}
