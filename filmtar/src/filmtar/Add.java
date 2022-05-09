package filmtar;

import java.util.ArrayList;

/** Az elemek list�hoz val� hozz�ad�s�t megval�s�t� oszt�ly. A Command oszt�ly lesz�rmazottja.*/
public class Add implements Command{
	
	/** Stringk�nt visszaadja a parancs nev�t.
	 * @return a parancs neve
	 */
	public String getName() { return "add"; }
	
	/** A parancs �ltal elv�gezend� feladatot hajtja v�gre.
	 * Ez a met�dus a param�terk�nt megadott list�hoz adja hozz� a bemeneten bek�rt elemet.
	 * Az objektum t�pusa f�gg a megadott adatok t�pus�t�l.
	 * @param cmd String t�mb ami a bemenetr�l bek�rt adatokat tartalmazza
	 * @param l A lista amihez hozz� k�v�njuk adni az elemet.*/
	public void action(String[] cmd, ArrayList<Filmek> l) throws Exception{
		try {
			if(cmd[1].equals("-c")) {
				l.add(new Csaladifilm(cmd[2],Integer.valueOf(cmd[3]),Integer.valueOf(cmd[4]),Integer.valueOf(cmd[5])));
			}
			else if(cmd[1].equals("-d")) {
				l.add(new Dokumentumfilm(cmd[2],Integer.valueOf(cmd[3]),Integer.valueOf(cmd[4]),cmd[5]));
			}
			else {
				l.add(new Film(cmd[1],Integer.valueOf(cmd[2]),Integer.valueOf(cmd[3])));
			}
		}
		catch(Exception e) {
			throw new Exception("Hib�s bemenet");
		}

	}

}
