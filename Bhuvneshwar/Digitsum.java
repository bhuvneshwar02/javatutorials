import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
		int sum=0;
		Scanner obj=new Scanner(System.in);	
		System.out.println("Enter the number");
		int num=obj.nextInt();
		while(num>0) {
		int digit=num%10;
		sum=sum+digit;
		num=num/10;
	}
		System.out.println("Sum of the given digit is"+" "+sum);
		obj.close();
}    
}
