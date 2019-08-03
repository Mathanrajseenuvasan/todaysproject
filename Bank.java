package mypackage;

class Sbi extends Bank{
	void display() {
		System.out.println("this is about Sbi");
	}
}
class Cub extends Bank{
	void display() {
		System.out.println("this is about Cub");
	}
}


public class Bank {
	void display() {
		System.out.println("this is about bank");
	}
	public static void main(String[] args) {
		Sbi s = new Sbi();
		Cub c = new Cub();
		
		c.display();
	}
}
