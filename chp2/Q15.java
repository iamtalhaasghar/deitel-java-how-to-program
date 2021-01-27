package Chapter2;

import java.util.Scanner;

public class Q15{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();		

		System.out.printf("Square of %d is : %d%n",num1, num1*num1);
		System.out.printf("Square of %d is : %d%n",num2, num2*num2);
		System.out.printf("Sum of squares of %d and %d is : %d%n",
			num1,num2, (num1*num1)+(num2*num2));
		System.out.printf("Difference of squares of %d and %d is : %d%n",
			num1, num2, (num1*num1)-(num2*num2));

	}

}