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
	
	private int toAlgebraic(String roman) {
		Map<String, Integer> values = new HashMap<>();
		values.put("I", 1);
		return values.get(roman);
	}
}
