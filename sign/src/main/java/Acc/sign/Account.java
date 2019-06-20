package Acc.sign;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Account{

String UserName;
String Email;
long PhoneNum;
String Password;
void UserName() {
Scanner ref=new  Scanner(System.in);
System.out.println("-----Enter your Name----");
UserName=ref.next();
for (int i = 0; i < UserName.length(); i++) {
char Name=UserName.charAt(i);
if(!Character.isDigit(Name)){

	
}
else {
	System.out.println("-----invalid Name----");
	UserName();
	
	
}

}


}
void PhoneNumber() {
	
Scanner can=new  Scanner(System.in);
System.out.println("-----Enter your PhoneNumber----");	


try {
	PhoneNum=can.nextLong();
	
}
catch(InputMismatchException i) {
String msg= i.getMessage();
System.out.println("!!!! invalidNumber !!!!");
PhoneNumber();	
}		
}
void EmailId() {
	
Scanner can=new  Scanner(System.in);
System.out.println("-----Enter your EmailId----");	
Email=can.next();
Email=Email.toLowerCase();
System.out.println("------SuccessFull Created Email Id-----"+Email);
}
void Password() {
	
	Scanner can=new  Scanner(System.in);
	String pattern="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
	System.out.println("-----Enter your Password----");	
	Password=can.next();
	
	
	
	if(Password.length()>=8) {
	System.out.println("your password is strong");
	}
	try {
if(Password.length()<8){
	
		throw new lessthaneight("weak password");
		
		}
		
}
catch(lessthaneight e) {
	
	System.out.println("your password is weak ---> reEnter");
	Password();
	
}
}
}