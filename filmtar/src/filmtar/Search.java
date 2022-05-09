package filmtar;

import java.util.ArrayList;

/** Az adatb�zisban val� keres�st val�s�tja meg meg. A Command oszt�ly lesz�rmazottja.*/
public class Search implements Command{
	
	/** Az objektum nev�t adja vissza.
	 * @return az objektum neve*/
	public String getName() { return "search"; }
	
	/** A parancs �ltal elv�gezend� feladatot hajtja v�gre.
	 * Ez a met�dus a param�terk�nt megadott list�b�l keresi ki a param�terk�nt megadott adatot.
	 * T�bb tal�lat eset�n az �sszeset ki�rja, nulla tal�lat eset�n pedig hiba�zenetk�nt �rtes�ti a felhaszn�l�t.
	 * A name �s a desc attrib�tumokra val� keres�sn�l a program r�szleges egyez�st keres, a kis �s nagy bet�k nem sz�m�tanak.
	 * A length, year �s age attrib�tumokn�l pontos egyez�s eset�n �rja ki az elemet.
	 * @param cmd a String t�mb ami a bemenetr�l bek�rt adatokat tartalmazza.
	 * @param l a lista amiben a keres�st el kell v�gezni*/
	public void action(String[] cmd, ArrayList<Filmek> l) {
		boolean exists = false;
		for(int i = 0; i< l.size(); i++) {
			if((cmd[1].equals("name") && (l.get(i).getTitle()).toLowerCase().contains(cmd[2])) || (cmd[1].equals("length") && Integer.valueOf(cmd[2]).equals(l.get(i).getLength())) || (cmd[1].equals("year") && Integer.valueOf(cmd[2]).equals(l.get(i).getYear()))) {
				exists = true;
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
			
			if(cmd[1].equals("age") && l.get(i).getClass().toString().equals("class filmtar.Csaladifilm") && Integer.valueOf(cmd[2]).equals(((Csaladifilm)l.get(i)).getAgeRestriction())) {
				exists = true;
				System.out.println(l.get(i).getId() + ". C�m: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiad�s �ve: " + l.get(i).getYear() + " | Korhat�r: " + ((Csaladifilm)l.get(i)).getAgeRestriction());
			}
			if(cmd[1].equals("desc") && l.get(i).getClass().toString().equals("class filmtar.Dokumentumfilm") && (((Dokumentumfilm)l.get(i)).getDescription()).toLowerCase().contains(cmd[2])) {
				exists = true;
				System.out.println(l.get(i).getId() + ". C�m: " + l.get(i).getTitle() + " | Hossz: " + l.get(i).getLength() + "min | Kiad�s �ve: " + l.get(i).getYear() + " | Le�r�s: " + ((Dokumentumfilm)l.get(i)).getDescription());
			}
		}
		if(!exists) {
			System.err.println("A keresett elem nem l�tezik.");
		}
	}

}
