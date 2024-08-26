package org.tnsif.exceptionhandling.runtimeexception;
import java.util.Scanner;
public class RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int x,y,z;
		
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=x/y;
		System.out.println("value of z is: "+z);
		}
		catch(Exception ae) {
			System.out.println("Error!! Invalid input : "+ae.getMessage());
		}
	}
	

}
