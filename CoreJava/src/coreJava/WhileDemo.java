package coreJava;

public class WhileDemo {

	public static void main(String[] args) {
		
		
		//1 to 10
	//	int i =10;
		
		
	/*	while(i>0)
		{
			System.out.println(i);
			i--;
			
			
		}*/
		
		int j=20;
		do 
		{
			System.out.println(j);
			j++;
		}
		
		while(j>30); // 1 loop of execution is garantin
		{
			System.out.println(j);
			
		}

		for(int i=0;i<10;i=i+3)
		{
		if(i==9)
		System.out.println("9 is displayed");
		else
		System.out.println("I didnot find");//
		}
	}

}
