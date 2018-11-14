
import java.util.*;
/**
 * 
 * @author Welby Chan	
 * @version 1.0 10/3/2018
 * This is a ATM system that prompts users for actions
 *
 */
public class ATMSystem {

boolean quiting = false;
	
BankA ba = new BankA();
BankB bb = new BankB();
	
Scanner in = new Scanner(System.in);


/**
 * This is a constructor of ATMSystem() that uses method atm()
 */
public ATMSystem()
{

	atm();

}
/**
 * This is a method called atm() which prompts users to use the atm system
 */
public void atm()
{
	System.out.println("BankofA (Two customers)");
	System.out.println("Customer with Cash Card (bankid: A, acount number (#11), expires on "+ba.a1.getDate()+ " password: "+ba.a1.getPw());
	System.out.println("Customer with Cash Card (bankid: A, acount number (#12), expires on "+ba.a2.getDate()+ " password: "+ba.a2.getPw());
	
	System.out.println();
	
	System.out.println("BankofB (Three customers)");
	System.out.println("Customer with Cash Card (bankid: B, acount number (#1), expires on "+bb.b1.getDate()+ " password: "+bb.b1.getPw());
	System.out.println("Customer with Cash Card (bankid: B, acount number (#2), expires on "+bb.b2.getDate()+ " password: "+bb.b2.getPw());
	System.out.println("Customer with Cash Card (bankid: B, acount number (#3), expires on "+bb.b3.getDate()+ " password: "+bb.b3.getPw());
	
	System.out.println();
	
	System.out.println("State of ATMs");
	System.out.println();
	System.out.println("(ATMs of Bank A)");
	System.out.println("ATM1_A: ");
	System.out.println("  Max withdraw per interaction: $50 ");
	System.out.println("ATM2_A: ");
	System.out.println("  Max withdraw per interaction: $50 ");
	System.out.println();
	System.out.println("(ATMs of Bank B)");
	System.out.println("ATM1_B: ");
	System.out.println("  Max withdraw per interaction: $50 ");
	System.out.println("ATM2_B: ");
	System.out.println("  Max withdraw per interaction: $50 ");
	System.out.println();
	System.out.println();

	
	
	
	//Scanner in = new Scanner(System.in);
	System.out.println("ATM Options: ATM1_A, ATM1_B, ATM2_A, ATM2_B");
	
	System.out.println("Enter your choice of ATM:");
	//in.hasNextLine();
	while (in.hasNextLine())
	{
            String input = in.nextLine();
            if(input.equalsIgnoreCase("ATM1_A"))
            {
            	atm1A();
            }
            else if(input.equalsIgnoreCase("ATM1_B"))
            {
            	atm1B();
            }
            else if(input.equalsIgnoreCase("ATM2_A"))
            {
            	atm2A();
            }
            else if(input.equalsIgnoreCase("ATM2_B"))
            {
            	atm2B();
            }
            else if(input.equalsIgnoreCase("quit"))
            {
            	System.out.println("You have quit the system");
            	break;
            }
            else
            {
            	System.out.println("There is no such ATM");
            	System.out.println("Enter your choice of ATM again:");
            }
	
	}
}
/**
 * This is a method to use atm1_a
 */
public void atm1A()
{
	quiting = false;
	//Scanner a1 = new Scanner(System.in);
	System.out.println("Enter your card");
	outerloop:
	while(in.hasNextLine()){
		String input = in.nextLine();
	
	if(/*a1*/input.equalsIgnoreCase(ba.a1.getId()))
	{

		System.out.println("This card is expired and returned to you.");
		atm1A();
		
	}
	else if(/*a1*/input.equalsIgnoreCase(ba.a2.getId()))
	{
		System.out.println("The card is accepted. Please enter your password.");
		
		while(in.hasNextLine())
		{
			input = in.nextLine();
			if(!/*a1*/input.equalsIgnoreCase(ba.a2.getPw()))
			{
				System.out.println("This is a wrong password. Enter your password.");
			
			}
			else
			{
				System.out.println("Authorization is accepted. Start your transaction by entering the amount to withdraw.");
				while(in.hasNextLine())
				{
					input = in.nextLine();
					int cashin = 0;
					if (input.matches(".*\\d+.*")){
					cashin = Integer.parseInt(input);
					}
					if(cashin>50 ){
						System.out.println("This amount exceeds the maximum amount you can withdraw per transaction. Please enter the amount or quit.");
					}
					else if(cashin>ba.a2.getCash()){
						System.out.println("This amount exceeds the current balance. Enter another amount or quit.");
					}
					else if(cashin<=50 && cashin>0 && cashin<=ba.a2.getCash()){
						ba.a2.cash= ba.a2.cash- cashin;
						System.out.println(cashin +" is withdrawn from  your account. The remaining balance of this account is "+ba.a2.getCash()+ ".  If you have more transactions, enter the amount or quit.");
					
					}
					else if(input.equalsIgnoreCase("quit"))
					{
						System.out.println("You have quit to menu");
						
						quiting = true;
						atm();
						break outerloop;

						

					}
					else {
						System.out.println("Invalid input");
					}
					
				}
			}
		}
	}
	
	else
		System.out.println("This card is not supported by this ATM");
	}
	
}

/**
 * This is a method to use atm2_a
 */
public void atm2A()
{
	quiting = false;
	//Scanner a1 = new Scanner(System.in);
	System.out.println("Enter your card");
	outerloop:
	while(in.hasNextLine()){
		String input = in.nextLine();
	
	if(/*a1*/input.equalsIgnoreCase(ba.a1.getId()))
	{

		System.out.println("This card is expired and returned to you.");
		atm2A();
		
	}
	else if(/*a1*/input.equalsIgnoreCase(ba.a2.getId()))
	{
		System.out.println("The card is accepted. Please enter your password.");
		
		while(in.hasNextLine())
		{
			input = in.nextLine();
			if(!/*a1*/input.equalsIgnoreCase(ba.a2.getPw()))
			{
				System.out.println("This is a wrong password. Enter your password.");
			
			}
			else
			{
				System.out.println("Authorization is accepted. Start your transaction by entering the amount to withdraw.");
				while(in.hasNextLine())
				{
					input = in.nextLine();
					int cashin = 0;
					if (input.matches(".*\\d+.*")){
					cashin = Integer.parseInt(input);
					}
					if(cashin>50 ){
						System.out.println("This amount exceeds the maximum amount you can withdraw per transaction. Please enter the amount or quit.");
					}
					else if(cashin>ba.a2.getCash()){
						System.out.println("This amount exceeds the current balance. Enter another amount or quit.");
					}
					else if(cashin<=50 && cashin>0 && cashin<=ba.a2.getCash()){
						ba.a2.cash= ba.a2.cash- cashin;
						System.out.println(cashin +" is withdrawn from  your account. The remaining balance of this account is "+ba.a2.getCash()+ ".  If you have more transactions, enter the amount or quit.");
					
					}
					else if(input.equalsIgnoreCase("quit"))
					{
						System.out.println("You have quit to menu");
						
						quiting = true;
						atm();
						break outerloop;
						// getClass();

						

					}
					else {
						System.out.println("Invalid input");
					}
					
				}
			}
		}
	}
	
	else
		System.out.println("This card is not supported by this ATM");
	}
	
}
/**
 * This is a method to use atm1_b
 */
public void atm1B()
{
	quiting = false;
	//Scanner a1 = new Scanner(System.in);
	System.out.println("Enter your card");
	outerloop:
	while(in.hasNextLine()){
		String input = in.nextLine();
	
	if(/*a1*/input.equalsIgnoreCase(bb.b1.getId()))
	{

		System.out.println("This card is expired and returned to you.");
		atm1B();
		
	}
	else if(/*a1*/input.equalsIgnoreCase(bb.b2.getId()))
	{
		System.out.println("The card is accepted. Please enter your password.");
		
		while(in.hasNextLine())
		{
			input = in.nextLine();
			if(!/*a1*/input.equalsIgnoreCase(bb.b2.getPw()))
			{
				System.out.println("This is a wrong password. Enter your password.");
			
			}
			else
			{
				System.out.println("Authorization is accepted. Start your transaction by entering the amount to withdraw.");
				while(in.hasNextLine())
				{
					input = in.nextLine();
					int cashin = 0;
					if (input.matches(".*\\d+.*")){
					cashin = Integer.parseInt(input);
					}
					if(cashin>50 ){
						System.out.println("This amount exceeds the maximum amount you can withdraw per transaction. Please enter the amount or quit.");
					}
					else if(cashin>bb.b2.getCash()){
						System.out.println("This amount exceeds the current balance. Enter another amount or quit.");
					}
					else if(cashin<=50 && cashin>0 && cashin<=bb.b2.getCash()){
						bb.b2.cash= bb.b2.cash- cashin;
						System.out.println(cashin +" is withdrawn from  your account. The remaining balance of this account is "+bb.b2.getCash()+ ".  If you have more transactions, enter the amount or quit.");
					
					}
					else if(input.equalsIgnoreCase("quit"))
					{
						System.out.println("You have quit to menu");
						quiting = true;
						atm();
						break outerloop;
						// getClass();

						

					}
					else {
						System.out.println("Invalid input");
					}
					
				}
			}
		}
	}
	else if(/*a1*/input.equalsIgnoreCase(bb.b3.getId()))
	{
		System.out.println("The card is accepted. Please enter your password.");
		
		while(in.hasNextLine())
		{
			input = in.nextLine();
			if(!/*a1*/input.equalsIgnoreCase(bb.b3.getPw()))
			{
				System.out.println("This is a wrong password. Enter your password.");
			
			}
			else
			{
				System.out.println("Authorization is accepted. Start your transaction by entering the amount to withdraw.");
				while(in.hasNextLine())
				{
					input = in.nextLine();
					int cashin = 0;
					if (input.matches(".*\\d+.*")){
					cashin = Integer.parseInt(input);
					}
					if(cashin>50 ){
						System.out.println("This amount exceeds the maximum amount you can withdraw per transaction. Please enter the amount or quit.");
					}
					else if(cashin>bb.b3.getCash()){
						System.out.println("This amount exceeds the current balance. Enter another amount or quit.");
					}
					else if(cashin<=50 && cashin>0 && cashin<=bb.b3.getCash()){
						bb.b3.cash= bb.b3.cash- cashin;
						System.out.println(cashin +" is withdrawn from  your account. The remaining balance of this account is "+bb.b3.getCash()+ ".  If you have more transactions, enter the amount or quit.");
					
					}
					else if(input.equalsIgnoreCase("quit"))
					{
						System.out.println("You have quit to menu");
						
						quiting = true;
						atm();
						break outerloop;
						// getClass();

						

					}
					else {
						System.out.println("Invalid input");
					}
					
				}
			}
		}
	}
	
	else
		System.out.println("This card is not supported by this ATM");
	}
	
}

/**
 * This is a method to use atm2_b
 */
public void atm2B()
{
	quiting = false;
	//Scanner a1 = new Scanner(System.in);
	System.out.println("Enter your card");
	outerloop:
	while(in.hasNextLine()){
		String input = in.nextLine();
	
	if(/*a1*/input.equalsIgnoreCase(bb.b1.getId()))
	{

		System.out.println("This card is expired and returned to you.");
		atm2B();
		
	}
	else if(/*a1*/input.equalsIgnoreCase(bb.b2.getId()))
	{
		System.out.println("The card is accepted. Please enter your password.");
		
		while(in.hasNextLine())
		{
			input = in.nextLine();
			if(!/*a1*/input.equalsIgnoreCase(bb.b2.getPw()))
			{
				System.out.println("This is a wrong password. Enter your password.");
			
			}
			else
			{
				System.out.println("Authorization is accepted. Start your transaction by entering the amount to withdraw.");
				while(in.hasNextLine())
				{
					input = in.nextLine();
					int cashin = 0;
					if (input.matches(".*\\d+.*")){
					cashin = Integer.parseInt(input);
					}
					if(cashin>50 ){
						System.out.println("This amount exceeds the maximum amount you can withdraw per transaction. Please enter the amount or quit.");
					}
					else if(cashin>bb.b2.getCash()){
						System.out.println("This amount exceeds the current balance. Enter another amount or quit.");
					}
					else if(cashin<=50 && cashin>0 && cashin<=bb.b2.getCash()){
						bb.b2.cash= bb.b2.cash- cashin;
						System.out.println(cashin +" is withdrawn from  your account. The remaining balance of this account is "+bb.b2.getCash()+ ".  If you have more transactions, enter the amount or quit.");
					
					}
					else if(input.equalsIgnoreCase("quit"))
					{
						System.out.println("You have quit to menu");
						quiting = true;
						atm();
						break outerloop;
						// getClass();

						

					}
					else {
						System.out.println("Invalid input");
					}
					
				}
			}
		}
	}
	else if(/*a1*/input.equalsIgnoreCase(bb.b3.getId()))
	{
		System.out.println("The card is accepted. Please enter your password.");
		
		while(in.hasNextLine())
		{
			input = in.nextLine();
			if(!/*a1*/input.equalsIgnoreCase(bb.b3.getPw()))
			{
				System.out.println("This is a wrong password. Enter your password.");
			
			}
			else
			{
				System.out.println("Authorization is accepted. Start your transaction by entering the amount to withdraw.");
				while(in.hasNextLine())
				{
					input = in.nextLine();
					int cashin = 0;
					if (input.matches(".*\\d+.*")){
					cashin = Integer.parseInt(input);
					}
					if(cashin>50 ){
						System.out.println("This amount exceeds the maximum amount you can withdraw per transaction. Please enter the amount or quit.");
					}
					else if(cashin>bb.b3.getCash()){
						System.out.println("This amount exceeds the current balance. Enter another amount or quit.");
					}
					else if(cashin<=50 && cashin>0 && cashin<=bb.b3.getCash()){
						bb.b3.cash= bb.b3.cash- cashin;
						System.out.println(cashin +" is withdrawn from  your account. The remaining balance of this account is "+bb.b3.getCash()+ ".  If you have more transactions, enter the amount or quit.");
					
					}
					else if(input.equalsIgnoreCase("quit"))
					{
						System.out.println("You have quit to menu");
						
						quiting = true;
						atm();
						break outerloop;
						// getClass();

						

					}
					else {
						System.out.println("Invalid input");
					}
					
				}
			}
		}
	}
	
	else
		System.out.println("This card is not supported by this ATM");
	}
	
}


/**
 * This is a tester of this class to start up ATMSystem
 */
public static void main(String[] args)	
{
	ATMSystem atm = new ATMSystem();
}

	
}
