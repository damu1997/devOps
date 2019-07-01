package Coll.contact;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main extends SearchingTheContact {
	Scanner scan=new Scanner(System.in);
	void menu() {
		int option = 0;
		System.out.println("1.Display the Contact");
		System.out.println("2.Add  contact");
		System.out.println("3.Delete the Contact ");
		System.out.println("4.Rename the Contact");
		System.out.println("5.print the contacts into file");
		System.out.println("6.search the Contact details");
		
		
	do {
		
		 option = scan.nextInt();

			
		
		switch(option) {
		case 1:
			System.out.println("Displaying the Contact");
			dispaly();
			
			break;

			case 2 :
			System.out.println("Adding the Contact");
			AddingTheContact();
			
			break;
			
			case 3 :
			System.out.println(" Deleting the Contact" );
			DeletingTheContact();
			break;

			case 4 :
			System.out.println("Rename the Contact");
			RenameTheContact();
			
			break;
		

			case 5 :
			System.out.println("printing the Contact details");
			try {
				PrintingTheContact();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
			
			case 6 :
				System.out.println("searching the Contact details");
			SearchingTheContact();
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

Main mainRef=new Main();
mainRef.menu();

		
}
}