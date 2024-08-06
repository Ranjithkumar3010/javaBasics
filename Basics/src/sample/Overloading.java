package sample;

public class Overloading {
	public void studentDetails(String name) {
		System.out.println(name);
	}
	public void studentDetails(int age) {
		System.out.println(age);
	}
	public void studentDetails(long phno) {
		System.out.println(phno);
	}
	public void studentDetails(boolean ispresent) {
		System.out.println(ispresent);
	}
	
	public static void main(String[] args) {
		Overloading obj =new Overloading();
		obj.studentDetails("Sudha");
		obj.studentDetails(30);
		obj.studentDetails(1234567890);
		obj.studentDetails(true);
		
	}

}
