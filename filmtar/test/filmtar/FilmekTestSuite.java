package filmtar;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**A Filmek típusú objektumok test suite-ja.*/
@RunWith (Suite.class)
@Suite.SuiteClasses ({
	FilmTest.class,
	DokumentumTest.class,
	CsaladiTest.class
})
public class FilmekTestSuite {

}
