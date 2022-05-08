package filmtar;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	
	public static void main(String[] args) {
		ArrayList<Filmek> movies = new ArrayList<Filmek>();
		ArrayList<Command> cmd = new ArrayList<Command>();
		cmd.add(new Add());
		cmd.add(new Save());
		cmd.add(new Load());
		cmd.add(new List());
		cmd.add(new Update());
		cmd.add(new Delete());
		cmd.add(new Search());
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			String data = sc.nextLine();
			String[] datasplit = data.split(" ");
			if(datasplit[0].equals("exit")) {
				break;
			}
			for(int i = 0; i<cmd.size(); i++) {
				if(cmd.get(i).getName().equals(datasplit[0])) {
					try {
						cmd.get(i).action(datasplit, movies);
					}
					catch(Exception e) {
						System.err.println(e.getMessage());
					}
				}
			}
			
		}
	}

}
