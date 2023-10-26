import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        int r;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the radius of the circle");
		r=obj.nextInt();
		System.out.println("area of circle="+(3.14*r*r));
		obj.close();
    }
}
