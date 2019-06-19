package bank;
public class Savings extends ATM{
	//String Name;
	static String password;
	String Address;
	Long number;
	char c;
	double annualInterestRate=1000;
	   double monthlyInterestRate; 
	  //char pass;
	       	void createSavingsAcc()
	    {
	            System.out.println("$$$$Enter the user name$$$");
	            cusname=scan.next();
	            System.out.println("$$$Enter the Address$$$");
	            String address = scan.next();
	            System.out.println("Enter the Number");
	            Long number = scan.nextLong();
	            System.out.println("enter your pass");
	            password=scan.next();
	            System.out.println(valPass(password));
	            System.out.println(checkPass(password));
	            System.out.println("your pass is  "  +  password);
	            }
	       	public static String valPass(String pass){
	if(pass.length() > 4) {
	System.out.println("The Password is Strong");
	return "Success";
	}
	else
	{
	System.out.println("The Password is Weak");
	return "Failed";
	}

	       	
	       	}
	       	public static boolean checkPass(String pass){
	           	boolean hasNum = false;
	           	boolean hasCap = false;
	           	boolean hasLower = false;
	           	char c;
	           	for(int i=0;i < pass.length()	;i++) {
	           	c=password.charAt(i);
	           	if(Character.isDigit(c)) {
	           	hasNum=true;
	           		       	}
	           	else if(Character.isUpperCase(c)) {
	           	hasCap=true; 
	           	return hasCap;
	           	}
	           
	           	if(hasNum  &&   hasCap ) {
	           	System.out.println("the pass has passed the its critera");
	           	return true ;
	           	}
	           	else {
	           	System.out.println("not matched the criteria");
	           	return false;
	           	}
	           	
	           	}
	    return true;
	           	
	           	
	           	}


	
}   
	    	
