package exceptiontopic.runtime;

// User Defined Exception --- Custom Exception 


// 1. User Defined Exception--->Checked Exception 
/*
public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
*/

// 2. User Defined Exception--->UnChecked Exception / Runtime Exception
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
