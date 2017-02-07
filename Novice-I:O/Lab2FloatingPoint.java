import java.util.InputMismatchException;
import java.util.Scanner;

//how to count inside a try/catch block
/**
 * 
 */

/**
 * @author bergmahb
 *
 */
public class Lab2FloatingPoint {

	/**
	 * @param args
	 * Takes input from the user in individual floating point values
	 * It stops the program and adds all the values when two non-floating point values
	 * are entered in a row.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float inputFloatSum = 0;
		float inputFloat;
		int catches = 0;

		while (catches <= 1) {
			try {
				System.out.println("Input a floating point value");
				in = new Scanner(System.in);
				inputFloat = in.nextFloat();
				inputFloatSum = inputFloat + inputFloatSum;
				catches = 0;
			} catch (InputMismatchException i) {
				System.out.println("Not a float value. Try again");
				catches++;
			}
		}
		System.out.println("The total of the entered values was " + inputFloatSum);
		in.close();
	}
}
