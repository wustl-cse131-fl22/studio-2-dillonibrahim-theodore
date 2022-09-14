package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//vars

		//	String Result;
		//	String Win;
		//	String Lose;

		//inputs	
		
		Scanner in = new Scanner(System.in);
		

		System.out.println("Enter Amount:");
		double startAmount = in.nextDouble();	
		System.out.println("Win Probability:");
		double winProbability = in.nextDouble();		
		System.out.println("Enter Win Limit:");
		double winLimit = in.nextDouble();	
		double Money = startAmount;
		System.out.println("Enter Total Simulations: ");
		double totalsimulations = in.nextDouble();		
	

		//equations	
		for (int Day1 = 1; Day1<totalsimulations; ++Day1) {
		
	while	(Money < winLimit && Money>0)	{

		if (winProbability >= Math.random()) { 
			Money = Money+1; 
			System.out.println("Win!");
		} 
		else { Money = Money - 1 ; 
		
		System.out.println("Lose");

		}

	}
	System.out.println("New Total: " + "$" + Money );
	}
	
	}
}


// declare all variables -> win limit = double, win chance = double, starting amount = double, #total simulations winresult = boolean
// create input questions/method -> done
// Win prize --> + input 
// Lose prize --> - input
// win limit -->  1000
// print results -->
// loop system 

// later -> input how many days


