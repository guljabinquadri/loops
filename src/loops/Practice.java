package loops;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		/*question1
		float a = 7/4f * 9/2f;
		System.out.println("The result is " + a);
		//question2
		char grade = 'B';
		grade = (char)(grade+8);
		System.out.println(grade);
		
		grade =(char)(grade -8);
		System.out.println(grade);
		
		
		//question3
		System.out.println("enter the vaule of A ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a>=10);
		*/
		double a = 2.1;
		double s = 30.05;
		double u = 1.7;
		double v = 1.6;
		double result1,finalresult;
		result1 = (v*v)-(u*u);
		finalresult= (result1)/(2*a*s);
		System.out.println(finalresult);
	}

}
