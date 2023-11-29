package demo.exercise.section5;

public class Ex01PositiveNegativeZero {

	public void checkNumber(int number) {
		System.out.println(number == 0 ? "zero" : number < 0 ? "negative" : "positive");
	}

}

/*
 * Write a method called checkNumber with an int parameter named number.
 * 
 * The method should not return any value, and it needs to print out: -
 * "positive" if the parameter number is > 0 - "negative" if the parameter
 * number is < 0 - "zero" if the parameter number is equal to 0
 */
