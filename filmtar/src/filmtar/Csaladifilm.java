package filmtar;

public class Csaladifilm extends Filmek{
	private int agerestriction;
	public Csaladifilm(String t, int l, int y, int a) {
		super(t,l,y);
		agerestriction = a;
	}
	
	public int getAgeRestriction() { return agerestriction; }
	public void setAgeRestriction(int a) { agerestriction = a; }
	public String toString() { return super.getTitle() + " " + super.getLength() + " " + super.getYear() + " " + agerestriction; }
	
}
