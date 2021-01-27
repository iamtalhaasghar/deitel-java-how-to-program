package Chapter2;

import java.util.Scanner;
public class Q33{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weight in pounds : ");
		
		double weight = sc.nextDouble();
		System.out.print("Enter your height in inches : ");
		double height = sc.nextDouble();
		
		double bmi = (weight * 703)/(height * height);

		System.out.printf("Your BMI is : %f%n", bmi);
			
		System.out.println("\n\nBMI Values : \n");
		System.out.println("UnderWeight : less than 18.5");
		System.out.println("Normal : between 18.5 and 24.9");
		System.out.println("Overweight : between 25 and 29.9");
		System.out.println("Obese : 30 or greater");

	}

}