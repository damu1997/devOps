package Coll.contact;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class DisplayingTheContact {
	HashMap<Long,String> hmap=new HashMap<Long, String>();
	Scanner scan=new Scanner(System.in);
	FileWriter fstream ;
	BufferedWriter BuffWr;
	BufferedReader BuffRr;
	FileReader fr;
    //HashMap<String> list=new ArrayList<String>();
	/**
	 *This method displays the contact details
	 * @throws IOException 
	 *
	 */
	void dispaly()  {
		
		
		
		hmap.put(12332155l, "damu");
		hmap.put(25836911l, "vedha");
		hmap.put(78998755l, "Anag");
		hmap.put(15995122l, "Logesh");
		hmap.put(35745628l, "Ranjith");
		hmap.put(56564589l, "saravana");
		
		for (Entry<Long, String> entry : hmap.entrySet()) {
		    System.out.println(entry.getKey() +" <-->" + entry.getValue());
		}
		
}
}