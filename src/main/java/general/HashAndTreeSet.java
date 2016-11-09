package main.java.general;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashAndTreeSet {
	
	public static void main(String args[]){
		linkedHashSet(args);
		hashSet(args);
		treeSet(args);
	}
	
	/* strictly follows the insertion order, NO repeats */
	public static void linkedHashSet(String[] args){
	    LinkedHashSet hh=new LinkedHashSet();
	            hh.add("D");
	            hh.add("A");
			    hh.add("B");
			    hh.add("C");
	            hh.add("a");  
	            hh.add("3"); 
	            hh.add("a");

	    System.out.println("LinkedHashSet size:" + hh.size()+"");
	    System.out.println(hh);

	    Iterator i=hh.iterator();
	    while(i.hasNext()){
	    	System.out.print(i.next() + " ");
	    }   
	    System.out.println("\n");
	}
	
	/* Random order, No repeats */
	public static void hashSet(String[] args) {
		HashSet hh = new HashSet();
		hh.add("D");
		hh.add("A");
		hh.add("B");
		hh.add("a");
		hh.add("C");
		hh.add("a");
		hh.add("3"); 
		System.out.println("HashSet size:" + hh.size() + " hashCode: " + hh.hashCode());
		System.out.println(hh);

		Iterator i = hh.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println("\n");
	}
	
	/* TreeSet arranges the elements in ASCII increasing order, NO Repeats. numbers < capital letters < small letters*/
	public static void treeSet(String[] args) {
		TreeSet hh = new TreeSet();
		hh.add("1");
		hh.add("g");
		hh.add("H");
		hh.add("5");
		hh.add("3");
		hh.add("5");
		hh.add("2");
		hh.add("7");
		hh.add("g");
		hh.add("a");
		hh.add("b");

		System.out.println("TreeSet Checking the size is:" + hh.size() + "");
		System.out.println(hh);

		Iterator i = hh.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println("\n");
	}

}
