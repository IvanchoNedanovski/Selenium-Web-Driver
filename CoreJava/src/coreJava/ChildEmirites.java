package coreJava;

public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {

		ChildEmirites ce = new ChildEmirites();
		ce.engine();
		ce.safetyGuidelines();
		ce.bodyColor();

	}

	@Override
	public void bodyColor() {

		System.out.println("Red color on the body");

	}

}
