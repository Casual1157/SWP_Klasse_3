package exceptions;

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class PrintingTest {
	public static void main(String[] args) throws IOException {
	    File file = new File ("C:\\Users\\Casua\\Documents\\file.txt");
	    PrintWriter printWriter = new PrintWriter (file);
	    printWriter.println (LocalDateTime.now());
	    printWriter.close ();       
	  }
}
