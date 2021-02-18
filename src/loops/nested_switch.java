package loops;

public class nested_switch {

	public static void main(String[] args) {
	int year = 2;
	String branch ="CSIT";
	
	switch(year) {
	case 1:
		System.out.println("ADM");
		break;
	case 2:
		switch(branch) {
		case "CS":
		case "CSIT":
			System.out.println("COA");
			break;
		case "ECE":
			System.out.println("machine");
			break;
		default:
			System.out.println("civils");
	}
	}
	
	

	}
}


