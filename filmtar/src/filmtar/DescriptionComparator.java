package filmtar;

import java.util.Comparator;

/** Comparator implement�ci�ja a Dokumentumfilm t�pus� objektumok 
 * description attrib�tum�nak �sszehasonl�t�s�hoz.*/
public class DescriptionComparator implements Comparator<Dokumentumfilm>{
	
	public int compare(Dokumentumfilm f1, Dokumentumfilm f2) {
		String a1 = f1.getDescription();
		String a2 = f2.getDescription();
		return a1.compareTo(a2);
	}
}
