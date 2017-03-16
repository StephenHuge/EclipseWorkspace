package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;




public class forAnother {
	public static void main(String[] args){
	Collection<String> l = new ArrayList<>();
	l.add("a");
	l.add("aaa");
	l.add("aaaa");
	Iterator<String> a = l.iterator();
	while(a.hasNext()){
		String s = a.next();
		System.out.println(s);
	}
	}
}
