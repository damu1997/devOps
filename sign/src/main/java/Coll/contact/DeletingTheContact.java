package Coll.contact;

import java.util.InputMismatchException;
import java.util.Map.Entry;

public class DeletingTheContact extends AddingTheContact {
	/**
	 * This method used for deleting the contact details
	 */
	void DeletingTheContact() {
		

		System.out.println("Enter how many contacts you need to remove");	
		int in=0;
		try {
			in=scan.nextInt();
			}catch(InputMismatchException i) {
				
				System.out.println("---invalid input---");
				
			}
		for (int j = 0; j < in; j++) {
			hmap.remove(scan.nextLong());
			
		}
		System.out.println("Successfully removed");
		System.out.println("After removing the Contact");

		for (Entry<Long, String> entry : hmap.entrySet()) {
		    System.out.println(entry.getKey() + " <-->" + entry.getValue());
		}
			
		}
}
