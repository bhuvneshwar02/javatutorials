import java.util.Scanner;

public class greaternumber {
    public static void main(String[] args) {
        int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the first number");
		a=obj.nextInt();
		System.out.println("enter the second number");
		b=obj.nextInt();
		System.out.println("enter the third number");
		c=obj.nextInt();
		int d=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("greater number is"+d);
		obj.close();
    }
}
