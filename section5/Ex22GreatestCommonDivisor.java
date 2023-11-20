package demo.exercise.section5;

public class Ex22GreatestCommonDivisor {

	public int getGreatestCommonDivisor(int first, int second) {
		if (first < 10 || second < 10)
			return -1;
		int minimumOfTwo = first < second ? first : second;
		int gcdNumber = 0;
		for(int i = 1;i <= minimumOfTwo; i++) {
			if( first % i == 0 && second % i == 0) {
				gcdNumber = i > gcdNumber ? i : gcdNumber;
			}
		}
		
		return gcdNumber;
	}
}

/*
 * Write a method named getGreatestCommonDivisor with two parameters of type int
 * named first and second.
 * 
 * If one of the parameters is < 10, the method should return -1 to indicate an
 * invalid value.
 * 
 * The method should return the greatest common divisor of the two numbers
 * (int).
 * 
 * The greatest common divisor is the largest positive integer that can fully
 * divide each of the integers (i.e. without leaving a remainder).
 */