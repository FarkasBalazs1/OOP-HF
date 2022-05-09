package filmtar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/** A megadott fájlból olvassa be az adatokat a megadott listába. A Command osztály leszármazottja.*/
public class Load implements Command{
	
	/** Az objektum nevét adja vissza.
	 * @return az objektum neve*/
	public String getName() { return "load"; }
	
	/** A parancs által elvégezendõ feladatot hajtja végre.
	 * Ez a metódus a paraméterként megadott fájlból olvassa be az elemeket a megadott listába, üres sorig.
	 * Amennyiben a megadott fájl nem létezik, vagy a fájlban található elemek formátuma hibás a program ezt a hibakimeneten jelzi.
	 * @param cmd String tömb ami a bemenetrõl bekért adatokat tartalmazza.
	 * @param l a lista amihez az adatokat kell hozzáadni*/
	public void action(String[] cmd, ArrayList<Filmek> l) throws Exception, IOException{
		try {
		FileReader fr = new FileReader(cmd[1]);
		BufferedReader br = new BufferedReader(fr);
		while (true) {
			String line = br.readLine();
			if (line == null) break;
			String[] linesplit = line.split(" ");
			if(linesplit[0].equals("-c")) {
				l.add(new Csaladifilm(linesplit[1],Integer.valueOf(linesplit[2]),Integer.valueOf(linesplit[3]),Integer.valueOf(linesplit[4])));				}
			else if(linesplit[0].equals("-d")) {
				l.add(new Dokumentumfilm(linesplit[1],Integer.valueOf(linesplit[2]),Integer.valueOf(linesplit[3]),linesplit[4]));
			}
			else {
				l.add(new Film(linesplit[0],Integer.valueOf(linesplit[1]),Integer.valueOf(linesplit[2])));
			}
		}
		br.close();
		fr.close();
		}
		catch(IOException e){
			throw new IOException("A megadott fájl nem létezik.");
		}
		catch(Exception e){
			throw new Exception("A fájlban található elemek formátuma hibás.");
		}
	}
}

