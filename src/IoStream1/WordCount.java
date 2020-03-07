package IoStream1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

public class WordCount {
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<>();
		al.add("Kiran");
		al.add("Kiran");
		al.add("Kiran1");
		al.add("Kiran1 ");
		al.add("Kiran1");
		al.add("Kiran12");
		HashSet<String>hs=new HashSet<>(al);
		System.out.println(hs);
		HashMap<String, Integer>hm=new HashMap<>();
		for(String ele:hs) {
			
			int uu=Collections.frequency(al, ele);
			System.out.println(uu);
			hm.put(ele,uu);
			}
		
		System.out.println(hm);
		
		
		
		//Collections.frequency(al, "kiran");
		//Stream<String> lm=al.stream().distinct().collect(collector());
		//System.out.println(lm);
		
		
		
		
		
		
		
		
		// HashMap<String,Integer>hm=new  HashMap<>();
		// for(String str2:al) {
			 
			// if(hm.put(str2, hm.get(str2))) {
				 
			 }
			 
		 
		
	}


