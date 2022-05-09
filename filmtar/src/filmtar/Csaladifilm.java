package filmtar;

/** A Filmek oszt�ly lesz�rmazottja, A Csaladifilm t�pus� objektumokat t�rolja.*/
public class Csaladifilm extends Filmek{
	
	private int agerestriction;
	
	/** A Csaladifilm oszt�ly konstruktora, a megadott adatokb�l hozza l�tre az objektumot.
	 * @param t a film c�me
	 * @param l a film hossza percben
	 * @param y a film kiad�si �ve
	 * @param a a film korhat�ra*/
	public Csaladifilm(String t, int l, int y, int a) {
		super(t,l,y);
		agerestriction = a;
	}
	
	/** Visszaadja az objektum korhat�r attrib�tum�t.
	 * @return a korhat�r int-k�nt.*/
	public int getAgeRestriction() { return agerestriction; }
	
	/** Az objektum korhat�r attrib�tum�t �rja fel�l.
	 * @param a az �j korhat�r (int)*/
	public void setAgeRestriction(int a) { agerestriction = a; }
	
	/** Visszaadja az objektumot egy Stringk�nt.
	 * @return az Objektum stringk�nt.*/
	public String toString() { return super.getTitle() + " " + super.getLength() + " " + super.getYear() + " " + agerestriction; }
	
}
