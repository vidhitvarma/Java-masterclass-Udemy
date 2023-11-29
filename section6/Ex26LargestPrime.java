package demo.exercise.section6;

public class Ex26LargestPrime {
	
	public int getLargestPrime(int number) {
		if(number < 2) return -1;
		int largestNumber = -1;
		for(int i = 2; i <= number; i++) {
			if((number % i == 0)) {
				largestNumber = i;
				number = number / i;
				i--;
			}
			
			System.out.println(largestNumber+" "+i);
				
		}
		
		return largestNumber > 0 ? largestNumber : -1;
	}
}

/*
 * Write a method named getLargestPrime with one parameter of type int named
 * number.
 * 
 * If the number is negative or does not have any prime numbers, the method
 * should return -1 to indicate an invalid value.
 * 
 * The method should calculate the largest prime factor of a given number and
 * return it.
 */