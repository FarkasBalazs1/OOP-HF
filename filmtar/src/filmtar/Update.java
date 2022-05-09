package filmtar;

import java.util.ArrayList;

/** A lista  megadott elem�nek m�dos�t�s�t megval�s�t� oszt�ly. A Command oszt�ly lesz�rmazottja.*/
public class Update implements Command{
	
	/** Stringk�nt visszaadja a parancs nev�t.
	 * @return a parancs neve
	 */
	public String getName() { return "update"; }
	
	/** A parancs �ltal elv�gezend� feladatot hajtja v�gre.
	 * Ez a met�dus a param�terk�nt megadott list�b�l keresi ki a bemeneten bek�rt indexet �s amennyiben l�tezik m�dos�tja azt a megadott �rt�kekkel.
	 * Ha az elem nem l�tezik azt hiba�zenetk�nt a program ki�rja a kimenetre.
	 * Az objektum t�pusa f�gg a megadott adatok t�pus�t�l.
	 * @param cmd String t�mb ami a bemenetr�l bek�rt adatokat tartalmazza.
	 * @param l A lista amiben a m�dos�tani k�v�nt elem tal�lhat�.*/
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
			System.err.println("A megadott index nem l�tezik.");
		}
	}

}
