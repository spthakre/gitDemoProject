package gitDemoProject;

import java.util.HashMap;

public class A {

	public class HashMapTest {
		public  void main(String[] args) {
			HashMap<Integer, String> hm = new HashMap<Integer, String>();
			hm.put(23, "india 1");
			hm.put(56, "india 2");
			hm.put(12, "india 3");
			hm.put(34, "india 4");
			hm.put(23, "india 5");
			hm.put(12, "india 6");
			hm.put(12, "india 7");
			System.out.println(hm.size());
			System.out.println(hm);
		}

	}
}