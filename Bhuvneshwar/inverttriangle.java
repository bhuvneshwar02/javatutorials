import java.util.Scanner;

public class inverttriangle {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of rows that you want");
		int n=obj.nextInt();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();

	}
		obj.close();
    }
}
