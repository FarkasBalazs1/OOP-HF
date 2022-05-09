package filmtar;

import java.util.Comparator;

/** Comparator implement�ci�ja a Filmek t�pus� objektumok 
 * length attrib�tum�nak �sszehasonl�t�s�hoz.*/
public class LengthComparator implements Comparator<Filmek> {
	
	public int compare(Filmek f1, Filmek f2) {
		Integer l1 = f1.getLength();
		Integer l2 = f2.getLength();
		return l1.compareTo(l2);
	}
}
