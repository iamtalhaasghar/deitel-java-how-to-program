package Chapter2;

import java.util.Scanner;

public class Q32{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int countZeros = 0;
		int countPos = 0;
		int countNeg = 0;		


		System.out.print("Enter number # 1 : ");
		num = sc.nextInt();
		
		if(num == 0){
			countZeros++;
		}
		else if(num > 0){
			countPos++;
		}
		else{
			countNeg++;
		}

		System.out.print("Enter number # 2 : ");
		num = sc.nextInt();
		
		if(num == 0){
			countZeros++;
		}
		else if(num > 0){
			countPos++;
		}
		else{
			countNeg++;
		}

		System.out.print("Enter number # 3 : ");
		num = sc.nextInt();
		
		if(num == 0){
			countZeros++;
		}
		else if(num > 0){
			countPos++;
		}
		else{
			countNeg++;
		}

		System.out.print("Enter number # 4 : ");
		num = sc.nextInt();
		
		if(num == 0){
			countZeros++;
		}
		else if(num > 0){
			countPos++;
		}
		else{
			countNeg++;
		}

		System.out.print("Enter number # 5 : ");	
		num = sc.nextInt();
		
		if(num == 0){
			countZeros++;
		}
		else if(num > 0){
			countPos++;
		}
		else{
			countNeg++;
		}

		System.out.printf("%n%nTotal Positive numbers = %d%n", countPos);
		System.out.printf("Total negative numbers = %d%n", countNeg);
		System.out.printf("Total zero numbers = %d%n", countZeros);
	}

}