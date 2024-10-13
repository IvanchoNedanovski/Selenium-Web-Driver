package coreJava2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("usa");
		hs.add("uk");
		hs.add("india");
		hs.add("india");
		hs.add("mk");
		hs.add("srbia");
		System.out.println(hs);
		System.out.println(hs.remove("uk"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
	Iterator<String> i =hs.iterator();
	while(i.hasNext()) {
	System.out.println(i.next());
	}
  
	}


	}


