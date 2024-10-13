package coreJava2;

import java.util.ArrayList;

public class ArrayListExampleCoreJava2 {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

		a.add("rahul");
		a.add("java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		/*
		 * a.remove(2); a.remove("rahul"); System.out.println(a);
		 */
		System.out.println(a.get(2));
		// testing
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
