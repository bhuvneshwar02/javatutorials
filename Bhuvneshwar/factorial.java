import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1;
		Scanner obj=new Scanner(System.in);	
		System.out.println("Enter the number");
		int num=obj.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of the number is"+" "+fact);
		obj.close();
    }
}
