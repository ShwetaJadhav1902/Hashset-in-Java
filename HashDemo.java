package hashset;

import java.util.HashSet;

public class HashDemo {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(40);
	h.add(50);
	h.add(20);
	
	System.out.println(h.contains("20"));
	h.remove(10);
	
	System.out.println(h);
	System.out.println(h.size());
	
	if(h.isEmpty()) {
		System.out.println("List Is Empty");
	}
	else {
		System.out.println("Not Empty");
	}
}
}
