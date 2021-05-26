package com.qa.exceptions.examples;
import java.util.Scanner;

public class NumberFormatExceptionExample {

  static Scanner scan = new Scanner(System.in); 
  
  
  public static void main(String[] args) {
    
	try {
      System.out.println("Please enter a number");	  
	  int x = Integer.parseInt(scan.nextLine());
	}catch(NumberFormatException e) {
      e.printStackTrace();	  
	}

    System.out.println("Thanks for using the program");
    scan.close();
  }
  

}
