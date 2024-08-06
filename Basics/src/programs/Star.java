package programs;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		System.out.println("Enter number of line's for the stars");
		Scanner obj = new Scanner(System.in);
		int star = obj.nextInt();
		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i = star-1;i>=1;i--){
			for(int j=i;j>=1;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
