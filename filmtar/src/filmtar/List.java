package filmtar;

import java.util.ArrayList;

/** Az adatbázis rendezését és kiírását oldja meg. A Command osztály leszármazottja.*/
public class List implements Command{
	
	/** Az objektum nevét adja vissza.
	 * @return az objektum neve*/
	public String getName() { return "list"; }
	
	/** A parancs által elvégezendõ feladatot hajtja végre.
	 * Ez a metódus a paraméterként megadott listát rendezi a megadott szempont alapján..
	 * @param cmd String tömb ami a bemenetrõl bekért adatokat tartalmazza.
	 * @param l a lista amit ki kell írni a kimenetre*/
	public void action(String[] cmd, ArrayList<Filmek> l) {
		if(cmd.length == 2) {
			if(cmd[1].equals("name")) {
				l.sort(new NameComparator());
			}
			else if(cmd[1].equals("length")) {
				l.sort(new LengthComparator());
			}
			else if(cmd[1].equals("year")) {
				l.sort(new YearComparator());
			}
			else if(cmd[1].equals("age")) {
				ArrayList<Csaladifilm> csaladi = new ArrayList<Csaladifilm>();
				for(int i = 0; i<l.size();i++) {
					if(l.get(i).getClass().toString().equals("class filmtar.Csaladifilm")) {
						csaladi.add((Csaladifilm)l.get(i));
					}
				}
				csaladi.sort(new AgeComparator());
				for(int i = 0; i< csaladi.size();i++) {
					System.out.println(csaladi.get(i).getId() + ". Cím: " + csaladi.get(i).getTitle() + " | Hossz: " + csaladi.get(i).getLength() + "min | Kiadás éve: " + csaladi.get(i).getYear() + " | Korhatár: " + csaladi.get(i).getAgeRestriction());
				}
			}
			else if(cmd[1].equals("desc")) {
				ArrayList<Dokumentumfilm> doku = new ArrayList<Dokumentumfilm>();
				for(int i = 0; i<l.size();i++) {
					if(l.get(i).getClass().toString().equals("class filmtar.Dokumentumfilm")) {
						doku.add((Dokumentumfilm)l.get(i));
					}
				}
				doku.sort(new DescriptionComparator());
				for(int i = 0; i< doku.size();i++) {
					System.out.println(doku.get(i).getId() + ". Cím: " + doku.get(i).getTitle() + " | Hossz: " + doku.get(i).getLength() + "min | Kiadás éve: " + doku.get(i).getYear() + " | Leírás: " + doku.get(i).getDescription());
				}
			}
			if(!cmd[1].equals("age") && !cmd[1].equals("desc") && !cmd[1].equals("name") && !cmd[1].equals("length") && !cmd[1].equals("year")) {
				System.err.println("Hibás paraméter.");
			}
			else if(!cmd[1].equals("age") && !cmd[1].equals("desc")) {
				for(int i = 0; i<l.size(); i++) {
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
			}
		}
		if(cmd.length == 1) {
			for(int i = 0; i<l.size(); i++) {
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
		}
	}

}
