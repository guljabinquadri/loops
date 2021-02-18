package loops;

public class switch_3 {

	public static void main(String[] args) {
		int day = 6;
		String daytype;
		
		switch(day)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		{
			daytype="weekday";
		}
		break;
		case 6:
		case 7:
		{
			daytype =" weekend";
		}
		break;
		default:
		{
			daytype ="invalid";
		}
		}
System.out.println( "It is a "+ daytype);
	}

}
