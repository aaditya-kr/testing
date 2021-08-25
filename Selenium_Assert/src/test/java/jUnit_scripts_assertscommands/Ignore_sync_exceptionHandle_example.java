package jUnit_scripts_assertscommands;

public class Ignore_sync_exceptionHandle_example {
	
	public void ignore(){
		int a=5;
		if(a%2==0){
			System.out.println("It is even number");
		}
		else{
			System.out.println("It is odd number");
		}
	}
	
	public void exceptionHandle(){
		String a=null;
		System.out.println(a.charAt(0));
	}

}
