package coreJava;

public class ChildClassDemo extends ParentClassDemo {

	public void audiosystem() {
		System.out.println("new audio child");
	}

	public void engine() {
		System.out.println("new engine");
	}

	public void colour() {
		System.out.println(colour);
	}

	public static void main(String[] args) {

		ChildClassDemo cd = new ChildClassDemo();
		cd.colour();
		cd.Brakes();
		cd.audiosystem();

	}

}
