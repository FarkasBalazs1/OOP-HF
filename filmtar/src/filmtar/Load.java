package filmtar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/** A megadott f�jlb�l olvassa be az adatokat a megadott list�ba. A Command oszt�ly lesz�rmazottja.*/
public class Load implements Command{
	
	/** Az objektum nev�t adja vissza.
	 * @return az objektum neve*/
	public String getName() { return "load"; }
	
	/** A parancs �ltal elv�gezend� feladatot hajtja v�gre.
	 * Ez a met�dus a param�terk�nt megadott f�jlb�l olvassa be az elemeket a megadott list�ba, �res sorig.
	 * Amennyiben a megadott f�jl nem l�tezik, vagy a f�jlban tal�lhat� elemek form�tuma hib�s a program ezt a hibakimeneten jelzi.
	 * @param cmd String t�mb ami a bemenetr�l bek�rt adatokat tartalmazza.
	 * @param l a lista amihez az adatokat kell hozz�adni*/
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
			throw new IOException("A megadott f�jl nem l�tezik.");
		}
		catch(Exception e){
			throw new Exception("A f�jlban tal�lhat� elemek form�tuma hib�s.");
		}
	}
}

