package demo.exercise.section6;

public class Ex20LastDigitChecker {
	
	
	public boolean hasSameLastDigit(int number1, int number2, int number3) {
		if(isValid(number1) && isValid(number2) && isValid(number3)) {
			return (number1 % 10 == number2 % 10) || (number2 % 10 == number3 % 10) || (number1 % 10 == number3 % 10);
		}else
			return false;
	}
	
	public boolean isValid(int number) {
		return number >= 10 && number <= 1000;
	}
}


/*
 * Write a method named hasSameLastDigit with three parameters of type int.
 * 
 * Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
 * If one of the numbers is not within the range, the method should return
 * false.
 * 
 * The method should return true if at least two of the numbers share the same
 * rightmost digit; otherwise, it should return false.
 * 
 * Write another method named isValid with one parameter of type int.
 *
 * The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), 
 * otherwise return false.
 */