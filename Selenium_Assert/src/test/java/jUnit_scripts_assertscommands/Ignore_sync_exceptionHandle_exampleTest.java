package jUnit_scripts_assertscommands;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

@Ignore                                        // Showing ignore at class level
public class Ignore_sync_exceptionHandle_exampleTest {
	
	Ignore_sync_exceptionHandle_example ig=new Ignore_sync_exceptionHandle_example();
    @Ignore
	@Test
	public void testIgnore() {                  // Showing Ignore at method level
		int a=5;
		if(a%2==0){
			System.out.println("It is even number");
		}
		else{
			System.out.println("It is odd number");
		}
	}

	@Test(expected=NullPointerException.class)  //Showing null pointer exception example
	public void testExceptionHandle() {
		String a=null;
		System.out.println(a.charAt(0));
		}
	
	@Test(expected=ArithmeticException.class)  //Showing arithmetic exception example
	public void testExceptionHandleArithmatic(){
		int a,b,c;
		a=5;b=0;
		c=a/b;
		
		System.out.println(c);
	}
	
	@Test(timeout=5000)                     // Showing Sync with example
	public void testSynchronizationExample(){
		
		for(;;)
			System.out.println("Run forever");
		}
	}


