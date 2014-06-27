package background;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * This is where the quadratic is solved, takes a, b, c, and solves for x.
 * @author darvidson
 *
 */
public class Quadratic {
	int a;
	int b;
	int c;

	public Quadratic(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public String solve() {
		String result = "";

		double ans1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
		double ans2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
		if (Double.isNaN(ans1) && Double.isNaN(ans2)) {

			result = result + "X is an imaginary number" +
					"\n" + "Visit this web page to learn more about imaginary numbers, look in the section that explains" +
					"\n" + "complex solutions.  ";
		}

		else if (Double.isNaN(ans1) && !Double.isNaN(ans2)) {
			result = result + "X = " + ans2;
		}

		else if (Double.isNaN(ans2) && !Double.isNaN(ans1)) {
			result = result + "X = " + ans1;
		}

		else {
			result = result + "X = " + ans1 + "\n or X = " + ans2;
		}
		return result;
	}
}
