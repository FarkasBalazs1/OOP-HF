package filmtar;

import java.util.ArrayList;

/** A lista  megadott elemének módosítását megvalósító osztály. A Command osztály leszármazottja.*/
public class Update implements Command{
	
	/** Stringként visszaadja a parancs nevét.
	 * @return a parancs neve
	 */
	public String getName() { return "update"; }
	
	/** A parancs által elvégezendõ feladatot hajtja végre.
	 * Ez a metódus a paraméterként megadott listából keresi ki a bemeneten bekért indexet és amennyiben létezik módosítja azt a megadott értékekkel.
	 * Ha az elem nem létezik azt hibaüzenetként a program kiírja a kimenetre.
	 * Az objektum típusa függ a megadott adatok típusától.
	 * @param cmd String tömb ami a bemenetrõl bekért adatokat tartalmazza.
	 * @param l A lista amiben a módosítani kívánt elem található.*/
	public void action(String[] cmd, ArrayList<Filmek> l) {
		boolean exists = false;
		for(int i = 0; i< l.size(); i++) {
			if(l.get(i).getId() == Integer.valueOf(cmd[1])) {
				exists = true;
				l.get(i).setTitle(cmd[2]);
				l.get(i).setLength(Integer.valueOf(cmd[3]));
				l.get(i).setYear(Integer.valueOf(cmd[4]));
				if(l.get(i).getClass().toString().equals("class filmtar.Csaladifilm")) {
					Csaladifilm f = (Csaladifilm)l.get(i);
					f.setAgeRestriction(Integer.valueOf(cmd[5]));
					l.set(i, f);
				}
				else if(l.get(i).getClass().toString().equals("class filmtar.Dokumentumfilm")) {
					Dokumentumfilm f = (Dokumentumfilm)l.get(i);
					f.setDescription(cmd[5]);
					l.set(i, f);
				}
			}
		}
		if(!exists) {
			System.err.println("A megadott index nem létezik.");
		}
	}

}
