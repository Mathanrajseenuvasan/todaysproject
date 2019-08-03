package mypackage;

public class Adder {

	
	public static void main(String [] args) {
		System.out.println(Dummy.add(11, 22));
		System.out.println(Dummy.add(11, 22, 33));
	}
	
	
}class Dummy{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}
