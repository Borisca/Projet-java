package calculat;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestCalculatrice {

	@BeforeClass
	// LANCER AU DEBUT UNE FOIS
	
	
	@After
	//LANCER A LA FIN DES CHAQUE TEST
	
	@Before
	public void init() {
		System.out.println("dans init");
	}
	
	
	@Test
	public void testAdd() {
		Calculatrice calc = new Calculatrice();
		int result =calc.add(20, 30);
		Assert.assertEquals(50, result);
	}
	
}
