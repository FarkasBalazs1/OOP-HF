package filmtar;

/** A Dokumentumfilm, Film és Családifilm objektumok absztrakt õsosztálya.
 * Ez tartalmazza az attribútumokat és metódusokat amikkel az összes leszármazott rendelkezik*/
public abstract class Filmek {
	private String title;
	private int length;
	private int year;
	private static int idstat;
	private int id;
	
	/** A Filmek osztály konstruktora, a megadott adatokból hozza létre az objektumot.
	 * Ezt öröklik a leszármazott osztályok.
	 * Az id-hez a statikus számlálót használja fel a program.
	 * @param t a film címe
	 * @param l a film hossza percben
	 * @param y a film kiadási éve*/
	public Filmek(String t, int l, int y) {
		title = t; length = l; year = y; id = idstat++;
	}
	
	/** Visszaadja a film címét.
	 * @return a film címe. (String)*/
	public String getTitle() {return title; }
	
	/**Visszaadja a film hosszát percben.
	 * @return a film hossza percben.(int)*/
	public int getLength() { return length; }
	
	/**Visszaadja a film kiadási évét.
	 * @return a film kiadási éve. (int)*/
	public int getYear() { return year; }
	
	/**Visszaadja az objektum azonosítóját.
	 * @return az objektum azonosítója*/
	public int getId() { return id; }
	
	/** Az objektum cím attribútumát írja felül.
	 * @param a az új cím (String)*/
	public void setTitle(String s) { title = s; }
	
	/** Az objektum hossz attribútumát írja felül.
	 * @param a az új hossz (int)*/
	public void setLength(int l) { length = l; }
	
	/** Az objektum kiadási év attribútumát írja felül.
	 * @param a az új kiadási év (int)*/
	public void setYear(int y) { year = y; }
	
	/** A beépített toString metódust írja felül, az implementációt a leszármazottak oldják meg.*/
	public abstract String toString();
}
