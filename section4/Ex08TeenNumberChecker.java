package demo.exercise.section4;

public class Ex08TeenNumberChecker {

	public boolean hasTeen(int age1, int age2, int age3) {
		
		return isTeen(age1) || isTeen(age2) || isTeen(age3);
	}
	
	public boolean isTeen(int age) {
		return age >= 13 && age <= 19;
	}

}

/*
 * 1.We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
 * 
 * Write a method named hasTeen with 3 parameters of type int.
 * 
 * The method should return boolean and it needs to return true if one of the
 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
 * false.
 * 
 * 2.Write another method named isTeen with 1 parameter of type int.
 * 
 * The method should return boolean and it needs to return true if the parameter
 * is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
 */