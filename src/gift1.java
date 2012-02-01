/*
ID: paul8
LANG: JAVA
TASK: gift1
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class gift1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File myFile = new File("gift1.in");
		File outFile = new File("gift1.out");
		Map<String, Integer> personBalance = new LinkedHashMap<String, Integer>();
		BufferedReader br;
		String line;
		int personCount = 0;

		try {
			br = new BufferedReader(new FileReader(myFile));

			line = br.readLine();
			String donorName;
			String recipientName;
			int friendCount = 0;
			int initBalance = 0;
			personCount = (int) Integer.parseInt(line);

			// Populate the initial balances with zero
			for (int i = 0; i < personCount; i++) {
				line = br.readLine();
				// Fill the hash map, initially with zero balance
				personBalance.put(line, 0);
			}

			/*
			 * Now to read the section with format NAME INIT_BALANCE
			 * FRIEND_COUNT FRIEND_1 FRIEND_N
			 */

			for (int i = 0; i < personCount; i++) {
				donorName = br.readLine();
				line = br.readLine();
				StringTokenizer s = new StringTokenizer(line);
				initBalance = (int) Integer.parseInt(s.nextToken());
				friendCount = (int) Integer.parseInt(s.nextToken());
				int giftAmount = 0;
				if (friendCount > 0) {
					giftAmount = initBalance / friendCount;
					personBalance.put(donorName,
							(int) personBalance.get(donorName)
									- (giftAmount * friendCount));
				}
				for (int j = 0; j < friendCount; j++) {
					recipientName = br.readLine();
					personBalance.put(recipientName,
							personBalance.get(recipientName) + giftAmount);
				}

			}

			// Print out results
			
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));

			for (Map.Entry<String, Integer> pair : personBalance.entrySet()) {
				String key = pair.getKey();
				Integer value = pair.getValue();
				out.println(key + " " + value);
			}
			out.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException nfe) {
			System.out.println("Number format exception.");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
