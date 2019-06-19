package bank;

import java.util.Scanner;

public class ATM {
	double bal=10000;
	// previousTransaction;
	String cusname;

	Scanner scan = new Scanner(System.in);
	void withdraw() {
	int amt;
	System.out.println("$$$$$$$Enter the Amount to Withdraw$$$$$$$");
	amt = scan.nextInt();
	if(amt<bal) {
	bal=bal-amt;
	System.out.println("Balance is -------->  "  +  bal);
	System.out.println("Withdrawed Amount-------->"+ amt );

	}
	else {
	System.out.println("Not Enough Balance!!!!!!!!!!");
	}
	}
	void deposit() { 
	System.out.println("@@@@Enter Amount To Deposit@@@@");
	Scanner scan = new Scanner(System.in);
	int amt=scan.nextInt();
	if(amt >100) {
	bal=amt+bal;
	System.out.println("Your Balalce  is -----> "  +  bal);
	System.out.println("Amount  deposited is    "  +   amt);
	}
	else {
	System.out.println("The Minimum Deposit Amount is 100");
	}

	}




}


