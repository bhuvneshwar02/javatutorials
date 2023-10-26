import java.util.Scanner;

public class pascaltriangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			int num=1;
			for(int k=0;k<=i;k++) {
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
			System.out.println();
		}
		sc.close();
    }
}
