import java.util.Scanner;

public class evenoddloops {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
		System.out.println("Enter the range that you want to find the even and odd number");
		int n=obj.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+" "+"is Even number");
			}
			else {
				System.out.println(i+" "+"is Odd number");
			}
		}
		obj.close();
    }
}
