package Coll.contact;

import java.util.Scanner;

public class listofop extends Contacts {
	Scanner sc=new Scanner(System.in);
	void menu() {
		int option = 0;
		System.out.println("1.Display the Contact");
		System.out.println("2.Add  contact");
		System.out.println("3.Remove Contact ");
		System.out.println("4.Replace Contact");
		System.out.println("5.Exit");
		
		
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
			System.out.println("Thank you");
		
			break;

	        default :
	      	 System.out.println("Invalid Selection");
	      	 break;
		
		
		}
	}
		
		while(option != 5); {
			System.out.println("thanks for using this application");
			
		}
			
		}
public static void main(String[] args) {

listofop ls=new listofop();
ls.menu();
	
	
}
}






























