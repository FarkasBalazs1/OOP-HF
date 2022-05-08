package filmtar;

import java.util.Comparator;

public class LengthComparator implements Comparator<Filmek> {
	
	public int compare(Filmek f1, Filmek f2) {
		Integer l1 = f1.getLength();
		Integer l2 = f2.getLength();
		return l1.compareTo(l2);
	}
}
