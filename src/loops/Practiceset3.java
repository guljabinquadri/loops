package loops;
import java.util.Scanner;

public class Practiceset3 {

	public static void main(String[] args) {
		//question_1
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks for first subject");
		int m1 = sc.nextInt();
		
		System.out.println("Enter your marks for second subject");
		int m2 = sc.nextInt();
		
		System.out.println("Enter your marks for third subject");
		int m3 = sc.nextInt();
		double percentage = (m1+m2+m3)/3.0;
		System.out.println("The percentage is " +percentage +"%");
	
		if(percentage>=40 && m1>=30 && m2>=30 && m3>=30)
		{
			System.out.println("You are pass");
		}
		else {
			System.out.println("You are fail");
		}
		*/
		/*question2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income in lakhs per annum");
		double income = sc.nextDouble();
		double tax = 0.0;
		if(income <= 2.5)
		{
		   tax= tax + 0.0;
		}
		else if(income>2.5 && income <=5.0)
		{
			tax = tax + 0.05 *(income-2.5 );
		}
		else if(income>5.0 && income <=10.0)
		{
			tax = tax + 0.05 *(5.0-2.5 );
			tax = tax + 0.2 *(income-5.0 );
		}
		else if(income>10.0)
		{
			tax = tax + 0.05 *(5.0-2.5 );
			tax = tax + 0.2 *(10.0-5.0 );
			tax = tax + 0.3 *(income-10.0 );
		}
		System.out.println("The tax to be paid is " +tax);
		} */
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day in number");
		int day = sc.nextInt();
		switch(day){
		case 1:
		{
			System.out.println("Monday");
		}
		break;
		case 2:
		{
			System.out.println("Teusday");
		}break;
		case 3:
		{
			System.out.println("Wednesday");
		}break;
		case 4:
		{
			System.out.println("Thursday");
		}break;
		case 5:
		{
			System.out.println("Friday");
		}
		case 6:
		{
			System.out.println("Saturday");
		}break;
		case 7:
		{
			System.out.println("Sunday");
		}break;
		default:
		{
			System.out.println("Error");
		}
		
		
		}
		*/	
		//question5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year in number");
		int year = sc.nextInt();
		if (year % 400== 0) {
			System.out.println("its ia leap year");
			}
		else if( year % 100==0)
		{ 
			System.out.println("It is not a leap year");
		}
		else if( year % 4==0)
		{ 
			System.out.println("It is a leap year");
		}
		else 
		{ 
			System.out.println("It is not a leap year");
		}
		//question6
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the website");
		String website = sc.nextLine();
		if (website.endsWith(".com")) {
			System.out.println("It is a commerical website");
		}
		else if (website.endsWith(".org"))
		{
			System.out.println("Its an organisational website");
		}
		else if (website.endsWith(".in"))
		{
			System.out.println("Its an Indian website");
		} 
		}
}
	
