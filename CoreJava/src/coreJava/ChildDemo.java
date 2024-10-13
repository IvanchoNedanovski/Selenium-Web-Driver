package coreJava;

public class ChildDemo extends ParentDemo{

	String name = "QaClickAcadamy";

	public ChildDemo() {
		super(); // this should be always be at first line
		System.out.println("Child class constructor");
	}

	public void getStringdata() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("I am child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildDemo cd = new ChildDemo();
		cd.getStringdata();
		cd.getData();
	}

}
