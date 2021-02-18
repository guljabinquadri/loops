
package loops;
import java.util.*;

public class if_else_4_decimal3equal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first floating number");
		double a = in.nextDouble();
		System.out.println("Enter the second floating number");
		double b = in.nextDouble();
		

		a = Math.round(a * 1000);
		a = a /1000;
		b = Math.round(b * 1000);
		b = b /1000;
		
		if(a==b)
		{
			System.out.println("Upto three deciaml the two number is same.");
		}
		else
		{
			System.out.println("The two floating number is not same." );
		}

	}

}
