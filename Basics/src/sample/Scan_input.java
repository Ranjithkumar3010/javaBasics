package sample;
import java.util.Scanner;

public class Scan_input {
	public static void main(String[] args) {
		System.out.println("Enter any string");
		
		Scanner obj = new Scanner(System.in);
		String name = obj.next();
		
		System.out.println("Result " + name);
	}
}
