package filmtar;

/** A Filmek osztály leszármazottja, A Film típusú objektumokat tárolja.*/
public class Film extends Filmek{
	
	/** A Film osztály konstruktora, a megadott adatokból hozza létre az objektumot.
	 * @param t a film címe
	 * @param l a film hossza percben
	 * @param y a film kiadási éve*/
	public Film(String t, int l, int y) {
		super(t,l,y);
	}
	
	/** Visszaadja az objektumot egy Stringként.
	 * @return az Objektum stringként.*/
	public String toString() { return super.getTitle() + " " + super.getLength() + " " + super.getYear(); }
	
}
