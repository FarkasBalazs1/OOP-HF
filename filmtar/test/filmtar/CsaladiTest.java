package filmtar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

<<<<<<< Updated upstream
public class CsaladiTest {
	Csaladifilm f1, f2;
=======
/**Csaladifilm objektumok met�dusainak tesztel�s�re szolg�l.*/
public class CsaladiTest {
	Csaladifilm f1, f2;
	
	/**Teszt objektumok l�trehoz�sa*/
>>>>>>> Stashed changes
	@Before
	public void setUp() {
		f1 = new Csaladifilm("Film1",120,2002,12);
		f2 = new Csaladifilm("Film1",120,2002,12);
	}
<<<<<<< Updated upstream
=======
	
	/**getAgerestriction() met�dus tesztel�se.*/
>>>>>>> Stashed changes
	@Test
	public void testAgeRestriction() {
		assertEquals("Film1.age",12,f1.getAgeRestriction());
	}
<<<<<<< Updated upstream
=======
	
	/**setAgerestriction() met�dus tesztel�se.*/
>>>>>>> Stashed changes
	@Test
	public void testSetAgeRestriction() {
		f2.setAgeRestriction(6);
		assertNotSame("agerestriction change",f1.getAgeRestriction(),f2.getAgeRestriction());
	}

}
