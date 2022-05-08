package filmtar;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Save implements Command{
	public String getName() { return "save"; }
	public void action(String[] cmd, ArrayList<Filmek> l) {
		try {
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
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
