package Coll.contact;

import java.util.InputMismatchException;
import java.util.Map.Entry;

public class AddingTheContact extends DisplayingTheContact{
	/**
	 * This method used for Adding the contact details
	 */
	void AddingTheContact() {
		System.out.println("how many contacts you need to add");
		int in=0;
		try {
		in=scan.nextInt();
		}
		catch(InputMismatchException i) {
			
			System.out.println("---invalid input---");
			String s=i.getMessage();
			System.out.println(s);
			AddingTheContact();
			
		}


		for (int j = 0; j < in; j++) {
			
				hmap.put(scan.nextLong(),scan.next());
			}


			System.out.println("----Added Sucessfully----");
			
			
			
			for (Entry<Long, String> entry : hmap.entrySet()) {
			    System.out.println(entry.getKey() + " <-->" + entry.getValue());
			}
				
			}
}
