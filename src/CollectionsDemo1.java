import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CollectionsDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File myFile = new File("names.txt");
		String line;
		BufferedReader br = null;
		
		List<Person> list = new ArrayList<Person>();
		
		try {
			br = new BufferedReader (new FileReader(myFile));
			try {
				while ((line = br.readLine()) != null) {
					System.out.println(line);
					Person p = new Person(line);
					list.add(p);				
					System.out.println(p.getName());
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("list has " + list.size() + " people in it.");
		
		for (Person p : list) {
			System.out.println(p.getName());
		}

	}

}

class Person {
	private String firstName;
	private int balance;
	Person(String fn, int b) {
		this.firstName = fn;
		this.balance = b;
	}
	
	public String getName() {
		return firstName;
	}
	
	public int getBalance() {
		return balance;
	}

}
