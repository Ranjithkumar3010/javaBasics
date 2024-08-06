package sample;

public class Dog{
	public void animal() {
		System.out.println("Dog - Barks");
	}
	
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.animal("cat");
	}

}
