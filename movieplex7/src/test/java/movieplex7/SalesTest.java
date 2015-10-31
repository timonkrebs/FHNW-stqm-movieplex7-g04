package movieplex7;

import static org.junit.Assert.*;

import org.javaee7.movieplex7.entities.Sales;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SalesTest {
	Sales sales;
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Before
	public void setUp() throws Exception {
		sales = new Sales(0);
	}
	
	@Test
	public void testCreationOfSameIndex() {
		exception.expect(IndexOutOfBoundsException.class);
		new Sales(-1);
	}
	
	@Test
	public void testAmount() {
		double amount = 40;
		sales.setAmount(amount);
		assertEquals(amount, sales.getAmount(),0.001);
		Sales temp = new Sales(1,sales.getAmount());
		assertEquals(sales.getAmount(), temp.getAmount(),0.001);
		sales.setAmount(30);
		assertNotEquals(sales.getAmount(), temp.getAmount(), 0.001);
	}
	
	

	@After
	public void tearDown() throws Exception {
		sales = null;
	}	
	

}
