import static org.junit.Assert.*;
import org.junit.Test;

public class SieveTest {
	
	private int arraySize = 100;
	Sieve sieve = new Sieve(arraySize);
	
	@Test
	public void twoIsPrime() {
		assertEquals(sieve.returnValue(2), true);
	}
	
	@Test
	public void threeIsPrime() {
		assertEquals(sieve.returnValue(3), true);
	}
	
	@Test
	public void fourIsNotPrime() {
		assertEquals(sieve.returnValue(4), false);
	}
	
	@Test
	public void fiveIsPrime() {
		assertEquals(sieve.returnValue(5), true);
	}
	
	@Test
	public void sixIsNotPrime() {
		assertEquals(sieve.returnValue(6), false);
	}
	
	@Test
	public void sevenIsPrime() {
		assertEquals(sieve.returnValue(7), true);
	}
	
	@Test
	public void eightIsNotPrime() {
		assertEquals(sieve.returnValue(8), false);
	}
	
	@Test
	public void nineIsNotPrime() {
		assertEquals(sieve.returnValue(9), false);
	}
	
	@Test
	public void tenIsNotPrime() {
		assertEquals(sieve.returnValue(10), false);
	}
	
}