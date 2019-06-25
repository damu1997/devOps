package Coll.contact;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Contacts {


HashMap<Long,String> hs=new HashMap<Long, String>();
Scanner sc=new Scanner(System.in);
FileWriter fstream ;
BufferedWriter out;
FileReader fr;


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
int in=0;
try {
in=sc.nextInt();
}
catch(InputMismatchException i) {
	
	System.out.println("---invalid input---");
	String s=i.getMessage();
	System.out.println(s);
	adding();
	
}


for (int j = 0; j < in; j++) {
	
		hs.put(sc.nextLong(),sc.next());
	}


	System.out.println("----Added Sucessfully----");
	
	
	
	for (Entry<Long, String> entry : hs.entrySet()) {
	    System.out.println(entry.getKey() + " <-->" + entry.getValue());
	}
		
	}
	
void remove() {
	

	System.out.println("Enter how many contacts you need to remove");	
	int in=0;
	try {
		in=sc.nextInt();
		}catch(InputMismatchException i) {
			
			System.out.println("---invalid input---");
			
		}
	for (int j = 0; j < in; j++) {
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
	int in=0;
	try {
		in=sc.nextInt();
		}catch(InputMismatchException i) {
			
			System.out.println("---invalid input---");
			
		}
	
	for (int j = 0; j < in; j++) {
		hs.replace(sc.nextLong(),sc.next());
		
	}
System.out.println("---Succesfully replaced----");
System.out.println("Updated contacts");

for (Entry<Long, String> entry : hs.entrySet()) {
	
    System.out.println(entry.getKey() + " <-->" + entry.getValue());
    
    
    
}

	
}
void print() throws IOException {
	fstream = new FileWriter("C:\\Users\\Damodaran.Krishnan\\Desktop\\manifest.txt");
	fr=new FileReader("C:\\Users\\Damodaran.Krishnan\\Desktop\\manifest.txt");
	out = new BufferedWriter(fstream);
	    int count = 0;
	  
	    
	    Iterator<Entry<Long, String>> it = hs.entrySet().iterator();

	    int recordsToPrint=hs.size();
		
	    while (it.hasNext()  && count < recordsToPrint) {

	       
	        Map.Entry<Long, String> pairs = it.next();
	       //System.out.println("contact-->" + pairs.getKey()+"<---> "+pairs.getValue());

	  
	        out.write(pairs.getValue() + " "+pairs.getKey()+"\n");

	  
	        count++;
	    }
	    System.out.println("----printed sucessfully----");
	    out.close();
	    System.out.println("----view of txt file");
	    int i=0;
	    while((i=fr.read())!=-1) {
	    	
	    	System.out.print((char)i);
	    	
	    }
	    
	
}





public void searchmap() {
System.out.println("enter phone no");
int key=0;
key=sc.nextInt();
for (Map.Entry<Long,String> entry : hs.entrySet())  
	if(entry.getKey()==key) {
		System.out.println("phoneNumber = " + entry.getKey() + 
                ", Name = " + entry.getValue()); 	
		}
} 
}

	



