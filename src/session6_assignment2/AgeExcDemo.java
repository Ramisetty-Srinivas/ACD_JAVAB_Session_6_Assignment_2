package session6_assignment2;

/*
 * In java, we can define our own exception classes as per our requirements. 
 * These exceptions are called user defined exceptions in java OR Customized exceptions. 
 * User defined exceptions must extend any one of the classes in the hierarchy of exceptions.
 */

import java.util.Scanner;

public class AgeExcDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur age :: ");
		int age = s.nextInt();
			  
		try {
			
			if(age < 0) 
				throw new AgeException("You have entered negative age");
			else
				System.out.println("Valid age");
			
		 }
		catch (AgeException a) {
			
			System.out.println(a);
			
		}
		s.close();
	}
}

