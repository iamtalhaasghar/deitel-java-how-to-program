package Chapter2;

import java.util.Scanner;
public class Q28{
	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		int radius = sc.nextInt();

		System.out.printf("%s %d%n", "Diameter of Circle = ",2*radius);
		System.out.printf("%s %.3f%n", "Circumference of Circle = ",
			2*Math.PI*radius);
		System.out.printf("%s %.3f%n", "Area of Circle = ",
			Math.PI*radius*radius);

	}

}