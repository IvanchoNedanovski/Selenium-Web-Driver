package coreJava;

public class ChildLevel extends ChildClassDemo{


	public void getData(int a) {
		System.out.println(a);


	}

	public void getData(String a) {
		System.out.println(a);

	}
	public void getData(int a , int b) {
		System.out.println(b);


	}

	public static void main(String[] args) {

		ChildLevel cl = new ChildLevel();
		cl.audiosystem();
        cl.getData(5);
        cl.getData("hey");
        cl.getData(2,5);
	}
}
