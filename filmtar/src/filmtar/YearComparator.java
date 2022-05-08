package filmtar;

import java.util.Comparator;

public class YearComparator implements Comparator<Filmek> {

	public int compare(Filmek f1, Filmek f2) {
		Integer y1 = f1.getYear();
		Integer y2 = f2.getYear();
		return y1.compareTo(y2);
	}
}
