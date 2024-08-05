package com.arpo.sets.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// it stores elements randomly and doesn't maintain any order
		HashSet<String> set = new HashSet<String>();
		set.add("aaaaaaa");
		set.add("bbbbbbb");
		set.add("ccccccc");
		set.add("ddddddd");
		set.add("aaaaaaa");

		
		System.out.println(set);
		
		// linked hash set maintains the elements in the order they are inserted
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("ccccccc");
		set2.add("aaaaaaa");
		set2.add("ddddddd");
		set2.add("aaaaaaa");
		set2.add("bbbbbbb");
		
		System.out.println(set2);
		
		// treeSet implements sortedset so the elements inserted are by default stored in an ascending sorted form
		TreeSet<String> set3 = new TreeSet<String>();
		
		set3.add("ccccccc");
		set3.add("aaaaaaa");
		set3.add("ddddddd");
		set3.add("aaaaaaa");
		set3.add("bbbbbbb");
		
		System.out.println(set3);
	}
}
