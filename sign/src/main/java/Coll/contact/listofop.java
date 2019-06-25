package Coll.contact;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class listofop extends Contacts {
	Scanner sc=new Scanner(System.in);
	void menu() {
		int option = 0;
		System.out.println("1.Display the Contact");
		System.out.println("2.Add  contact");
		System.out.println("3.Remove Contact ");
		System.out.println("4.Replace Contact");
		System.out.println("5.print the contacts into file");
		System.out.println("6.search the data");
		
		
	do {
		
		 option = sc.nextInt();

			
		
		switch(option) {
		case 1:
			System.out.println("Displaying the Contact");
			dispaly();
			
			break;

			case 2 :
			System.out.println("Adding the Contact");
			adding();
			
			break;
			
			case 3 :
			System.out.println("Removing the Contact" );
			remove();
			break;

			case 4 :
			System.out.println("Replacing the Contact");
			replace();
			
			break;
		

			case 5 :
			System.out.println("printing the data");
			try {
				print();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
			
			case 6 :
				System.out.println("searching the data");
			searchmap();
			break;

	        default :
	      	 System.out.println("Invalid Selection");
	      	 break;
		
		
		}
	}
		
		while(option != 10); {
			System.out.println("thanks for using this application");
			
		}
			
		}
public static void main(String[] args) {

listofop ls=new listofop();
ls.menu();

	
	
}
}






























