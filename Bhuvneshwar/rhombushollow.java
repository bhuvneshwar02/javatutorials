import java.util.Scanner;

public class rhombushollow {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of rows that you want");
		int n=obj.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		obj.close();
    }
}
