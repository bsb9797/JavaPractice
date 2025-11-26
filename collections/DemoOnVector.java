package com.maven.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoOnVector {

	public static void main(String[] args) {
	
		Vector<Integer> vector = new Vector<Integer>();
		System.out.println(vector.capacity()); // capacity is null
		
		for(int i=1;i<=10;i++)
			vector.add(i);
		System.out.println(vector.capacity()); //capacity is full
		
		vector.add(11);
		System.out.println(vector.capacity()); // extra capacity created waste of memory
		
		//vector to enumeration possible only in linked list
		System.out.println("converting vector to enumeration and printing collection");
		Enumeration<Integer> enums =  vector.elements();  //When you call vector.elements(),it returns an Enumeration object.
		while(enums.hasMoreElements())                //two key methods:boolean hasMoreElements() and E nextElement() , 
			System.out.println(enums.nextElement());  // you cant remove but in iterator you can remove
		
		
		//using iterator to print collection
		System.out.println("using iterator to print collection");
		Iterator<Integer> itr = vector.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//concurrent operation
		System.out.println("using iterator to print collection");
		Iterator<Integer> irr = vector.iterator();
		while(irr.hasNext()) {
			int num=irr.next();
			if(num%3==0)                    // concurrently iterating and removal happening
				irr.remove();                // concurrent modification = remove() possible on vectors
			System.out.println(num);
		}
			System.out.println(vector);   // remove operation is done 

	}

}
