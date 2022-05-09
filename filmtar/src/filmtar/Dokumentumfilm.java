package filmtar;

/** A Filmek oszt�ly lesz�rmazottja, A Dokumentumfilm t�pus� objektumokat t�rolja.*/
public class Dokumentumfilm extends Filmek{
	
	private String description;
	
	/** A Dokumentumfilm oszt�ly konstruktora, a megadott adatokb�l hozza l�tre az objektumot.
	 * @param t a film c�me
	 * @param l a film hossza percben
	 * @param y a film kiad�si �ve
	 * @param d a film le�r�sa*/
	public Dokumentumfilm(String t, int l, int y, String d) {
		super(t,l,y);
		description = d;
	}
	
	/** Visszaadja az objektum le�r�s attrib�tum�t.
	 * @return a le�r�s Stringk�nt.*/
	public String getDescription() { return description; }
	
	/** Az objektum le�r�s attrib�tum�t �rja fel�l.
	 * @param d az �j le�r�s (String)*/
	public void setDescription(String d) { description = d; }
	
	/** Visszaadja az objektumot egy Stringk�nt.
	 * @return az Objektum stringk�nt.*/
	public String toString() { return super.getTitle() + " " + super.getLength() + " " + super.getYear() + " " + description; }
	
}
