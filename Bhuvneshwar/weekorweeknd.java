import java.util.Scanner;

public class weekorweeknd {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
		int choice;
		String day;
		System.out.println("Enter the day of the week");
		day=obj.nextLine();
		System.out.println("enter 1 to check is sunday a weekend day or weekday?");
		System.out.println("enter 1 to check is monday a weekend day or weekday?");
		System.out.println("enter 1 to check is tuesday a weekend day or weekday?");
		System.out.println("enter 1 to check is wednesday a weekend day or weekday?");
		System.out.println("enter 1 to check is thrusday a weekend day or weekday?");
		System.out.println("enter 1 to check is friday a weekend day or weekday?");
		System.out.println("enter 1 to check is saturday a weekend day or weekday?");
		choice=obj.nextInt();
		switch(choice) {
		case 1:
			day="sunday";
			System.out.println(day+"is a Weekend day");
			break;
		case 2:
			day="monday";
			System.out.println(day+"is a Weekday");
			break;
		case 3:
			day="tuesday";
			System.out.println(day+"is a Weekday");
			break;
		case 4:
			day="wednesday";
			System.out.println(day+"is a Weekday");
			break;
		case 5:
			day="thrusday";
			System.out.println(day+"is a Weekday");
			break;
		case 6:
			day="friday";
			System.out.println(day+"is a Weekday");
			break;
		case 7:
			day="saturday";
			System.out.println(day+"is a Weekend day");
			break;
		default:
			System.out.println("Invalid input");
		}
		obj.close();
	}
}
