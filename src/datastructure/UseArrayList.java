package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> list = new ArrayList<>();

		// Add elements to the ArrayList
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("date");
		list.add("elderberry");

		// Retrieve elements using peek
		System.out.println("Peek: " + list.get(2));

		// Remove an element from the ArrayList
		list.remove(3);

		// Retrieve elements using for-each loop
		System.out.println("Using for-each loop:");
		for (String element : list) {
			System.out.println(element);
		}

		// Retrieve elements using while loop with Iterator
		System.out.println("Using while loop with Iterator:");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Sort the elements in the ArrayList
		Collections.sort(list);

		// Store the sorted data into a database
		// (Code to store data in a database would go here)
		System.out.println("Sorted data has been stored in a database");
	}
}





