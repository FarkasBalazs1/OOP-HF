package filmtar;

import java.util.ArrayList;

/** A megadott list�b�l val� t�rl�st val�s�tja meg. A Command oszt�ly lesz�rmazottja.*/
public class Delete implements Command{
	
	/** Az objektum nev�t adja vissza.
	 * @return az objektum neve*/
	public String getName() { return "delete"; }
	
	/** A parancs �ltal elv�gezend� feladatot hajtja v�gre.
	 * Ez a met�dus a param�terk�nt megadott list�b�l t�rli a bemeneten bek�rt elemet.
	 * Amennyiben a megadott elem nem l�tezik a program ezt a hibakimeneten jelzi.
	 * @param cmd String t�mb ami a bemenetr�l bek�rt adatokat tartalmazza.
	 * @param l a lista amiben a t�r�lni k�v�nt elem tal�lhat�*/
	public void action(String[] cmd, ArrayList<Filmek> l) {
		boolean done = false;
		for(int i = 0; i< l.size(); i++) {
			if(l.get(i).getId() == Integer.valueOf(cmd[1])) {
				l.remove(i);
				done = true;
			}
		}
		if(!done) {
			System.err.println("A megadott index nem l�tezik.");
		}
	}
}
