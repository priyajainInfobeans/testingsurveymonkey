package com.map.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String args[]) {

		// Step 1: Defing object of HashMap Class

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		// Step 2: Adding Key Value pair

		hashMap.put(1001, "India");

		hashMap.put(1002, "Canada");

		hashMap.put(1003, "Australia");

		System.out.println(hashMap);
		// Step 3: Displaying key value pairs using for loop

		for (Map.Entry map : hashMap.entrySet()) {

			// Step 4: Using getKey and getValue methods to retrieve key and
			// corresponding value

			System.out.println(map.getKey() + " " + map.getValue());

		}
		
		//Step 5: Adding element with duplicate key

//		hashMap.put(1003,"Nepal");
//		System.out.println(hashMap);
//		
//		
//		//Step 5: Adding element with duplicate value
//
		hashMap.put(1004,"India");
		System.out.println(hashMap);

	}
}
