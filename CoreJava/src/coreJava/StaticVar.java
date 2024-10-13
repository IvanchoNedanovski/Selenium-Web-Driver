package coreJava;

public class StaticVar {
	String name;
	String address;
	static String city;
	static int i;

	static {
		city = "Bangular";
		i = 2;
	}

	StaticVar(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);

	}

	public void getAddress() {
		System.out.println(address + city);
	}

	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {

		StaticVar obj = new StaticVar("Bob", "Marthalli");
		StaticVar obj1 = new StaticVar("Ram", "Jayangar");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();
	}

}
