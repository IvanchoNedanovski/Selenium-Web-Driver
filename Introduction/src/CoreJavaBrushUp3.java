
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is a object
		
		String s1="Rahul Shetty Acadaemy";
		String s5="hello";
		
		
		String s2= new String("welcome");
		String s3= new String("welcome");
		
		String s = "RAhul Shetty Academy";
		String[] splitedString= s.split("Shetty");
		System.out.println(splitedString[0]);
		System.out.println(splitedString[1]);
		System.out.println(splitedString[1].trim());
		
		for(int i =s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}

	}

}
