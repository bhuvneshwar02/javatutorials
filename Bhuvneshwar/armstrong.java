import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int N=obj.nextInt();
		int dub=N;
		int dub_2=N;
		int s=0;
		int c=0;
		while(N>0){
			c++;
			N/=10;
		}
		while(dub>0) {
			int r=dub%10;
			s+=(int) Math.pow(r,c);
			dub/=10;
		}
		if(s==dub_2) {
			System.out.println(dub_2+" is an armstrong number");
		}
		else {
			System.out.println(dub_2+" is not armstrong number");
		}
		obj.close();
		
    }
}
