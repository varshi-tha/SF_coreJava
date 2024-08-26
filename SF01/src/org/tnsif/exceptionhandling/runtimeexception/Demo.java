package org.tnsif.exceptionhandling.runtimeexception;

public class Demo {
	public static void main(String[] args) {
		try {
			int z=0;
			int x=42/z;
			System.out.println("Will not be printed.");
		}
		catch(Exception ex){
			System.out.println("divide by zero exception occured. "+ex.getMessage());
		}
		System.out.println("will be printed ");
	}
}
