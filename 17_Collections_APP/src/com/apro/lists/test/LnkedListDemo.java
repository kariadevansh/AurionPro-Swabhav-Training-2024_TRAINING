package com.apro.lists.test;

import java.util.LinkedList;
import java.util.List;

public class LnkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("baa");
		list.add("kaaa");
		list.addFirst("aaraara");
		list.addLast("manko");
		
		System.out.println(list.peekLast());
		System.out.println(list.peekFirst());
	}

}
