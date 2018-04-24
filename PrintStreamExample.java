import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Shows polymorphic behavior of PrintStream, where it can iterate through different underlying types.
 * @author Cherié Warren
 *
 */
public class PrintStreamExample {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream[] outs = {System.out, new PrintStream("myoutputfile.txt")};
		for (PrintStream out: outs) {
			out.println("Hello world!");
			System.out.println(String.format("Class: %s", out.getClass()));
			out.close();			
		}		
	}
}
