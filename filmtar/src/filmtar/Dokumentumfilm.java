package filmtar;

public class Dokumentumfilm extends Filmek{
	private String description;
	public Dokumentumfilm(String t, int l, int y, String d) {
		super(t,l,y);
		description = d;
	}
	
	/*public String getTitle() {return super.getTitle(); }
	public int getLength() { return super.getLength(); }
	public int getYear() { return super.getYear(); }
	public int getId() { return super.getId(); }
	//public String toString() { return super.toString(); }*/
	public String getDescription() { return description; }
	public void setDescription(String d) { description = d; }
	public String toString() { return super.getTitle() + " " + super.getLength() + " " + super.getYear() + " " + description; }
	
}
