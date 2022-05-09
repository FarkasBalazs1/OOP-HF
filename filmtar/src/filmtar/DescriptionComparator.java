package filmtar;

import java.util.Comparator;

/** Comparator implementációja a Dokumentumfilm típusú objektumok 
 * description attribútumának összehasonlításához.*/
public class DescriptionComparator implements Comparator<Dokumentumfilm>{
	
	public int compare(Dokumentumfilm f1, Dokumentumfilm f2) {
		String a1 = f1.getDescription();
		String a2 = f2.getDescription();
		return a1.compareTo(a2);
	}
}
