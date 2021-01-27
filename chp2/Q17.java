package Chapter2;

import java.util.Scanner;

public class Q17{
	
	public static void main(String []args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number # 1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter number # 2 : ");
		int num2 = sc.nextInt();

		System.out.print("Enter number # 3 : ");
		int num3 = sc.nextInt();

		int sum = num1 + num2 + num3;

		System.out.printf("Sum is : %d%n", sum);
		System.out.printf("Average is : %d%n", sum/3);
		
		int temp = 0;
		
		if(num1>num2){
			if(num1>num3){
				temp = num1;
			}
			else{
				temp = num3;
			}
		}
		else{
			if(num2>num3){
				temp = num2;
			}
			else{
				temp = num3;
			}
		}

		System.out.printf("Largest number is : %d%n", temp);		

		temp = 0;
		

		if(num1<num2){
			if(num1<num3){
				temp = num1;
			}
			else{
				temp = num3;
			}
		}
		else{
			if(num2<num3){
				temp = num2;
			}
			else{
				temp = num3;
			}
		}
		
	
		System.out.printf("Smallest number is : %d%n", temp);


	}
}