package Chapter2;

import java.util.Scanner;
public class Q30{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a 5-digit number : ");
		int num = sc.nextInt();

		int dig1=0, dig2=0, dig3=0, dig4=0, dig5=0;

		dig5 = num % 10;
		num /= 10;
		dig4 = num % 10;
		num /= 10;
		dig3 = num % 10;	
		num /= 10;
		dig2 = num % 10;
		num /= 10;
		dig1 = num;

		System.out.println("The digits of the number are : ");
		System.out.printf("%d   %d   %d   %d   %d", 
			dig1, dig2, dig3, dig4, dig5);
		

	}

}