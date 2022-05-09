package filmtar;

/** A Filmek osztály leszármazottja, A Dokumentumfilm típusú objektumokat tárolja.*/
public class Dokumentumfilm extends Filmek{
	
	private String description;
	
	/** A Dokumentumfilm osztály konstruktora, a megadott adatokból hozza létre az objektumot.
	 * @param t a film címe
	 * @param l a film hossza percben
	 * @param y a film kiadási éve
	 * @param d a film leírása*/
	public Dokumentumfilm(String t, int l, int y, String d) {
		super(t,l,y);
		description = d;
	}
	
	/** Visszaadja az objektum leírás attribútumát.
	 * @return a leírás Stringként.*/
	public String getDescription() { return description; }
	
	/** Az objektum leírás attribútumát írja felül.
	 * @param d az új leírás (String)*/
	public void setDescription(String d) { description = d; }
	
	/** Visszaadja az objektumot egy Stringként.
	 * @return az Objektum stringként.*/
	public String toString() { return super.getTitle() + " " + super.getLength() + " " + super.getYear() + " " + description; }
	
}
