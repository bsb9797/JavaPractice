package com.maven.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {
	
	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1, "hyd");
		hashMap.put(43, "bnglr");
		hashMap.put(23, "chennai");
		hashMap.put(83, "delhi");
		
		hashMap.put(23, "kolar");  // doesnt take duplicates with same keys but overrides when different values
		
		System.out.println(hashMap);  // {1=hyd, 83=delhi, 23=kolar, 43=bnglr}
		
		System.out.println(hashMap.keySet());    //  [1, 83, 23, 43]
		System.out.println(hashMap.entrySet());  // [1=hyd, 83=delhi, 23=kolar, 43=bnglr]
		System.out.println(hashMap.values());    // returns simple set type, [hyd, delhi, kolar, bnglr] , if needed you have to cast it
		
		System.out.println(hashMap.get(1));    // returns hyd
		System.out.println(hashMap.getOrDefault(10, "madurai"));
		System.out.println(hashMap);
		
		
		//iterator
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer>  keyItr= keySet.iterator();
		while(keyItr.hasNext())
			System.out.println(keyItr.next()); 
		
		
//		Iterator<Entry<Integer,String>> entryItr = hashMap.entrySet().iterator();  //we are passing entry, so we are passing same generic type,convert to entry set and then apply iterator
//		while(entryItr.hasNext())
//		System.out.println(entryItr.next());
//		//1=hyd
//		//83=delhi
//		//23=kolar
//		//43=bnglr
		
		
		//Tree Map
		TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
		treeMap.put(1, 1);
		treeMap.put(2, 4);
		treeMap.put(7, 49);
		treeMap.put(4, 16);
		treeMap.put(12, 44);
		System.out.println(treeMap);    // {1=1, 2=4, 4=16, 7=49, 12=44}
		System.out.println(treeMap.ceilingEntry(5));  // 7=49
		System.out.println(treeMap.descendingMap());   // {12=44, 7=49, 4=16, 2=4, 1=1}
		System.out.println(treeMap.pollLastEntry());   //12=44
		
		//HashTable
		
}
}
