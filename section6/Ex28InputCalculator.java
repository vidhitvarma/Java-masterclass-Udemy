package demo.exercise.section6;

import java.util.Scanner;

public class Ex28InputCalculator {
	
	public  void inputThenPrintSumAndAverage() {
		int sum = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()) {
			while(scanner.hasNextInt()) {
				sum += scanner.nextInt();
				count++;
			}
			scanner.close();
		}
		if(sum == 0)
			System.out.println("SUM = 0 AVG = 0");
		else
			System.out.println("SUM = "+sum+ " AVG = "+Math.round((double)sum/count));
	}
	
	
}


/*
 * Write a method called inputThenPrintSumAndAverage that does not have any
 * parameters.
 * 
 * The method should not return anything (void) and it needs to keep reading int
 * numbers from the keyboard.
 * 
 * When the user enters something that is not an int then it needs to print a
 * message in the format "SUM = XX AVG = YY".
 * 
 * XX represents the sum of all entered numbers of type int. YY represents the
 * calculated average of all numbers of type long.
 */