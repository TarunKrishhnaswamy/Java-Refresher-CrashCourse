package io.github.tarunkrishnaswamy.corejava.project.atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {

	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	public void getLogin() throws IOException{
		
		int x =1;
		do {
			try {
				//here dataput(customerno, atm pin)
				data.put(952541,191904);
				data.put(989947, 71976);
				
				System.out.println("ATM PROJECT!");
				System.out.println("ENTER CUSTOMER NO:");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("ENTER PIN:");
				setPinNumber(menuInput.nextInt());
				
			}catch (Exception e) {
				System.out.println("\n"+"Invalid character(s). Only numbers please."+"\n");
				x=2;
			}
			/*
			 * for (Map.Entry<Integer,Integer> it : data.entrySet()){
			 * if(it.getkey()==getCustomerNumber()&& it.getValue()==getPinNumber){
			 * getAccountType();}}
			 * 
			 */
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if(data.containsKey(cn) && data.get(cn)==pn) {
				getAccountType();
			}else
				System.out.println("\n"+"Incorrect Customer Number or Pin Number"+"\n");
		}while (x==1);
	}
	
	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("1: Checking Account");
		System.out.println("2: Saving Account");
		System.out.println("3: Exit");
		
		int selection = menuInput.nextInt();
		
		switch(selection) {
		
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using this ATM, bye! \n");
			break;
		default:
			System.out.println("\n"+"Invalid Choice"+"\n");
		}
			
	}
	
	public void getChecking() {
		System.out.println("Checking Account:");
		System.out.println("1: View Balance");
		System.out.println("2: Withdraw Balance");
		System.out.println("3: Deposit Fund");
		System.out.println("Exit");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		switch(selection) {
		case 1: 
			//System.out.println("Checking account balance: "+moneyFormat.format(getChecking()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM, bye.");
			break;
			
		default:
			System.out.println("\n"+"Invalid choice."+"\n");
			getChecking();
			
		}
	}

	public void getSaving() {
		System.out.println("Saving Account:");
		System.out.println("1: View Balance");
		System.out.println("2: Withdraw Balance");
		System.out.println("3: Deposit Fund");
		System.out.println("4: Exit");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		switch(selection) {
		case 1: 
			//System.out.println("Checking account balance: "+moneyFormat.format(getChecking()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM, bye.");
			break;
			
		default:
			System.out.println("\n"+"Invalid choice."+"\n");
			getSaving();
		
	}
}

}