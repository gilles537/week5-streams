package be.pxl.streams;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.*;

public class Challenge2 {
	public static void main(String[] args) {
		// maak een stream met 10 random gehele getallen tussen 0 en 30
		// bekijk hiervoor de methode ints(...) in de klasse Random
		// filter de getallen die deelbaar zijn door 3
		// en geef het maximum 
		// gebruik eventueel peek() om een tussenresultaat van de stream te tonen
		
		OptionalInt getal = new Random().ints(10,0,30)
				.filter(s -> s%3 == 0)
				.max();
		
		if (getal.isPresent()) {
			System.out.println(getal.getAsInt());
		} else {
			System.out.println("Geen resultaat :(");
		}
		
	}
}
