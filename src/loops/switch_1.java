package loops;



	import java.util.Scanner;
	public class switch_1 {
	  public static void main(String[] args) {
	  int age;
	  Scanner inputnum = new Scanner(System.in);
	  System.out.println("Enter your age");
	  age= inputnum.nextInt();
	  
	  switch(age){
	    case 10:
	      case 15:
	        case 17:
	          {
	            System.out.println("You are not eligible for voting");
	          }
	          break;
	          case 18:
	            {
	                System.out.println("You are eligible for voting");
	            }
	            break;
	            default:
	            {
	              System.out.println("Invalid");
	            }
	  }
	  
	 }
	}

