package practice;

import java.util.Arrays;

public class PracticeForEach {

	public static void main(String[] args) {
		
		String[] list = {
				"Yuki",
				"Ed",
				"Micheal",
				"Rose",
				"Brandon",
				"Justin",
				"Ember",
				"Water",
				"Jusmin",
				"Emma",
				"Hanna",
				"Ash"
				};

	Arrays.stream(list).forEach(s -> System.out.println(s));
	}

}
