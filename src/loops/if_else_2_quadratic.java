package loops;
import java.util.Scanner;
public class if_else_2_quadratic {

	public static void main(String[] args) {
	
		Scanner inputnum = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = inputnum.nextDouble();
		System.out.println("Enter the value of b");
		double b = inputnum.nextDouble();
		System.out.println("Enter the value of c");
		double c = inputnum.nextDouble();
		
		double result = (b*b) - 4.0*a* c;
		if(result > 0.0) {
			double r1 =(-b + Math.pow(result, 0.5)) / 2.0 * a;
			double r2 =(-b - Math.pow(result, 0.5)) / 2.0 * a;
			System.out.println("The roots are " + r1 + "and" + r2);
		}
		else if(result == 0.0) {
			double r1 = -b / 2.0 * a;
			System.out.println("The root is " +r1);
		}
		else {
			System.out.println("The number has no real roots");
		}

	}

}
