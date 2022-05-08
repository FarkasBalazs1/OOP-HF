package filmtar;

import java.util.ArrayList;
public class Add implements Command{
	
	public String getName() { return "add"; }
	
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
			throw new Exception("Hibás bemenet");
		}

	}

}
