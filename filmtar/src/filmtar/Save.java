package filmtar;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/** A megadott f�jlba �rja be az adatokat a megadott list�b�l. A Command oszt�ly lesz�rmazottja.*/
public class Save implements Command{
	
	/** Az objektum nev�t adja vissza.
	 * @return az objektum neve*/
	public String getName() { return "save"; }
	
	/** A parancs �ltal elv�gezend� feladatot hajtja v�gre.
	 * Ez a met�dus a param�terk�nt megadott f�jlba �rja be az elemeket a megadott list�b�l.
	 * @param cmd String t�mb ami a bemenetr�l bek�rt adatokat tartalmazza.
	 * @param l a lista amib�l az adatokat ki kell �rni a f�jlba*/
	public void action(String[] cmd, ArrayList<Filmek> l) throws IOException{
		FileWriter fw = new FileWriter(cmd[1]);
		PrintWriter pw = new PrintWriter(fw);
		for (int i = 0; i < l.size(); i++) {
			if(l.get(i).getClass().toString().equals("class filmtar.Csaladifilm")) {
				pw.println("-c "+ l.get(i).toString());
			}
			else if(l.get(i).getClass().toString().equals("class filmtar.Dokumentumfilm")) {
				pw.println("-d "+ l.get(i).toString());
			}
			else if(l.get(i).getClass().toString().equals("class filmtar.Film")){
				pw.println(l.get(i).toString());
			}
		}
		pw.close();
		fw.close();
	}
}
