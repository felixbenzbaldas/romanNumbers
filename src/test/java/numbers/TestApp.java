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
	@Test
	public void six() {
		assertThat(toAlgebraic("VI"), is(6));
	}
	@Test
	public void four() {
		assertThat(toAlgebraic("IV"), is(4));
	}
	
	private Map<String, Integer> values = values();
	private int toAlgebraic(String roman) {
		if (roman.isEmpty()) {
			return 0;
		}
		if (roman.length() > 1) {
			if (values.containsKey(roman.substring(0, 2))) {
				return values.get(roman.substring(0, 2)) + toAlgebraic(roman.substring(2));
			}
		}
		return values.get(roman.substring(0, 1)) + toAlgebraic(roman.substring(1));
	}
	private Map<String, Integer> values() {
		Map<String, Integer> values = new HashMap<>();
		values.put("I", 1);
		values.put("V", 5);
		values.put("IV", 4);
		return values;
	}
}