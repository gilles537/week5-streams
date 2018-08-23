package be.pxl.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Challenge3 {
	public static void main(String[] args) {
		List<String> topNames = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
		// 1. Druk alle namen van de lijst af in gesorteerde volgorde.
		// Zorg dat de eerste letter van een naam steeds met hoofdletter begint.
		
		
		// 2. Druk alle namen af die beginnen met A (of a)
		// Zorg dat de eerste letter van een naam steeds met hoofdletter begint.
		// Verwachte output: Amelia Ava
		
		
		// 3. Hoeveel namen beginnen er met A
		// Verwachte output: 2
		
		Function<String,String> uppercase = s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
		Predicate<String> startsWithA = s -> s.startsWith("A");
		
		//1
		topNames.stream().map(uppercase)
						 .sorted()
						 .forEach(System.out::println);
		//2
		topNames.stream().map(uppercase)
						 .filter(startsWithA)
						 .forEach(System.out::println);;
		//3				 
		System.out.println(topNames.stream().filter(startsWithA).count());
						 
		
		
		
	}
}
