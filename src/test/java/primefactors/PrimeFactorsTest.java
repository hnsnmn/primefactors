package primefactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 1. 13.
 * Time: 오전 9:22
 * To change this template use File | Settings | File Templates.
 */
public class PrimeFactorsTest {

	@Test
	public void canFactorIntoPrimes() {
		assertPrimeFactors(1, list ());
		assertPrimeFactors(2, list(2));
	 	assertPrimeFactors(3, list(3));
		assertPrimeFactors(4, list(2,2));
		assertPrimeFactors(5, list(5));
		assertPrimeFactors(6, list(2,3));
		assertPrimeFactors(7, list(7));
		assertPrimeFactors(8, list(2,2,2));
		assertPrimeFactors(9, list(3,3));
		assertPrimeFactors(2 * 2 * 3 * 3 * 3 * 7 * 11 * 11 * 13, list(2, 2, 3, 3, 3, 7, 11, 11, 13));
	}

	private void assertPrimeFactors(int n, List<Integer> primeFactors) {
		assertEquals(primeFactors, of(n));
	}
	private List<Integer> list(Integer... ints) {
		return Arrays.asList(ints);
	}

	private List<Integer> of(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();

		for (int divisor = 2; n > 1; divisor++)
			for (;n % divisor == 0; n /= divisor)
				factors.add(divisor);

		return factors;
	}



}
