import java.util.Scanner;

public class swapwithout3v {
    public static void main(String[] args) {
        int l,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the first number");
		l=obj.nextInt();
		System.out.println("enter the second number");
		b=obj.nextInt();
		l=l+b;
		b=l-b;
		l=l-b;
		System.out.println("ater swapping numbers a is "+l+" "+"ater swapping numbers b is "+b);
		obj.close();
    }
}
