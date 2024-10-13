package coreJava;

public class ExeptionDemo {

	public static void main(String[] args) {

		int b = 7;
		int c = 0;

		try {

			// int k = b / c;
			// System.out.println(k);
			int arr[] = new int[5];
			System.out.println(arr[7]);
		}

		catch (ArithmeticException et) {
			System.out.println("I catched AritmeticException");
		}

		catch (IndexOutOfBoundsException ets) {
			System.out.println("I catched IndexOutOfBoundsException ");
		}

		catch (Exception e) {
			System.out.println("I catched error/exeption");

		} finally {
			System.out.println("delete cookies");
		}
	}
}
