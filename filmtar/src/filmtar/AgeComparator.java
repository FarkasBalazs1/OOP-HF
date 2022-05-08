package filmtar;

import java.util.Comparator;

public class AgeComparator implements Comparator<Csaladifilm>{
	public int compare(Csaladifilm f1, Csaladifilm f2) {
		Integer a1 = f1.getAgeRestriction();
		Integer a2 = f2.getAgeRestriction();
		return a1.compareTo(a2);
	}

}
