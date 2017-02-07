import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 * 
 */

/**
 * @author bergmahb
 *
 */
public class Lab2InputOutput {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 *             Takes an input file depending on the first command line
	 *             argument given by the user and then modifies the contents of
	 *             the file and prints it to a new file which the user names.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String outFile;
		File inFile = new File(args[0]);
		Scanner in = new Scanner(inFile);
		Scanner sc = new Scanner(System.in);
		System.out.println("What would you like the name of the output file to be?");
		outFile = sc.next();
		PrintWriter PW = new PrintWriter(new File(outFile));
		int lineNum = 0;

		while (in.hasNextLine()) {
			String str = in.nextLine();
			PW.println("/* " + lineNum + " */ " + str);
			lineNum++;
		}

		PW.close();
		in.close();
		sc.close();
	}

}
