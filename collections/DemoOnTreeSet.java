package com.maven.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoOnTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet =  new TreeSet<Integer>();
		treeSet.add(34);
		treeSet.add(12);
		treeSet.add(90);
		treeSet.add(11);
		System.out.println(treeSet);
		
		//methods
		System.out.println(treeSet.ceiling(89)); //return ceiling value nearest to 89 gives 90, ceiling of 90 gives same 
		System.out.println(treeSet.floor(89));  //returns floor value nearest to 89 its 39
		
		//iterator
		Iterator<Integer> itr = treeSet.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		System.out.println(treeSet.headSet(90));  // returns what's all ahead of 90 -> [11,12,34]
		System.out.println(treeSet.tailSet(90));  // gives same 90 itself bcz its at last and has no elements after it
		
		//student class in treeset
		TreeSet<Student> Studnametree= new TreeSet<Student>(); // user defined multiple properties
		Studnametree.add(new Student(123,"amit",90));
		Studnametree.add(new Student(127,"ravi",99));
		Studnametree.add(new Student(125,"surya",95));
		Studnametree.add(new Student(126,"yatin",88));
		Studnametree.add(new Student(123,"amit",90));   // no duplicates allowed
		for(Student s:Studnametree)
			System.out.println(s);
		// System.out.println(Studnametree);
		
		
		Hashtable<Integer, String> hashtab = new Hashtable<Integer, String>(); // has table is a class and synchronised
		 // Adding key-value pairs
        hashtab.put(1, "ravi");
        hashtab.put(2, "jagan");
        hashtab.put(3, "Anirudha");

        // Accessing keys
        System.out.println(hashtab);
        Enumeration<Integer> keys = hashtab.keys();  // used traverse (iterate) through the elements of a Hashtable, you can use an Enumeration object.
        while(keys.hasMoreElements()) {
        	System.out.println(keys.nextElement());  //gives keys
        // Accessing values	
        Enumeration<String> values = hashtab.elements();
        while(values.hasMoreElements()) 
        	System.out.println(values.nextElement());  //gives only values
        }
	}

}
