package filmtar;

import java.util.ArrayList;

public class Delete implements Command{
	public String getName() { return "delete"; }
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
