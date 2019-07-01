package Coll.contact;

import java.util.Map;

public class SearchingTheContact extends PrintingTheContact {
	/**
	 * This method used for searching  the contact details
	 */
	public void SearchingTheContact() {
		System.out.println("enter phone no");
		int key=0;
		key=scan.nextInt();
		for (Map.Entry<Long,String> entry : hmap.entrySet())  
			if(entry.getKey()==key) {
				System.out.println("phoneNumber = " + entry.getKey() + 
		                ", Name = " + entry.getValue()); 	
				}
		} 
		}

