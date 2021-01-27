package Chapter2;

import java.util.Scanner;

public class Q16{
	
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");

		int num = sc.nextInt();

		int square = num * num;
	

		if(num>100){
			if(square>100){
				System.out.printf(
				"The number %d and its square %d are greater than 100.%n"
				,num, square);
			}
		}

		if(num==100){
			if(square==100){
				System.out.printf(
				"The number %d and its square %d are equal to 100.%n"
				, num, square);
			}
		
		}

		if(num!=100){
			if(square!=100){
				System.out.printf(
				"The number %d and its square %d are not equal to 100.%n"
				, num, square);
			}
		}

		if(num<100){
			if(square<100){
				System.out.printf(
				"The number %d and its square are less than 100.%n"
				, num ,square);
			}
		}



	}
}