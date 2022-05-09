package filmtar;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

<<<<<<< Updated upstream
public class FilmTest {
	Filmek f1;
	int testcount = 1;
=======
/**Film objektumok metódusainak tesztelésére szolgál.*/
public class FilmTest {
	Filmek f1;
	int testcount = 1;
	
	/**Teszt objektumok létrehozása*/
>>>>>>> Stashed changes
	@Before
	public void setUp() {
		f1 = new Film("Alma",150,2001);
		++testcount;
	}
<<<<<<< Updated upstream
=======
	
	/**getId() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testId() {	
		assertEquals("f1.id",testcount,f1.getId());
	}
<<<<<<< Updated upstream
=======
	
	/**getTitle() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testTitle() {
		assertEquals("f1.title","Alma",f1.getTitle());
	}
<<<<<<< Updated upstream
=======
	
	/**getLength() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testLength() {
		assertEquals("f1.length",150,f1.getLength());
	}
<<<<<<< Updated upstream
=======
	
	/**getYear() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testYear() {
		assertEquals("f1.year",2001,f1.getYear());
	}
<<<<<<< Updated upstream
=======
	
	/**setTitle() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testSetTitle() {
		f1.setTitle("aaa");
		assertEquals("f1.settitle","aaa",f1.getTitle());
	}
<<<<<<< Updated upstream
=======
	
	/**setLength() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testSetLength() {
		f1.setLength(200);
		assertEquals("f1.setlength",200,f1.getLength());
	}
<<<<<<< Updated upstream
=======
	
	/**setYear() metódus tesztelése.*/
>>>>>>> Stashed changes
	@Test
	public void testSetYear() {
		f1.setYear(2005);
		assertEquals("f1.setyear",2005,f1.getYear());
	}
}


