package loops;

import java.util.Scanner;

public class if_else_3_greatest_of_3 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = num.nextDouble();
		System.out.println("Enter the value of b");
		double b = num.nextDouble();
		System.out.println("Enter the value of c");
		double c = num.nextDouble();
		if(a>b && a>c) {
			System.out.println("The greatest number is " +a);
		}
		else if (b>a && b>c) {
			System.out.println("The greatest number is " +b);
		}
		else if (c>a && c>b) {
			System.out.println("The greatest number is " +c);
		}
		else {
			System.out.println("Invaild number");
		}
	}

}
