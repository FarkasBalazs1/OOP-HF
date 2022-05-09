package filmtar;

import java.util.ArrayList;

/** A megadott listából való törlést valósítja meg. A Command osztály leszármazottja.*/
public class Delete implements Command{
	
	/** Az objektum nevét adja vissza.
	 * @return az objektum neve*/
	public String getName() { return "delete"; }
	
	/** A parancs által elvégezendõ feladatot hajtja végre.
	 * Ez a metódus a paraméterként megadott listából törli a bemeneten bekért elemet.
	 * Amennyiben a megadott elem nem létezik a program ezt a hibakimeneten jelzi.
	 * @param cmd String tömb ami a bemenetrõl bekért adatokat tartalmazza.
	 * @param l a lista amiben a törölni kívánt elem található*/
	public void action(String[] cmd, ArrayList<Filmek> l) {
		boolean done = false;
		for(int i = 0; i< l.size(); i++) {
			if(l.get(i).getId() == Integer.valueOf(cmd[1])) {
				l.remove(i);
				done = true;
			}
		}
		if(!done) {
			System.err.println("A megadott index nem létezik.");
		}
	}
}
