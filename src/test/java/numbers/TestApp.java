package numbers;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class TestApp {
	
	@Test
	public void one() {
		assertThat(toAlgebraic("I"), is(1));
	}

	private int toAlgebraic(String roman) {
		return 1;
	}
}
