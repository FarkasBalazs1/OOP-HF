package filmtar;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class AddTest {
	ArrayList<Filmek> l = new ArrayList<Filmek>();
	ArrayList<Filmek> l2 = new ArrayList<Filmek>();
	Filmek f1, f2, f3;
	Command c = new Add();
	@Before
	public void setUp() {
		f1 = new Film("F",110,2000);
		f2 = new Csaladifilm("CS", 140, 2000, 12);
		f3 = new Dokumentumfilm("D", 50, 2000, "test");
		l2.add(f1);
		l2.add(f2);
		l2.add(f3);
	}

	@Test
	public void testName() {
		assertEquals("Add.name","add", c.getName());
	}
	@Test
	public void testAction() throws Exception {
		String a1 = "add " + f1.toString();
		String a2 = "add -c " + f2.toString();
		String a3 = "add -d " + f3.toString();
		String[] s1 = a1.split(" ");
		String[] s2 = a2.split(" ");
		String[] s3 = a3.split(" ");
		c.action(s1, l);
		c.action(s2, l);
		c.action(s3, l);
		assertEquals("Item 0",l.get(0).toString(),l2.get(0).toString());
		assertEquals("Item 1",l.get(1).toString(),l2.get(1).toString());
		assertEquals("Item 2",l.get(2).toString(),l2.get(2).toString());
	}

}
