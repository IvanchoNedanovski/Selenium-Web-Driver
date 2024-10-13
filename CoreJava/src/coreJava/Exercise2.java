package coreJava;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		
		int k=1;
		for (int i=1; i<5; i++)
		{
			for (int j=1; j<=i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;	
		}
		
			System.out.println("");
		}
		
	/*	for (int i=1; i<=1 ;i++)
		{
			System.out.println( "1");
			for (int j=1; j<=1 ;j++)
			{
				System.out.println("2 3 ");
				for (int k=1; k<=1 ;k++)
				{
					System.out.println("4 5 6");
					for (int l=1; l<=1 ;l++)
					{
						System.out.println("7 8 9 10 ");
					}
				}
			}
			
		} */

	}

}
