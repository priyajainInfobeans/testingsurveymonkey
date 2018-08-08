package com.linkedlist.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList <String> llist = new LinkedList<String>();

		  llist.add("Hi");
		  llist.add("I");
		  llist.add("Love");
		  llist.add("java");
		  System.out.println("LinkedList:" + llist);

		//Using Add method at specific index
//
//		  llist.add(1,"Element");
//		  System.out.println("Linked List:" + llist);
//		  
//		  
//		  Collection <String> collection = new ArrayList <String>();
//		  collection.add("I");
//		  collection.add("Love");
//		  collection.add("Automation");
//		  // using method addAll()
//		  
//		  llist.addAll(collection);
//		  System.out.println("Linked List:" + llist);
//
//
//		  
		// using method addAll() at index 3
//		  Collection <String> collection1 = new ArrayList <String>();
//		  collection1.add("I");
//		  collection1.add("Love");
//		  collection1.add("Selenium");
//		  llist.addAll(3,collection1);
//		  System.out.println("Linked List:" + llist);
//		  
//		  // add a new element at first position
//		  llist.addFirst("First");
//		  System.out.println("Linked List:" + llist);
//		  
//		  
//		  //add a new element at first position
//		  llist.addLast("Last");
//		  System.out.println("Linked List:" + llist);
//		  
		// clear the list
//		  llist.clear();
//		  System.out.println("Linked List:" + llist);

//		  
//		  //clone() method
//		  LinkedList <String> llist2 = new LinkedList<String>();
//		  // clone llist1
//		  llist2 =  (LinkedList<String>) llist.clone();
//		  // print list2
//		  System.out.println("Linked List 2:" + llist2);
//		  
//		// check if the list contains java
//		  System.out.println("List contains 'java':" + llist.contains("i"));

//		// print element at index 2 get(int index)
//		  System.out.println("Element at index 3 :" + llist.get(2));

//
//		  // print the first element using getFirst() method
//		  System.out.println("First Element :" + llist.getFirst());
//		  
//		  // print the last element of the list using getLast() method
//		  System.out.println("Last Element :" + llist.getLast());
//		  
//		// get the index for "java"
//		  System.out.println("Index for java:" + llist.indexOf("java"));
//		  
//		  
//		// set Iterator at specified index
//		Iterator<String> itr = llist.listIterator(2);
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//
		// remove the element at index 3
//		System.out.println("Element to be removed:" + llist.remove(3));
//		System.out.println("LinkedList:" + llist);
//		
//		
		// set "Infobeans" at index 3
//		System.out.println("Object to be replaced:" + llist.set(3, "Infobeans"));
//		// print the list
//		System.out.println("Linked List:" + llist);
//
//		//size of list
//		 System.out.println("linked List size:" + llist.size());
//		 
		 // remove the first element
		 System.out.println("First element:" + llist.removeFirst());
		 System.out.println("Linked List:" + llist);
		  // remove the last element
		 System.out.println("Last element:" + llist.removeLast());
		 System.out.println("Linked List:" + llist);
	}

}
