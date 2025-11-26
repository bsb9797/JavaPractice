package com.maven.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.maven.immutableclasses.Person;

public class DemoOnArrayList {

	public static void main(String[] args) {
//		// normal arraylist object primitive data items
//		ArrayList alist=new ArrayList();
//		alist.add(56);
//		alist.add("bhargav");
//		alist.add(true);
//		alist.add(89.76);
//		Person p=new Person("bhargav",12345);
//		alist.add(p);
//		System.out.println(alist);
//		System.out.println(alist.get(2));
//		alist.add(null);
//		alist.add(null);
//		System.out.println(alist);
//		
//		
//		//using generics
//		ArrayList<String> namesList= new ArrayList<String>();
//		namesList.add("amit");
//		namesList.add("varun");
//		namesList.add("Anirudha");
//		namesList.add("Jagan");
//		System.out.println(namesList);
//		
//		
//		//using enhanced for
//		for(String name:namesList)
//			System.out.println(name);
//		
//		
//		//using iterator- both directions f/b
//		Iterator<String> itr = namesList.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		
//		//using list iterator
//		ListIterator<String> litr = namesList.listIterator();
//		System.out.println("forward direction");
//		while(litr.hasNext())
//			System.out.println(litr.next());
//		System.out.println("Backward direction");
//		while(litr.hasPrevious())
//			System.out.println(litr.previous());
//		
//		
//		//checking contains method
//		System.out.println(alist.contains("bhargav"));
//		
//		//for each method print operation
//		System.out.println("ForEach");
//		namesList.forEach(name -> System.out.println(name));//consumer using lambda
//		namesList.forEach(System.out::println);//consumer using MR 
//		
//		//remove method
//		System.out.println(namesList.remove(0));
//		
//		
//		//retians all method - common will be there remianing all is removed
//		Integer[] arr= {1,2,3,4,5,6,7};
//		Integer[] brr= {2,3,4,5,6,10};
//		List<Integer> numList1=new ArrayList<Integer>(Arrays.asList(arr));
//		List<Integer> numList2=new ArrayList<Integer>(Arrays.asList(brr));
//		System.out.println("before retain op" + numList1);
//		numList1.retainAll(numList2);
//		System.out.println("after retain op" + numList1);
//		
//		//using collections sorting
//		System.out.println("NamesList:" +namesList);
//		Collections.sort(namesList);
//		System.out.println("after sorting\n" +namesList);//depends on asci values
//		
//		//cloneable //same copy , but when any modification done hash code chnages
//		ArrayList<String> clonedNamesList=(ArrayList<String>) namesList.clone();
//		System.out.println(namesList.hashCode());
//		System.out.println(clonedNamesList.hashCode());
//		
//		clonedNamesList.add("bhargav");
//		System.out.println(clonedNamesList.hashCode());
		
		
		
		//student class
		ArrayList<Student> StudnameList= new ArrayList<Student>();
		StudnameList.add(new Student(123,"amit",90));
		StudnameList.add(new Student(127,"ravi",99));
		StudnameList.add(new Student(125,"surya",95));
		StudnameList.add(new Student(126,"yatin",88));
		StudnameList.add(new Student(123,"amit",90));
		StudnameList.add(new Student(127,"ravi",99));
		StudnameList.add(new Student(125,"zurya",95));
		StudnameList.add(new Student(126,"yatin",88));
		StudnameList.add(new Student(123,"amit",90));
		StudnameList.add(new Student(127,"ravi",99));
		StudnameList.add(new Student(125,"zurya",95));
		StudnameList.add(new Student(126,"yatin",88));
		System.out.println(StudnameList);
		StudnameList.sort(StudnameList);
		for(Student name:StudnameList)
			System.out.println(name);
		
//		//iterator
//		Iterator<Student> itr = StudnameList.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		//collections
//		System.out.println("NamesList:" +StudnameList);
//		Collections.sort(StudnameList);
//		for(Student name:StudnameList)
//			System.out.println(name);
	}

}
