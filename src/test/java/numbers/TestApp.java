package numbers;

import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class TestApp {
	
	@Test
	public void one() {
		assertThat(toAlgebraic("I"), is(1));
	}
	@Test
	public void five() {
		assertThat(toAlgebraic("V"), is(5));
	}
	@Test
	public void two() {
		assertThat(toAlgebraic("II"), is(2));
	}
	
	
	private int toAlgebraic(String roman) {
		if (roman.isEmpty()) return 0;
		Map<String, Integer> values = new HashMap<>();
		values.put("I", 1);
		values.put("V", 5);
		return values.get(roman.substring(0, 1)) + toAlgebraic(roman.substring(1));
	}
}