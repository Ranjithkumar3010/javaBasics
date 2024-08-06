package programs;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		int d =c;
			c=a;
			a=b;
			b=d;
			System.out.println("Swapped number is"+a+b+c) ;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		
	}
}
