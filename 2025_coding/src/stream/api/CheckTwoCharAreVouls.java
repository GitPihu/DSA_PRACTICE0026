package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckTwoCharAreVouls {

	public static void main(String args[]) {
		List<String> str = new ArrayList<String>();

		str.add("oepen");
		str.add("Girl");
		str.add("boy");
		str.add("aezebra");
		str.add("open");
		List<String> strwd= str.stream().filter(f -> isTrue(f)).collect(Collectors.toList());
		
		System.out.print(strwd);

	}

	private static boolean isTrue(String sentence) {
		boolean flga = false;
		if (!sentence.isEmpty()) {
		
			char ch[] = sentence.toCharArray();
			int count = 0;
			String vol = "aeiou";
			for (int i = 0; i < ch.length; i++) {
				if (vol.indexOf(ch[i]) >= 0) {
					count++;
					if (count == 2) {
						flga = true;
						break;
					}

				}
			}

		}

		return flga;
	}

}
