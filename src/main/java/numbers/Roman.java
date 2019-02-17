package numbers;

import java.util.HashMap;
import java.util.Map;

public class Roman {
	private Map<String, Integer> values = values();
	private String roman;

	private Roman(String roman) {
		this.roman = roman;
	}

	private int toAlgebraic() {
		if (roman.isEmpty()) {
			return 0;
		}
		if (startsAscending()) {
			return toAlgebraic_startsAscending();
		}
		return toAlgebraic_defaultCase();
	}

	private boolean startsAscending() {
		return roman.length() > 1 && values.containsKey(roman.substring(0, 2));
	}

	private int toAlgebraic_startsAscending() {
		return values.get(roman.substring(0, 2)) + toAlgebraic(roman.substring(2));
	}

	private int toAlgebraic_defaultCase() {
		return values.get(roman.substring(0, 1)) + toAlgebraic(roman.substring(1));
	}

	private Map<String, Integer> values() {
		Map<String, Integer> values = new HashMap<>();
		values.put("I", 1);
		values.put("V", 5);
		values.put("X", 10);
		//
		values.put("IV", 4);
		values.put("IX", 9);
		return values;
	}

	public static int toAlgebraic(String roman) {
		return new Roman(roman).toAlgebraic();
	}
}