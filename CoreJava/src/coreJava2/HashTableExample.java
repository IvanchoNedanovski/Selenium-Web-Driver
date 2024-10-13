package coreJava2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "goodbye");
		hm.put(42, "morning");
		hm.put(3, "evening");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
