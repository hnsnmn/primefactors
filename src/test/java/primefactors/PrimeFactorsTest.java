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
		assertEquals(list(), of(1));
	}

	private List<Integer> list() {
		return Arrays.asList();
	}

	private List<Integer> of(int i) {
		return new ArrayList<Integer>();
	}



}
