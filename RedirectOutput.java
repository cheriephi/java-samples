import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Shows how to redirect System.out from the console window to memory
 * @author Cherié Warren
 *
 */
public class RedirectOutput {
	public static void main(String[] args) {
	    // Tell Java to output to memory.
		ByteArrayOutputStream output = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(output);
	    System.setOut(ps);
	    
	    // Print. This will go to our new stream.
	    System.out.println("Hello world!");

	    // Redirect back to console window.
	    System.out.flush();
	    System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
	    
	    // Show what happened.
	    System.out.println("Output: " + output.toString());	    
	}
}
