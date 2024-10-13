package coreJava;

public class Exercise1 {

	public static void main(String[] args) {
		/*
		 1 2 3 4
		 5 6 7
		 8 9
		 10
		 */
		for (int i = 1; i <= 1; i++) {
			System.out.println("1 2 3 4");
			for (int j = 1; j <= 1; j++) {
				System.out.println("5 6 7");
				for (int k = 1; k <= 1; k++) {
					System.out.println("8 9 ");
					for (int l = 1; l <= 1; l++) {
						System.out.println("10 ");
					}
				}
			}

		}

		int k = 1;

		for (int g = 0; g < 4; g++) // (outer for loo) his block will loop for 4 times
		{

			// System.out.println("outer loop started");
			for (int j = 1; j <= 4 - g; j++) // inner loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}

	}

}
