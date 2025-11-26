package com.maven.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoOnHashSet {
	public static void main(String[] args) {
		
	
	HashSet<Integer> hashSet = new HashSet<Integer>();
	hashSet.add(56);
	hashSet.add(94);
	hashSet.add(99);
	hashSet.add(89);
	hashSet.add(97);
	System.out.println(hashSet);  //to string
	
	hashSet.add(99);
	hashSet.add(99);
	hashSet.add(99);        //get is not possible bcz it doent have 
	System.out.println(hashSet);
	
	//enhanced for loop
	for(Integer i:hashSet)
		System.out.println(i);
	
	//iterator
	System.out.println("iterator");
	Iterator<Integer> itr = hashSet.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	
	//for each
	hashSet.forEach(i-> System.out.println(i));
	hashSet.forEach(System.out::println);  //method reference
	
	//adding null value
	hashSet.add(null);
	System.out.println(hashSet);
	
	
	//linkedhashset
	LinkedHashSet<Integer> llhashSet= new LinkedHashSet<Integer>();
	llhashSet.add(56);
	llhashSet.add(94);
	llhashSet.add(99);
	llhashSet.add(89);
	llhashSet.add(97);
	System.out.println(llhashSet);
	
	}
}
