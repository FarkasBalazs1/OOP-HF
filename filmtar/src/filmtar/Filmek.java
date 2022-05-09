package filmtar;

/** A Dokumentumfilm, Film �s Csal�difilm objektumok absztrakt �soszt�lya.
 * Ez tartalmazza az attrib�tumokat �s met�dusokat amikkel az �sszes lesz�rmazott rendelkezik*/
public abstract class Filmek {
	private String title;
	private int length;
	private int year;
	private static int idstat;
	private int id;
	
	/** A Filmek oszt�ly konstruktora, a megadott adatokb�l hozza l�tre az objektumot.
	 * Ezt �r�klik a lesz�rmazott oszt�lyok.
	 * Az id-hez a statikus sz�ml�l�t haszn�lja fel a program.
	 * @param t a film c�me
	 * @param l a film hossza percben
	 * @param y a film kiad�si �ve*/
	public Filmek(String t, int l, int y) {
		title = t; length = l; year = y; id = idstat++;
	}
	
	/** Visszaadja a film c�m�t.
	 * @return a film c�me. (String)*/
	public String getTitle() {return title; }
	
	/**Visszaadja a film hossz�t percben.
	 * @return a film hossza percben.(int)*/
	public int getLength() { return length; }
	
	/**Visszaadja a film kiad�si �v�t.
	 * @return a film kiad�si �ve. (int)*/
	public int getYear() { return year; }
	
	/**Visszaadja az objektum azonos�t�j�t.
	 * @return az objektum azonos�t�ja*/
	public int getId() { return id; }
	
	/** Az objektum c�m attrib�tum�t �rja fel�l.
	 * @param a az �j c�m (String)*/
	public void setTitle(String s) { title = s; }
	
	/** Az objektum hossz attrib�tum�t �rja fel�l.
	 * @param a az �j hossz (int)*/
	public void setLength(int l) { length = l; }
	
	/** Az objektum kiad�si �v attrib�tum�t �rja fel�l.
	 * @param a az �j kiad�si �v (int)*/
	public void setYear(int y) { year = y; }
	
	/** A be�p�tett toString met�dust �rja fel�l, az implement�ci�t a lesz�rmazottak oldj�k meg.*/
	public abstract String toString();
}
