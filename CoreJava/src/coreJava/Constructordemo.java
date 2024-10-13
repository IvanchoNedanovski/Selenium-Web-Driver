package coreJava;

public class Constructordemo {
	// default constructor
	public Constructordemo() {
		System.out.println("i am in the constructor");
		System.out.println("i am in the constructor lectrure 1");
	}

	// Parameterizized constructor
	public Constructordemo(int a, int b) {
		System.out.println("i am in the parameterzied constructor");
        int c=a+b;
        System.out.println(c);
	}
	
	public Constructordemo(String str) {
		System.out.println(str);

	}

	public void getData() {
		System.out.println("i am the method");
	}

	// will not return values
	// name of constructor should be the class name

	public static void main(String[] args) {

		
		Constructordemo cd = new Constructordemo("hello");
		Constructordemo c = new Constructordemo(4, 5);
		// compiler will call implict constructor if you have not defined constructor
		// block
		// when ever you create an object constructor is called
		// block of code when ever an object is created
		System.out.println("a");

	}

}


