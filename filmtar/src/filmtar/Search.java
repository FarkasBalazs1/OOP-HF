package filmtar;

import java.util.ArrayList;

public class Search implements Command{
	public String getName() { return "search"; }
	public void action(String[] cmd, ArrayList<Filmek> l) {
		boolean exists = false;
		for(int i = 0; i< l.size(); i++) {
			if((cmd[1].equals("name") && (l.get(i).getTitle()).toLowerCase().contains(cmd[2])) || (cmd[1].equals("length") && Integer.valueOf(cmd[2]).equals(l.get(i).getLength())) || (cmd[1].equals("year") && Integer.valueOf(cmd[2]).equals(l.get(i).getYear()))) {
				exists = true;
				if(l.get(i).getClass().toString().equals("class filmtar.Film")) {
					System.out.println(l.get(i).getId() + ". Cím: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiadás éve: " + l.get(i).getYear());
				}
				else if(l.get(i).getClass().toString().equals("class filmtar.Dokumentumfilm")) {
					System.out.println(l.get(i).getId() + ". Cím: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiadás éve: " + l.get(i).getYear() + " | Leírás: " + ((Dokumentumfilm)l.get(i)).getDescription());
				}
				else if(l.get(i).getClass().toString().equals("class filmtar.Csaladifilm")) {
					System.out.println(l.get(i).getId() + ". Cím: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiadás éve: " + l.get(i).getYear() + " | Korhatár: " + ((Csaladifilm)l.get(i)).getAgeRestriction());
				}
			}
			
			if(cmd[1].equals("age") && l.get(i).getClass().toString().equals("class filmtar.Csaladifilm") && Integer.valueOf(cmd[2]).equals(((Csaladifilm)l.get(i)).getAgeRestriction())) {
				exists = true;
				System.out.println(l.get(i).getId() + ". Cím: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiadás éve: " + l.get(i).getYear() + " | Korhatár: " + ((Csaladifilm)l.get(i)).getAgeRestriction());
			}
			if(cmd[1].equals("desc") && l.get(i).getClass().toString().equals("class filmtar.Dokumentumfilm") && (((Dokumentumfilm)l.get(i)).getDescription()).toLowerCase().contains(cmd[2])) {
				exists = true;
				System.out.println(l.get(i).getId() + ". Cím: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiadás éve: " + l.get(i).getYear() + " | Leírás: " + ((Dokumentumfilm)l.get(i)).getDescription());
			}
		}
		if(!exists) {
			System.err.println("A keresett elem nem létezik.");
		}
	}

}
