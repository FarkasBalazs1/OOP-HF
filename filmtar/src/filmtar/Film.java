package filmtar;

public class Film extends Filmek{
	
	public Film(String t, int l, int y) {
		super(t,l,y);
	}
	
	/*public String getTitle() {return super.getTitle(); }
	public int getLength() { return super.getLength(); }
	public int getYear() { return super.getYear(); }
	public int getId() { return super.getId(); }
	public String toString() { return super.toString(); }*/
	public String toString() { return super.getTitle() + " " + super.getLength() + " " + super.getYear(); }
	
}
