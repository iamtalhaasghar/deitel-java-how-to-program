package Chapter2;

import java.util.Scanner;

public class Q24{

	public static void main(String []args){
		
		int num1, num2, num3, num4, num5;
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number # 1 : ");
		num1 = sc.nextInt();

		int max = num1;
		int min = num1;		

		System.out.print("Enter number # 2 : ");
		num2 = sc.nextInt();
		
		if(num2>max){
			max = num2;
		}

		if(num2<min){
			min = num2;
		}
	

		System.out.print("Enter number # 3 : ");
		num3 = sc.nextInt();

		if(num3 > max){
			max = num3;
		}

		if(num3<min){
			min = num3;
		}
		
		System.out.print("Enter number # 4 : ");
		num4 = sc.nextInt();

		if(num4>max){
			max = num4;
		}

		if(num4<min){
			min = num4;
		}
		System.out.println("Enter number # 5 : ");
		num5 = sc.nextInt();

		if(num5>max){
			max = num5;
		}

		if(num5 < min){
			min = num5;
		}


		System.out.printf("Largest Number = %d%n", max);
		System.out.printf("Smallest Number = %d%n", min);

	}
}