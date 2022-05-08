package filmtar;

public class Film extends Filmek{
	
	public Film(String t, int l, int y) {
		super(t,l,y);
	}
	
	public String toString() { return super.getTitle() + " " + super.getLength() + " " + super.getYear(); }
	
}
