package session6_assignment2;

/*
 * In java, we can define our own exception classes as per our requirements. 
 * These exceptions are called user defined exceptions in java OR Customized exceptions. 
 * User defined exceptions must extend any one of the classes in the hierarchy of exceptions.
 */

public class AgeException extends Exception {
	
	public AgeException(String str){
		System.out.println(str);
	}

}
