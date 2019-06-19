package bank;
public class Main extends Savings{
Savings save;


void menu() {
char option;
System.out.println("welcome  "   +  cusname);
System.out.println("A. withdraw");
System.out.println("B. deposit");
System.out.println("C. check balance");
System.out.println("D. exit");
System.out.println("E. savings acoount");

do {
System.out.println("Enter The Above Options");
 option = scan.next().charAt(0);


switch(option) {
case 'A' :
System.out.println("Entered into Withdrawal ");
withdraw();
break;

case 'B' :
System.out.println("Entered into Deposit");
deposit();
break;
case 'C' :
System.out.println("Your Balance is  ------------> "  +  bal);
break;

case 'D' :
System.out.println("*********Thanking You For banking With Us******");
break;

case 'E' :
System.out.println("Create Savings Account");
createSavingsAcc();
break;

             default :
           	 System.out.println("Invalid Selection");
           	 break;
}
}
while(option != 'D');

System.out.println("thanks for using service");


}


public static void main(String[] args) {
//savings sav = new savings();
Main main = new Main();
//sav.setAnnualInterestRate(500);
//Main main = new Main();
main.menu();
// TODO Auto-generated method stub
//sav.checkPass(password);

}}