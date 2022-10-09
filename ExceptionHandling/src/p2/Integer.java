package p2;

import java.util.Scanner;

public class Integer {
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("enter an integer");
		while(true) {
			try {
				i=sc.nextInt();
				break;
			}
			catch(Exception e) {
				System.out.println("you did not enter an integer.please enter an integer: ");
			}
		}
		System.out.println("input of type integer:  "+i);
		
	}
}