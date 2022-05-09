package filmtar;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

<<<<<<< Updated upstream
=======
/**List osztály metódusainak tesztelésére szolgál*/
>>>>>>> Stashed changes
public class ListTest {
	static ArrayList<Filmek> l = new ArrayList<Filmek>();
	static ArrayList<Filmek> l2 = new ArrayList<Filmek>();
	static Filmek f1, f2, f3, f4, f5, f6;
	Command c = new List();
<<<<<<< Updated upstream
=======
	
	/**Tesztobjektumok létrehozása és lista feltöltése*/
>>>>>>> Stashed changes
	@BeforeClass
	public static void setUpBeforeClass() {
		f1 = new Film("F2",130,2010);
		f2 = new Csaladifilm("CS2", 140, 2005, 12);
		f3 = new Dokumentumfilm("D2", 50, 2003, "test2");
		f4 = new Film("F1",110,2000);
		f5 = new Csaladifilm("CS1", 180, 2004, 12);
		f6 = new Dokumentumfilm("D1", 55, 2006, "test1");
		l.add(f1);
		l.add(f2);
		l.add(f3);
		l.add(f4);
		l.add(f5);
		l.add(f6);
	}
<<<<<<< Updated upstream

=======
	
	/**Az action() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testAction() throws Exception{
		String a1 = "list";
		String a2 = "list name";
		String a3 = "list length";
		String a4 = "list year";
		String a5 = "list age";
		String a6 = "list desc";
		String[] s1 = a1.split(" ");
		String[] s2 = a2.split(" ");
		String[] s3 = a3.split(" ");
		String[] s4 = a4.split(" ");
		String[] s5 = a5.split(" ");
		String[] s6 = a6.split(" ");
		c.action(s1, l);
		System.out.println();
		c.action(s2, l);
		System.out.println();
		c.action(s3, l);
		System.out.println();
		c.action(s4, l);
		System.out.println();
		c.action(s5, l);
		System.out.println();
		c.action(s6, l);
	}
<<<<<<< Updated upstream
=======
	
	/**A getName() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testGetName() {
		assertEquals("list name","list",c.getName());
	}

}
