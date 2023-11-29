package demo.exercise.section6;

public class Ex19SharedDigit {

	public boolean hasSharedDigit(int number1, int number2) {
		if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99)
			return false;
		return (number1 / 10 == number2 / 10) || (number1 / 10 == number2 % 10) || (number1 % 10 == number2 / 10)
				|| (number1 % 10 == number2 % 10);
	}
}

//
//Write a method named hasSharedDigit with two parameters of type int. 
//
//Each number should be within the range of 10 (inclusive) - 99 (inclusive). 
//If one of the numbers is not within the range, the method should return false.
//
//The method should return true if there is a digit that appears in both numbers, 
//such as 2 in 12 and 23; otherwise, the method should return false.