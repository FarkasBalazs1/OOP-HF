package filmtar;

import java.util.Comparator;

public class AgeComparator implements Comparator<Filmek>{
	public int compare(Filmek f1, Filmek f2) {
		Integer a1 = ((Csaladifilm)f1).getAgeRestriction();
		Integer a2 = ((Csaladifilm)f2).getAgeRestriction();
		return a1.compareTo(a2);
	}

}
