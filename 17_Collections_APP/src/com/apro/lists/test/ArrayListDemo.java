package com.apro.lists.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = Arrays.asList(1,2,4,5,6,7,7,8); 
		System.out.println(list);
		System.out.println(list.size());
		list.add("Devansh");
		list.add("aduijvoqp");
		System.out.println(list);
		list.add(0, "Karia");
		System.out.println(list);
		list.add("aickjac");
		System.out.println(list);
		
		list.remove("aduijvoqp");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.contains("aickjac"));
		
		
		System.out.println(list.equals(list2));
		
		
		System.out.println("Printing each elemet");
		System.out.println("Using normal for loop");
		for(int i=0;i<list3.size();i++)
			System.out.println(list3.get(i));
		
		System.out.println("Using advanced for loop");
		for(Integer numbers:list3)
			System.out.println(numbers);
		
		System.out.println("using Iterators");
		
		Iterator<Integer> iterator = list3.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		
		System.out.println("using ListIterator");
		
		ListIterator<Integer> listIterator = list3.listIterator();
		System.out.println("in forward direction");
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
		
		System.out.println("in backward direction");
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
	}
}
