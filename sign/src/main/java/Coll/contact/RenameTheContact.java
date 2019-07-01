package Coll.contact;

import java.util.InputMismatchException;
import java.util.Map.Entry;

public class RenameTheContact extends DeletingTheContact{
	/**
	 * This method used for rename the contact details
	 */
	void RenameTheContact() {
		System.out.println("how many contact you need to replace");
		int in=0;
		try {
			in=scan.nextInt();
			}catch(InputMismatchException i) {
				
				System.out.println("---invalid input---");
				
			}
		
		for (int j = 0; j < in; j++) {
			hmap.replace(scan.nextLong(),scan.next());
			
		}
	System.out.println("---Succesfully replaced----");
	System.out.println("Updated contacts");

	for (Entry<Long, String> entry : hmap.entrySet()) {
		
	    System.out.println(entry.getKey() + " <-->" + entry.getValue());
	    
	    
	    
	}	
	}
}
