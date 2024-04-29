package cheeseInserter;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	//private - sichtbarkeitsbereich auf Klasse beschränkt
	//static - von der Klasse abhängig und nicht vom Objekt
	//final - Variable nach initialisierung unveränderbar
	
	private static final Pattern vegetables = Pattern.compile("Zucchin|Paprikas?|Zwiebeln?|Tomaten?");
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		//Initialisierung Laufvariable (iterator)
		//Abbruchbedingung (hasNext())
		//keine Inkrementierung -> passiert im Schleifenkörper
		for(ListIterator<String> iterator = ingredients.listIterator(); iterator.hasNext();) {
			String ingredient = iterator.next();
			//matcher -> wird verwendet, um ingredient in unserem Muster zu finden
			//matches() -> für den direkten Vergleich
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("Käse");
			}
		}
	}

	public static void main(String[] args) {

		List<String> ingredients = new LinkedList<String>();
		Collections.addAll(ingredients, "Gnocchi", "Paprika", "Tomate", "Pfeffer");
		insertCheeseAroundVegetable(ingredients);
		System.out.println(ingredients);
	}

}
