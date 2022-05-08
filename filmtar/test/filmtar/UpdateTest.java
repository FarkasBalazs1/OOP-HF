package filmtar;

import static org.junit.Assert.*;

import java.util.ArrayList;


import org.junit.BeforeClass;
import org.junit.Test;

public class UpdateTest {
	static ArrayList<Filmek> l = new ArrayList<Filmek>();
	static ArrayList<Filmek> l2 = new ArrayList<Filmek>();
	static Filmek f1, f2, f3, f4, f5, f6;
	Command c = new Update();
	@BeforeClass
	public static void setUp() {
		f1 = new Film("F",110,2000);
		f2 = new Csaladifilm("CS", 140, 2000, 12);
		f3 = new Dokumentumfilm("D", 50, 2000, "test");
		f4 = new Film("F",110,2000);
		f5 = new Csaladifilm("CS", 140, 2000, 12);
		f6 = new Dokumentumfilm("D", 50, 2000, "test");
		l.add(f1);
		l.add(f2);
		l.add(f3);
		l2.add(f4);
		l2.add(f5);
		l2.add(f6);
	}

	@Test
	public void testAction() throws Exception{
		String a1 = "update 0 Film 120 2002";
		String a2 = "update 1 CS 140 2000 6";
		String a3 = "update 2 D 50 2000 changed";
		String[] s1 = a1.split(" ");
		String[] s2 = a2.split(" ");
		String[] s3 = a3.split(" ");
		c.action(s1, l);
		c.action(s2, l);
		c.action(s3, l);
		assertNotSame("Item 0",l.get(0),l2.get(0));
		assertNotSame("Item 1",l.get(1),l2.get(1));
		assertNotSame("Item 2",l.get(2),l2.get(2));
	}
	@Test
	public void testGetName() {
		assertEquals("update name", "update", c.getName());
	}

}
