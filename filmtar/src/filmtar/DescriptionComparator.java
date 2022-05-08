package filmtar;

import java.util.Comparator;

public class DescriptionComparator implements Comparator<Filmek>{
	public int compare(Filmek f1, Filmek f2) {
		String a1 = ((Dokumentumfilm)f1).getDescription();
		String a2 = ((Dokumentumfilm)f2).getDescription();
		return a1.compareTo(a2);
	}
}
