package demo.exercise.section5;

public class Ex06DecimalComparator {

	public boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
		long roundedNum1 = (long)(number1 * 1000);
		long roundedNum2 = (long)(number2 * 1000);
		return roundedNum1 == roundedNum2;
	}

}


/*
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
 * double.
 * 
 * The method should return boolean and it needs to return true if two double
 * numbers are the same up to three decimal places. Otherwise, return false.
 */