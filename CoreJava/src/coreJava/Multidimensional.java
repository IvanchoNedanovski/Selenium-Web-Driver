package coreJava;

public class Multidimensional {

	public static void main(String[] args) {

		// a[row][coloum]

		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
		}

		System.out.println(a[1][0]);
		// ecercise -A

		int b[][] = { { 2, 4, 5 }, { 3, 4, 7 },{5,2,1} };
		System.out.println(b[2][1]);

		for (int e = 0; e < 3;e++) {  //row
			for (int s = 0; s < 3; s++) {//coloum
				System.out.println(b[e][s]);
			}
		}

	}

}
