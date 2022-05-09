package filmtar;

import java.util.Comparator;
/** Comparator implement�ci�ja a Filmek t�pus� objektumok 
 * title attrib�tum�nak �sszehasonl�t�s�hoz.*/
public class NameComparator implements Comparator<Filmek> {

	public int compare(Filmek f1, Filmek f2) {
		String n1 = f1.getTitle();
		String n2 = f2.getTitle();
		return n1.compareTo(n2);
	}

}
