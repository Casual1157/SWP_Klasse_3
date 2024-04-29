package musicalChairs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MusicalChair {
	
	private List<String> names;

	public MusicalChair(String... names) {
		//String... kann beliebig viele Strings übernehmen
		//Java regelt das Intern mit einem Array
		//Dadurch wird length und nicht size verwendet!
		if(names.length > 0) {
			//Arrays.asList(names) - wandelt ein Array in einer Liste um
			this.names = new LinkedList<String>(Arrays.asList(names));
		}
	}
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
	
	public String toString() {
		Iterator<String> itr = this.names.iterator();
		String tmp = "";
		while(itr.hasNext()) {
			tmp = tmp + itr.next() + ", ";
		}
		return tmp;
	}
	
	public void rotate(int distance) {
		Collections.rotate(this.names, distance);
	}
	
	public void rotateAndRemoveLast(int distance) {
		this.rotate(distance);
		((LinkedList<String>) this.names).removeLast();
	}
	
	public void play(int distance) {
		if(this.names.size() <= 0) {
			System.err.println("Die Liste beinhaltet keine Einträge!");
		}else {
			while(this.names.size() >= 1) {
				this.rotateAndRemoveLast(distance);
				System.out.println(this.names);
			}
		}
		
	}
	
	
}