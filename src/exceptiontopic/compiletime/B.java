package exceptiontopic.compiletime;

import java.io.FileNotFoundException;
import java.io.IOException;

// Child class
public class B extends A
{
	@Override
	public void test1() throws Exception
	{
		System.out.println("B---test1()");
	}
}
