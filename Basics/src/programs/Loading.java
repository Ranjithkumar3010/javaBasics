package programs;

public class Loading {
	public void address(int addressno) {
		System.out.println(addressno);
	}
	public void address(String street) {
		System.out.println(street);
	}
	public void address(long pincode) {
		System.out.println(pincode);
	}
	public void address(boolean currentactiveaddress) {
		System.out.println(currentactiveaddress);
	}
public static void main(String[]args) {
	Loading obj = new Loading();
	obj.address(123);
	obj.address("street name");
	obj.address(600068);
	obj.address(true);
}
}
