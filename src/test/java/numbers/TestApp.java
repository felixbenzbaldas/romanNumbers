package numbers;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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

	@Test
	public void fancyNumber() {
		assertThat(toAlgebraic("CCCXCVIII"), is(398));
	}

	private Integer toAlgebraic(String roman) {
		return Roman.toAlgebraic(roman);
	}
}