package teoriainterfazfuncional00;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PruebaLambda05 {

	@Test
	void test() {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		System.out.println(names.toString());

		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(names.toString());
		Collections.sort(names, (o1, o2) -> {
			return o2.compareTo(o1);
		});
		System.out.println(names.toString());
	}

}
