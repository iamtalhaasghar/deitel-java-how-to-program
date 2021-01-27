package Chapter2;

import java.util.Scanner;

public class Q25{

	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if(num%3==0){
			System.out.println("The number is divisible by 3.");
		}
		else{
			System.out.println("The number is not divisible by 3.");
		
		}
		
	}

}