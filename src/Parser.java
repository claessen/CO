import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Parser {

	/**
	 * @param args
	 */

	public void readFromFileWithReadLine(String filename) {
		File myFile = new File(filename);
		String line;
		BufferedReader br = null;
		try {
			br = new BufferedReader (new FileReader(myFile));
			try {
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
	}
	
/*	public void readFromFileWithTokenizer(String filename) {
		File myFile = new File(filename);
		BufferedReader br = null;		
		String line;
		try {
			br = new BufferedReader (new FileReader(myFile));
			try {
				while ((line = br.)
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}*/
	
	public static void main(String[] args) {

		new Parser().readFromFileWithReadLine("wordlist.txt");
		


	} 

}
