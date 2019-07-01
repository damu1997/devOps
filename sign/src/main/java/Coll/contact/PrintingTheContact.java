package Coll.contact;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PrintingTheContact extends RenameTheContact{
	/**
	 * This method used for printing  the contact details into txt file and reads the file
	 * @throws IOException
	 */
	void PrintingTheContact() throws IOException {
		fstream = new FileWriter("C:\\Users\\Damodaran.Krishnan\\Desktop\\manifest.txt");
		fr=new FileReader("C:\\Users\\Damodaran.Krishnan\\Desktop\\manifest.txt");
		BuffWr = new BufferedWriter(fstream);
		    int count = 0;
		  
		    
		    Iterator<Entry<Long, String>> it = hmap.entrySet().iterator();

		    int recordsToPrint=hmap.size();
			
		    while (it.hasNext()  && count < recordsToPrint) {

		       
		        Map.Entry<Long, String> pairs = it.next();
		       //System.out.println("contact-->" + pairs.getKey()+"<---> "+pairs.getValue());

		  
		        BuffWr.write(pairs.getValue() + " "+pairs.getKey()+"\n");

		  
		        count++;
		    }
		    System.out.println("----printed sucessfully----");
		    BuffWr.close();
		    System.out.println("----view of txt file");
		    int i=0;
		    while((i=fr.read())!=-1) {
		    	
		    	System.out.print((char)i);
		    	
		    }
		    
		
	}

}
