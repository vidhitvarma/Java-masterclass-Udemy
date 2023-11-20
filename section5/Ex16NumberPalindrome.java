package demo.exercise.section5;

public class Ex16NumberPalindrome {
	
	public boolean isPalindrome(int number) {
		int reversedNumber = 0;
		int numberCopy = number;
		while (numberCopy != 0) {
			reversedNumber = reversedNumber * 10 + (numberCopy % 10);
			numberCopy = numberCopy / 10;
		}
		
		return reversedNumber == number;
	}
	

}


//Write a method called isPalindrome with one int parameter called number.
//
//The method needs to return a boolean.
//
//It should return true if the number is a palindrome number otherwise it should return false. 
//
//Check the tips below for more info about palindromes.