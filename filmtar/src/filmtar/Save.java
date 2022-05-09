package filmtar;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/** A megadott fájlba írja be az adatokat a megadott listából. A Command osztály leszármazottja.*/
public class Save implements Command{
	
	/** Az objektum nevét adja vissza.
	 * @return az objektum neve*/
	public String getName() { return "save"; }
	
	/** A parancs által elvégezendõ feladatot hajtja végre.
	 * Ez a metódus a paraméterként megadott fájlba írja be az elemeket a megadott listából.
	 * @param cmd String tömb ami a bemenetrõl bekért adatokat tartalmazza.
	 * @param l a lista amibõl az adatokat ki kell írni a fájlba*/
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
