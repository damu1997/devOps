package Coll.contact;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Contacts {


HashMap<Long,String> hs=new HashMap<Long, String>();
Scanner sc=new Scanner(System.in);

void dispaly() {
	
	
	hs.put(12332155l, "damu");
	hs.put(25836911l, "vedha");
	hs.put(78998755l, "Anag");
	hs.put(15995122l, "Logesh");
	hs.put(35745628l, "Ranjith");
	hs.put(56564589l, "saravana");
	
	for (Entry<Long, String> entry : hs.entrySet()) {
	    System.out.println(entry.getKey() +" <-->" + entry.getValue());
	}
	
}
void adding() {
System.out.println("how many contacts you need to add");	
int i=sc.nextInt();
	for (int j = 0; j < i; j++) {
		hs.put(sc.nextLong(),sc.next());
	}
	System.out.println("----Added Sucessfully----");
	for (Entry<Long, String> entry : hs.entrySet()) {
	    System.out.println(entry.getKey() + " <-->" + entry.getValue());
	}
		
	}
	
void remove() {
	

	System.out.println("Enter how many contacts you need to remove");	
	int i=sc.nextInt();
	for (int j = 0; j < i; j++) {
		hs.remove(sc.nextLong());
		
	}
	System.out.println("Successfully removed");
	System.out.println("After removing the Contact");

	for (Entry<Long, String> entry : hs.entrySet()) {
	    System.out.println(entry.getKey() + " <-->" + entry.getValue());
	}
		
	}
		
		
		
	

void replace() {
	System.out.println("how many contact you need to replace");
	int i=sc.nextInt();
	
	for (int j = 0; j < i; j++) {
		hs.replace(sc.nextLong(),sc.next());
		
	}
System.out.println("---Succesfully replaced----");
System.out.println("Updated contacts");

for (Entry<Long, String> entry : hs.entrySet()) {
	
    System.out.println(entry.getKey() + " <-->" + entry.getValue());
    
    
    
}
	
}
	
}	

