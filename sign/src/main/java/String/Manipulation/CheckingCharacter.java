package String.Manipulation;

import java.util.Scanner;

public class CheckingCharacter {
	/**
	 * To find alphabets, digits and special characters separately from given string
	 */
Scanner scan=new Scanner(System.in);
String word;
char[] C= {};
int SumOfAlp;
int SumOfDigits;
int  SumOfSpeciaCharacter;
/**
 *Based on the ASCII values it differentiate the specialchar,alphabets and digits
 * 
 */
void checking() {
System.out.println("---Enter the Word to Check Alphabets,Digits,SpecialCharacters---");
word=scan.next();
	char[] C=word.toCharArray();
for (int i = 0; i < C.length; i++) {
	int count=0;
	 if ((C[i] >= 65 && C[i] <= 90||(C[i] >= 97 && C[i] <= 122))) {
	            
	            ++count;
	          
	            SumOfAlp=SumOfAlp+count;      
	 }
	 
	 else if (C[i] >= 48 && C[i] <= 57) {
			int increment=0;
        
         ++increment;
         
         SumOfDigits=SumOfDigits+increment;
        
        
	 }
	 
	 
	 else {
			int inc=0;
			++inc;
		
	 
	 SumOfSpeciaCharacter= SumOfSpeciaCharacter+inc;
	 
	 
	 }
	
}
System.out.println("Total Number of Special Character in this word is--->"+SumOfSpeciaCharacter);	
System.out.println("Total Numbers in this word is--->"+SumOfDigits);
System.out.println("Total Number of Alphabets in this word is--->"+SumOfAlp);
}

public static void main(String[] args) {
	
CheckingCharacter CCref=new CheckingCharacter();
CCref.checking();
	
	
	
	
}

}