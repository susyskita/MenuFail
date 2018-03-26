package salonMenu2;

import java.util.Scanner;


	public class Menu2 {
	
	private Scanner mScanner;

	public static void main(String[] args) {
		Menu2 menu = new Menu2();
		menu.runMenu();
	}	 

	public void runMenu() {
		printHeader();
		boolean exit = false;
		while(!exit) {
			printMenu();
			int choice = getInput();
			performAction(choice);
		}	
	}	
		private void printHeader() {
			System.out.println("*-------------------------*");
			System.out.println("|        Welcome to       |");
			System.out.println("|    Aesthetics by YuToo  |");
			System.out.println("*-------------------------*");
		
		}
		private void printMenu() {
			System.out.println("\nWe offer the following professional services:");
			System.out.println("\n1) Lash Extensions");
			System.out.println("2) Manicures & Pedicures");
			System.out.println("3) Waxing"); 
			System.out.println("4) Tinting");
			System.out.println("5) Make-up");
			System.out.println("6) Add Ons");
			System.out.println("7) Parties");
			System.out.println("0) Exit");
		}
	    private int getInput() {
	    	mScanner = new Scanner(System.in);
	    	int choice = -1;
	    	while (choice < 0 || choice > 7) {
	    		try {
	    			System.out.print("\nEnter your choice of services: ");
	    			System.out.print("");
	    		   choice = Integer.parseInt(mScanner.nextLine());
	    		}
	    		catch (NumberFormatException e) {
	    			System.out.println("Invalid selection. Please try again.");
	    		}
	    	}
	    	return choice;
	    }
	    
	    private void performAction(int choice) {
	    	switch(choice) {
		    	case 0:
		    		//exit = true;
		    		System.out.println("Thanks for visiting!");
		    		break;
		    	case 1:
		    		pickLashes();
		    		break;
		    	case 2:
		    		pickNails();
		    		break;
		    	case 3:
		    		pickWaxing();
		    		break;
		    	case 4:
		    		pickTinting();
		    		break;
		    	case 5:
		    		pickMakeUp();
		    		break;
		    	case 6:
		    		pickAddOns();
		    		break;
		    	case 7:
		    		pickParties();
		    		break;
		    	default:
		    		System.out.println("An unknown error has occured");
	    	}	
	    } 
	    
	    private void pickLashes() {
	    	
	    	System.out.println("*-------------------------*");
			System.out.println("|        Lash Menu        |");
			System.out.println("|    Aesthetics by YuToo  |");
			System.out.println("*-------------------------*");
	    		    	
	    		System.out.println("Cruelty-free Mink Classic - new set...$80");
	    	
	    		System.out.println("Cruelty-free Mink Hybrid - new set...$90");
    	
	    		System.out.println("Classic - fill...$40");
	    	
	    	    System.out.println("Hybrid - fill...$45");
	    	    	
	    		System.out.println("Lash Removal...$20");
	     	
	    	}
	     
	    private void pickNails() {
	    	System.out.println("*-------------------------*");
			System.out.println("|        Nail Menu        |");
			System.out.println("|    Aesthetics by YuToo  |");
			System.out.println("*-------------------------*");
	    	
	    		System.out.println("Manicure...$20 \nsoak.clip.file.cuticle work.massage.polish");
	    		
	    		System.out.println("Pedicure...$30 \nsoak.clip.file.cuticle work.callous removal.scrub.massage.polish");
   		   		
	    		System.out.println("Mani/Pedi...$45");
   				
	    		System.out.println("Shellac Manicure...$25");
  	    		
	    		System.out.println("Express Manicure or Pedicure...$15 \nclip.file.cuticle work.polish");
	    		
	    		System.out.println("Princess Manicure or Pedicure...$15");
	       		
	    		System.out.println("Polish Change...$8");
	  		
	    }	
	    
	    private void pickWaxing() {
	    	System.out.println("*-------------------------*");
			System.out.println("|        Waxing Menu      |");
			System.out.println("|    Aesthetics by YuToo  |");
			System.out.println("*-------------------------*");
	    		
				System.out.println("Brow Wax...$9");
	    		
				System.out.println("Upper Lip...$7");
	    		
				System.out.println("Lip & Brow...$15");
	    		
				System.out.println("Lip, Brow & Chin...$20");
	    		
				System.out.println("Full Face...$25");
	    		
	    		System.out.println("Underarm...$12");
	    		
	    		System.out.println("Arm...$25");
	    		
	    		System.out.println("Half Leg...$22");
	    		
	    		System.out.println("Full Leg...$35");
	    		
	    		System.out.println("Bikini...$20");
	    		
	    		System.out.println("Extended Bikini...$25");
	    		
	    		System.out.println("Brazilian...$30");
	    		
	    		System.out.println("Full Leg & Bikini...$45");
	    		
	    		System.out.println("Full Leg & Brazilian...$55");
	    		
	   	}
	    	    
	    private void pickTinting() {
	    	System.out.println("*-------------------------*");
			System.out.println("|        Tinting Menu      |");
			System.out.println("|    Aesthetics by YuToo   |");
			System.out.println("*-------------------------*");
			
	    		System.out.println("Brow Tint - includes brow clean-up...$12");
	    		
	    		System.out.println("Lash Tint...$18");
	    		
	    		System.out.println("Brow & Lash Tint - includes brow clean-up...$25");
	    			    		
	   	}
	   	    
	    private void pickMakeUp() {
	    	System.out.println("*-------------------------*");
			System.out.println("|       Make-Up Menu      |");
			System.out.println("|    Aesthetics by YuToo  |");
			System.out.println("*-------------------------*");
			
	    		System.out.println("Everyday Make-up Application...$35");
	    		
	    		System.out.println("Formal Make-up Application including False Lashes...$45");
	    		
	    		System.out.println("Bridal Make-up Application including Free Trial...$70");
	    		
	    		System.out.println("Make-up Lesson...$60");
	    		
	    }	
	    private void pickAddOns() {
	    	System.out.println("*-------------------------*");
			System.out.println("|       Add-Ons Menu      |");
			System.out.println("|    Aesthetics by YuToo  |");
			System.out.println("*-------------------------*");
			
	    		System.out.println("Add CND Shellac to a Regular Manicure...$5");
	    		
	    		System.out.println("Add CND Shellac to a Regular Pedicure...$10");
	    		
	    		System.out.println("Shellac Removal...$5");
	    		
	    		System.out.println("Add a warm, relaxing and hydrating\n"
	    				+ " Paraffin Treatment to a Regular Manicure or Pedicure...$5");
	   	
	    		System.out.println("Classic French Nail Design...$5");
	    			
	    }	
	    
	    private void pickParties() {
	    	System.out.println("*-------------------------*");
			System.out.println("|         PARTIES!        |");
			System.out.println("|  Contact Us for Details |");
			System.out.println("*-------------------------*");
	    	
	    		System.out.println("\nNow Offering Group Services:");
	    		System.out.println("\nYou be the Host!"
	    				+ "\nA Team of Certified Aestheticians"
	    				+ "\nwill come to you and provide"
	    				+ "\nProfessional and Quality Services"
	    				+ "\nIn the Comfort of Your Own Home!");
	    		System.out.println("\nGreat For Weddings, Birthdays, Bachelorettes, Girl's Night's!");	
	    		System.out.println("");
	   	}
    }	
	

	
