package filmtar;

import java.util.ArrayList;

/** Az adatb�zis rendez�s�t �s ki�r�s�t oldja meg. A Command oszt�ly lesz�rmazottja.*/
public class List implements Command{
	
	/** Az objektum nev�t adja vissza.
	 * @return az objektum neve*/
	public String getName() { return "list"; }
	
	/** A parancs �ltal elv�gezend� feladatot hajtja v�gre.
	 * Ez a met�dus a param�terk�nt megadott list�t rendezi a megadott szempont alapj�n..
	 * @param cmd String t�mb ami a bemenetr�l bek�rt adatokat tartalmazza.
	 * @param l a lista amit ki kell �rni a kimenetre*/
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
					System.out.println(csaladi.get(i).getId() + ". C�m: " + csaladi.get(i).getTitle() + " | Hossz: " + csaladi.get(i).getLength() + "min | Kiad�s �ve: " + csaladi.get(i).getYear() + " | Korhat�r: " + csaladi.get(i).getAgeRestriction());
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
					System.out.println(doku.get(i).getId() + ". C�m: " + doku.get(i).getTitle() + " | Hossz: " + doku.get(i).getLength() + "min | Kiad�s �ve: " + doku.get(i).getYear() + " | Le�r�s: " + doku.get(i).getDescription());
				}
			}
			if(!cmd[1].equals("age") && !cmd[1].equals("desc") && !cmd[1].equals("name") && !cmd[1].equals("length") && !cmd[1].equals("year")) {
				System.err.println("Hib�s param�ter.");
			}
			else if(!cmd[1].equals("age") && !cmd[1].equals("desc")) {
				for(int i = 0; i<l.size(); i++) {
					if(l.get(i).getClass().toString().equals("class filmtar.Film")) {
						System.out.println(l.get(i).getId() + ". C�m: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiad�s �ve: " + l.get(i).getYear());
					}
					else if(l.get(i).getClass().toString().equals("class filmtar.Dokumentumfilm")) {
						System.out.println(l.get(i).getId() + ". C�m: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiad�s �ve: " + l.get(i).getYear() + " | Le�r�s: " + ((Dokumentumfilm)l.get(i)).getDescription());
					}
					else if(l.get(i).getClass().toString().equals("class filmtar.Csaladifilm")) {
						System.out.println(l.get(i).getId() + ". C�m: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiad�s �ve: " + l.get(i).getYear() + " | Korhat�r: " + ((Csaladifilm)l.get(i)).getAgeRestriction());
					}
				}
			}
		}
		if(cmd.length == 1) {
			for(int i = 0; i<l.size(); i++) {
				if(l.get(i).getClass().toString().equals("class filmtar.Film")) {
					System.out.println(l.get(i).getId() + ". C�m: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiad�s �ve: " + l.get(i).getYear());
				}
				else if(l.get(i).getClass().toString().equals("class filmtar.Dokumentumfilm")) {
					System.out.println(l.get(i).getId() + ". C�m: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiad�s �ve: " + l.get(i).getYear() + " | Le�r�s: " + ((Dokumentumfilm)l.get(i)).getDescription());
				}
				else if(l.get(i).getClass().toString().equals("class filmtar.Csaladifilm")) {
					System.out.println(l.get(i).getId() + ". C�m: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiad�s �ve: " + l.get(i).getYear() + " | Korhat�r: " + ((Csaladifilm)l.get(i)).getAgeRestriction());
				}
			}
		}
	}

}
