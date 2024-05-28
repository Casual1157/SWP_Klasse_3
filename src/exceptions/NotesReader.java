package exceptions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NotesReader {
	static String note = "C,|D,|E,|F,|G,|A,|B,|C|D|E|F|G|A|B|c|d|e|f|g|a|b|c'|d'|e'|f'|g'|a'|b'|";
	public static final Pattern notes = Pattern.compile(note);
	
	public static void main(String[] args) {
		System.out.println("M: C");
		System.out.println("L: 1/4");
		System.out.println("K: C");
		Scanner sc;
		String output = "";
		try{
			sc = new Scanner(Paths.get("C:\\Users\\Casua\\eclipse-workspace\\mert_kisa_3HB\\src\\exceptions\\textnote.txt"));
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				if(notes.matcher(str).matches()) {
					output = output + str + " ";
					System.out.print(str + " ");
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			File file = new File ("C:\\Users\\Casua\\eclipse-workspace\\mert_kisa_3HB\\src\\exceptions\\textnote2.txt");
		    PrintWriter noteWriter = new PrintWriter (file);
		    noteWriter.println ("M: C");
		    noteWriter.println("L: 1/4");
		    noteWriter.println("K: C");
		    noteWriter.print(output);
		    noteWriter.close ();       
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
