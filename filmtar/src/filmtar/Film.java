package filmtar;

/** A Filmek oszt�ly lesz�rmazottja, A Film t�pus� objektumokat t�rolja.*/
public class Film extends Filmek{
	
	/** A Film oszt�ly konstruktora, a megadott adatokb�l hozza l�tre az objektumot.
	 * @param t a film c�me
	 * @param l a film hossza percben
	 * @param y a film kiad�si �ve*/
	public Film(String t, int l, int y) {
		super(t,l,y);
	}
	
	/** Visszaadja az objektumot egy Stringk�nt.
	 * @return az Objektum stringk�nt.*/
	public String toString() { return super.getTitle() + " " + super.getLength() + " " + super.getYear(); }
	
}
