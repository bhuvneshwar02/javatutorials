import java.util.Scanner;

public class leapyrfuntion {
    static boolean leap(int year) {
		if(year%4==0) {
				return true;
			}
		if(year%100==0) {
		        return false;
		}
		if (year%400==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=obj.nextInt();
		System.out.println(leap(year)?"year is leap year":"year is not leap year");
		obj.close();
    }
}
