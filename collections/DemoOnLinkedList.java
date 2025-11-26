package com.maven.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		
		Integer[] irr = {56,34,45,67,89,22,33};
		LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(irr));  //coverting to list and cast it
		
		//linked list descending iterator
		Iterator<Integer> itr = ll.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		System.out.println(ll.offer(89)); // adds the element at last
		System.out.println(ll);
		System.out.println(ll.peekLast()); //top most element 89
		System.out.println(ll.pollLast());// 89 deleted
		System.out.println(ll.peek()); //56
		System.out.println(ll.add(null)); // adds null 
		System.out.println(ll.pop()); // removes top most element 56
		System.out.println(ll);
	}

}
