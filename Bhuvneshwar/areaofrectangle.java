import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        int l,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the length");
		l=obj.nextInt();
		System.out.println("enter the breadth");
		b=obj.nextInt();
		System.out.println("area of rectangle="+(l*b));
		obj.close();
    }
}
