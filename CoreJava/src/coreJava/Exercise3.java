package coreJava;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 */
		for (int i=1;i<5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}
		
		
		/*
		 * 3
		 * 6 9
		 * 12 15 18
		 */
/*
		for (int i=1;i<4;i++)
		{
			for (int j=3;j<=18;j+j)
			{
				System.out.print(j);
			
				System.out.print("\t");
				j=j+3;
			}
			System.out.println("");
		}
		*/

	}

}
