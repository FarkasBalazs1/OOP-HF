package filmtar;

import java.util.Comparator;
/** Comparator implementációja a Filmek típusú objektumok 
 * title attribútumának összehasonlításához.*/
public class NameComparator implements Comparator<Filmek> {

	public int compare(Filmek f1, Filmek f2) {
		String n1 = f1.getTitle();
		String n2 = f2.getTitle();
		return n1.compareTo(n2);
	}

}
