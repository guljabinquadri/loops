package loops;
import java.util.Scanner;
public class Percentageofmarks {

	public static void main(String[] args) {
		double sum,percentage;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of 1st subject");
	int a = sc.nextInt();
	Scanner se = new Scanner(System.in);
	System.out.println("Enter the marks of 2nd subjects");
	int b = se.nextInt();
	Scanner th = new Scanner(System.in);
	System.out.println("Enter the marks of 3rd subjects");
	int c = th.nextInt();
	Scanner fr = new Scanner(System.in);
	System.out.println("Enter the marks of 4th subjects");
	int d = fr.nextInt();
	Scanner fi = new Scanner(System.in);
	System.out.println("Enter the marks of 5h subjects");
	int e = fi.nextInt();
	sum =a +b +c+d+e;
	percentage = (sum/500)*100;
	System.out.println("The total marks and percentage of the five subjects are :" +sum +" and "+percentage+"%");
	

	}

}
