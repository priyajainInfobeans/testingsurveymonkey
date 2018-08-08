package com.map.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExamples {

	public static void main(String[] args) {

		Map<String, Integer> linkedHashMapobject = new LinkedHashMap<String, Integer>();

		linkedHashMapobject.put("Samsung Grand quattro price ", new Integer(10000));

		linkedHashMapobject.put("Micromax canvas price", new Integer(9000));

		linkedHashMapobject.put("Sony T2 Ultra price", new Integer(20000));

		linkedHashMapobject.put("Nokia Lumia price", new Integer(15000));

		linkedHashMapobject.put("Microsoft Lumia price ", new Integer(16000));

		// Displaying the contents of the LinkedHashMap before usig clear method

		System.out.println("Contents of LinkedHashMap before clear method : " +

				linkedHashMapobject);

		linkedHashMapobject.clear();

		// Displaying the contents of the LinkedHashMap before usig clear method

	//	System.out.println("Contents of LinkedHashMap  after clear method: " + linkedHashMapobject);
		
		//Checking whether Map contains a particular key

		System.out.println("\nLinkedHashMap contains 'Nokia Lumia price' as key? : " + linkedHashMapobject.containsKey("Nokia Lumia price"));
	}
}
