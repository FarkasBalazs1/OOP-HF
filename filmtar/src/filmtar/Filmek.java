package filmtar;

public abstract class Filmek {
	private String title;
	private int length;
	private int year;
	private static int idstat;
	private int id;
	
	public Filmek(String t, int l, int y) {
		title = t; length = l; year = y; id = idstat++;
	}
	
	public String getTitle() {return title; }
	public int getLength() { return length; }
	public int getYear() { return year; }
	public int getId() { return id; }
	public void setTitle(String s) { title = s; }
	public void setLength(int l) { length = l; }
	public void setYear(int y) { year = y; }
	public abstract String toString();
}
