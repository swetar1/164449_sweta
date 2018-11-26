package framework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset1 {
	
		public static void main(String args[]){
		HashSet<Integer> bow = new HashSet<Integer>();
		
			bow.add(10);
			bow.add(20);
			bow.add(30);
			bow.add(15);
			bow.add(45);
			bow.add(5);
			
			System.out.println(bow);
		
		LinkedHashSet<Integer> now = new LinkedHashSet<Integer>();
		
		now.add(10);
		now.add(20);
		now.add(30);
		now.add(15);
		now.add(45);
		now.add(5);
		
		System.out.println(now);
		
			
			
			
		}
	}

