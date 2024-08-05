package com.apro.maps.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "aaaa");
		map.put(2, "bbbb");
		map.put(3, "cccc");
		map.put(4, "aaaa");
		
		System.out.println(map);
		
		map.put(3, "caac");
		map.put(2, "baab");
		System.out.println(map);
		
		map.put(4, "aaaa");
		map.put(1, "bbbb");
		map.put(3, "cccc");
		map.put(2, "aaaa");
		
		System.out.println(map);
		
		System.out.println("\n Now linked hash map");
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		map2.put(4, "aaaa");
		map2.put(1, "bbbb");
		map2.put(3, "cccc");
		map2.put(2, "aaaa");
		
		System.out.println(map2);
		
		System.out.println("\n Now tree map");
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		map3.put(4, "aaaa");
		map3.put(1, "bbbb");
		map3.put(3, "cccc");
		map3.put(2, "aaaa");
		
		System.out.println(map3);
		
		System.out.println("\nConverting the treeMap into a set to iterate over ther entries in the map");
		Set<Entry<Integer,String>> entries=map3.entrySet();	
		
		for(Entry<Integer,String> entry : entries) {
			System.out.println(entry.getValue());
		}
		
	}
}
