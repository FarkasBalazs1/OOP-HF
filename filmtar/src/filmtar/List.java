package filmtar;

import java.util.ArrayList;

public class List implements Command{
	public String getName() { return "list"; }
	public void action(String[] cmd, ArrayList<Filmek> l) {
		for(int i = 0; i<l.size(); i++) {
			if(l.get(i).getClass().toString().equals("class filmtar.Film")) {
				System.out.println("Cím: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiadás éve: " + l.get(i).getYear());
			}
			else if(l.get(i).getClass().toString().equals("class filmtar.Dokumentumfilm")) {
				System.out.println("Cím: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiadás éve: " + l.get(i).getYear() + " | Leírás: " + ((Dokumentumfilm)l.get(i)).getDescription());
			}
			else if(l.get(i).getClass().toString().equals("class filmtar.Csaladifilm")) {
				System.out.println("Cím: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiadás éve: " + l.get(i).getYear() + " | K: " + ((Csaladifilm)l.get(i)).getAgeRestriction());
			}
		}
	}

}
