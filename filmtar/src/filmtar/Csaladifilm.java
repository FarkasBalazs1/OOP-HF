package filmtar;

/** A Filmek osztály leszármazottja, A Csaladifilm típusú objektumokat tárolja.*/
public class Csaladifilm extends Filmek{
	
	private int agerestriction;
	
	/** A Csaladifilm osztály konstruktora, a megadott adatokból hozza létre az objektumot.
	 * @param t a film címe
	 * @param l a film hossza percben
	 * @param y a film kiadási éve
	 * @param a a film korhatára*/
	public Csaladifilm(String t, int l, int y, int a) {
		super(t,l,y);
		agerestriction = a;
	}
	
	/** Visszaadja az objektum korhatár attribútumát.
	 * @return a korhatár int-ként.*/
	public int getAgeRestriction() { return agerestriction; }
	
	/** Az objektum korhatár attribútumát írja felül.
	 * @param a az új korhatár (int)*/
	public void setAgeRestriction(int a) { agerestriction = a; }
	
	/** Visszaadja az objektumot egy Stringként.
	 * @return az Objektum stringként.*/
	public String toString() { return super.getTitle() + " " + super.getLength() + " " + super.getYear() + " " + agerestriction; }
	
}
