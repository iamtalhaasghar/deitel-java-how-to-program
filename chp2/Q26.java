package Chapter2;

import java.util.Scanner;

public class Q26{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number : ");
		int x = sc.nextInt();

		System.out.print("Enter second number : ");
		int y = sc.nextInt();

		if( (3*x)%(2*y)== 0 ){
			System.out.printf("%s '%d' %s '%d'%n","Yes!! first number tripled as",
			3*x, "is a multiple of second number doubled as",2*y);
		
		}
		else{
			System.out.printf("%s '%d' %s '%d'%n","No!! first number tripled as",
			3*x, "is not a multiple of second number doubled as",2*y);

		}

	}

}