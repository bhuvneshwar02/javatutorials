import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int a;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		a=obj.nextInt();
		System.out.println((a%2==0)?"number is even":"number is odd");
		obj.close();
    }
}
