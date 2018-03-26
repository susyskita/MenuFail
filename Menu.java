package salonMenu;

import java.util.Scanner;


	public class Menu {
	
	public static void main(String[] args) {
		Menu menu = new Menu();
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
	//create methods
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
	    	Scanner mScanner = new Scanner(System.in);
	    	int choice = -1;
	    	while (choice < 0 || choice > 7) {
	    		try {
	    			System.out.print("\nEnter your choice of services: ");
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
	    	int num = (int)(Math.random() *6);
	    	switch (num) {
	    	case 0:
	    		System.out.println("Cruelty-free Mink Classic - new set");
	    		break;
	    	case 1:
	    		System.out.println("Cruelty-free Mink Hybrid - new set");
	    		break;
	    	case 2:
	    		System.out.println("Classic - regular fill");
	    		break;
	    	case 3:
	    		System.out.println("Hybrid - fill");
	    		break;
	    	case 4:
	    		System.out.println("Cruelty-free Mink Classic - new set");
	    		break;
	    	case 5:
	    		System.out.println("Lash Removal");
	    		break;
	    	default:
	    		System.out.println("oops! Try again");
	    	}
	    }
	    
	    private void pickNails() {
	    	int num = (int)(Math.random() *7);
	    	switch (num) {
	    	case 0:
	    		System.out.println("Manicure - soak.clip.file.cuticle work.massage.polish");
	    		break;
	    	case 1:
	    		System.out.println("Pedicure - soak.clip.file.cuticle work.callous removal.scrub.massage.polish");
	    		break;
	    	case 2:
	    		System.out.println("Mani/Pedi");
	    		break;
	    	case 3:
	    		System.out.println("Shellac Manicure");
	    		break;
	    	case 4:
	    		System.out.println("Express Manicure or Pedicure - clip.file.cuticle work.polish");
	    		break;
	    	case 5:
	    		System.out.println("Princess Manicure or Pedicure");
	    		break;
	    	case 6:
	    		System.out.println("Polish Change");
	    		break;
	    	default:
	    		System.out.println("oops! Try again");
	    	}
	    }	
	    
	    private void pickWaxing() {
	    	int num = (int)(Math.random() *14);
	    	switch (num) {
	    	case 0:
	    		System.out.println("Brow Wax");
	    		break;
	    	case 1:
	    		System.out.println("Upper Lip");
	    		break;
	    	case 2:
	    		System.out.println("Lip & Brow");
	    		break;
	    	case 3:
	    		System.out.println("Lip, Brow & Chin");
	    		break;
	    	case 4:
	    		System.out.println("Full Face");
	    		break;
	    	case 5:
	    		System.out.println("Underarm");
	    		break;
	    	case 6:
	    		System.out.println("Arm");
	    		break;
	    	case 7:
	    		System.out.println("Half Leg");
	    		break;
	    	case 8:
	    		System.out.println("Full Leg");
	    		break;
	    	case 9:
	    		System.out.println("Bikini");
	    		break;	
	    	case 10:
	    		System.out.println("Extended Bikini");
	    		break;
	    	case 11:
	    		System.out.println("Brazilian");
	    		break;
	    	case 12:
	    		System.out.println("Full Leg & Bikini");
	    		break;
	    	case 13:
	    		System.out.println("Full Leg & Brazilian");
	    		break;
	    	default:
	    		System.out.println("oops! Try again");
	    	}
	    }	
	    
	    private void pickTinting() {
	    	int num = (int)(Math.random() *3);
	    	switch (num) {
	    	case 0:
	    		System.out.println("Brow Tint - includes brow clean-up");
	    		break;
	    	case 1:
	    		System.out.println("Lash Tint");
	    		break;
	    	case 2:
	    		System.out.println("Brow & Lash Tint - includes brow clean-up");
	    		break;
	    	default:
	    		System.out.println("oops! Try again");
	    	}
	    }	
	    
	    private void pickMakeUp() {
	    	int num = (int)(Math.random() *4);
	    	switch (num) {
	    	case 0:
	    		System.out.println("Everyday Make-up Application");
	    		break;
	    	case 1:
	    		System.out.println("Formal Make-up Application including False Lashes");
	    		break;
	    	case 2:
	    		System.out.println("Bridal Make-up Application including Free Trial");
	    		break;
	    	case 3:
	    		System.out.println("Make-up Lesson");
	    		break;
	    	default:
	    		System.out.println("oops! Try again");
	    	}
	    }	
	    private void pickAddOns() {
	    	int num = (int)(Math.random() *5);
	    	switch (num) {
	    	case 0:
	    		System.out.println("Add CND Shellac to a Regular Manicure");
	    		break;
	    	case 1:
	    		System.out.println("Add CND Shellac to a Regular Pedicure");
	    		break;
	    	case 2:
	    		System.out.println("Shellac Removal");
	    		break;
	    	case 3:
	    		System.out.println("Add a warm, relaxing and hydrating Paraffin Treatment to a Regular Manicure or Pedicure");
	    		break;
	    	case 4:
	    		System.out.println("Classic French Nail Design");
	    		break;
	    		
	    	default:
	    		System.out.println("oops! Try again");
	    	}
	    }	
	    
	    private void pickParties() {
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
	

	
