package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

 		List<String> list = new ArrayList<>();  //List do not accept primitive type only wrappers classes

		list.add("Keven");
		list.add("Raquel");
		list.add("Kaique");
		list.add("Ailton");
		list.add("Ana");
		list.add("Mileny");
		list.add(3, "Zeus");

		System.out.println("List contains size: " + list.size());
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("=====================================================================================");
		System.out.println("");
		list.remove(0); // Removes the element that the index points to.
		list.removeIf(name -> name.charAt(0) == 'A'); // Removes pro predicate elements. ( -> "tal quê" ).
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Index of Zeus: " + list.indexOf("Zeus")); // Finds the position of an element in the list.
		System.out.println("Indez of Keven " + list.indexOf("Keven")); // If the element is not found the value -1 is returned.
		System.out.println("=====================================================================================");
		System.out.println("");
		List<String> result = list.stream().filter(name -> name.charAt(0) == 'M').collect(Collectors.toList()); // Filter the list with a specific element and return me a new list with only the elements that contain the filter condition. 
		for (String name : result) {
			System.out.println(name);
		}
		System.out.println("=====================================================================================");
		System.out.println("");
		String name_1 = list.stream().filter(name -> name.charAt(0) == 'A').findFirst().orElse(null); // indFirst() Returns the first element that meets the filter. If this element does net exist it returns null.
		System.out.println(name_1);
	}

}
