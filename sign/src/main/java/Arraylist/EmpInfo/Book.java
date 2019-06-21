package Arraylist.EmpInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Book {
	
	
	
	void menu() {
		System.out.println("Welcome to BookCart");
		
	}
	public static void main(String[] args) {
		Book b=new Book();
		b.menu();
		  List<String> books = new ArrayList <String> ();
		  List<String> add = new ArrayList <String> ();
		books.add("0--The Secret");
		books.add("1--CleanCoder");
		books.add("2-- MyExperienceWithTruth");
		books.add("3--Goals");
		books.add("4--CompleteCoder");
		Iterator<String> re=books.iterator();
	       
	       while(re.hasNext()) {
	    	   
	    	   System.out.println(re.next());
	       }
	       
		  
		
	      Scanner Sc=new Scanner(System.in);
	       System.out.println("Enter the Book you need add in your cart");
	       for (int i = 0; i < 3; i++) {
			
			add.add(books.get(Sc.nextInt()));
	    	
	      
		}
	      
	      
		       System.out.println("Your Cart limit has been reached");

	       
	       System.out.println( "Total number of books addded into your Cart---------->"+ add.size() );
	       Iterator<String> ref=add.iterator();
	       
	       while(ref.hasNext()) {
	    	   
	    	   System.out.println(ref.next());
	       }
	       
	   
	       // Retrieve the books Based on your Priority
	      System.out.println("Enter the Priority of deleivery");
	       String FirstPriorityOfDevliery = add.get(Sc.nextInt());
	       String secondPriorityOfDevliery = add.get(Sc.nextInt());
	       String lastPriorityOfDevliery = add.get(Sc.nextInt());

	       System.out.println("FirstPriorityOfDevliery------> " +  FirstPriorityOfDevliery);
	       System.out.println("secondPriorityOfDevliery------> " +secondPriorityOfDevliery);
	       System.out.println("lastPriorityOfDevliery--------> "+lastPriorityOfDevliery);

	       
	       
	      //replace the cart list
	       System.out.println("Modify your Cart list???");
Iterator<String> r=books.iterator();
	       
	       while(r.hasNext()) {
	    	   
	    	   System.out.println(r.next());
	       }
	       
	       add.set(Sc.nextInt(),Sc.next());
	       //add.set(Sc.nextInt(), Sc.next());
	       System.out.println("<----Modified  your Cart List---->");
	       
	       Iterator<String> refs=add.iterator();
	       while(refs.hasNext()) {
	    	   System.out.println(refs.next());
	    	   
	       }
	      
	       
	}
}
