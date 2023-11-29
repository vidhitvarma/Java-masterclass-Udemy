package demo.exercise.section5;

public class Ex27DiagonalStar {
	public static void printSquareStar(int number) {
		if (number < 5)
			System.out.println("Invalid Value");
		else {
			for (int row = 1; row <= number; row++) {
				for (int column = 1; column <= number; column++) {

//					First row /column
					boolean isFirst = (row == 1 || column == 1);

//					Last row/column
					boolean isLast = (column == number || row == number);

//					same row/column 
					boolean checkSame = (row == column) ;
					
					boolean checkCondition = (column == (number - row + 1)); 

					if (checkSame || isFirst || isLast || checkCondition) {
						
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println(" ");
			}
		}
	}

	public static void main(String[] args) {
		//printSquareStar(8);
		printSquareStar(5);
	}
}

/*
 * Write a method named printSquareStar with one parameter of type int named
 * number.
 * 
 * If number is < 5, the method should print "Invalid Value".
 * 
 * The method should print diagonals to generate a rectangular pattern composed
 * of stars (*). This should be accomplished by using loops (see examples
 * below).
 */