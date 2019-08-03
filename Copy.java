package mypackage;

public class Copy {
	
	String name;
	int age;
	
 Copy(String n,int a){
		
	 name = n;
	 age = a;
 }
 Copy(Copy c){
	 name = c.name;
	 age = c.age;
 }
 void display(){
 System.out.println(name + " " + age);
	}
 public static void main(String[] args) {
	 Copy c1 = new Copy("mathan",20);
	 Copy c2 = new Copy(c1);
	 
	 c1.display();
	 c2.display();
 }
}

