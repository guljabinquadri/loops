package loops;
import java.util.*;

public class switch_4 {

	public static void main(String[] args) {
		Scanner inputday = new Scanner(System.in);
		System.out.println("Enter the day number");
		int day = inputday.nextInt();
		String dayname = "";
		
		switch(day) {
		case 1:
			dayname = "Monday";
			break;
		case 2:
			dayname = "Tuesday";
			break;
		case 3:
			dayname = "Wednesday";
			break;
		case 4:
			dayname = "Thursday";
			break;
		case 5:
			dayname = "Friday";
			break;
		case 6:
			dayname = "Saturday";
			break;
		case 7:
			dayname ="Sunday";
			break;
			default:
			{
				System.out.println("Invaild");
			}
			}
		System.out.println("It's " + dayname);
	}

}
