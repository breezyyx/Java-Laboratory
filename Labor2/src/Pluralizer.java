
public class Pluralizer {

	public static void main(String[] args) {
		// Declaration of var and reading input
		String output;
		String input = In.readString("Geben Sie ein englisches Wort ein: ");

		// Checking for conditions
		if (input.endsWith("s") || input.endsWith("sh") || input.endsWith("ch") || input.endsWith("x")
				|| input.endsWith("z")) {
			output = input + "es";
			System.out.println("Der Plural von " + input + " ist " + output);
		} else if (input.endsWith("y")) {
			if (input.endsWith("ay") || input.endsWith("ey") || input.endsWith("oy") || input.endsWith("uy")) {
				output = input;
				System.out.println("Ausnahme Endung ay, ey, oy oder uy. " + input + " bleibt unverändert");
			} else {
				// Replacing the y at the end with ies using the substring method
				output = input.substring(0, input.length() - 1) + "ies";
				System.out.println("Der Plural von " + input + " ist " + output);
			}
		} else {
			// Checking exceptions
			if (input.equals("man")) {
				output = "men";
				System.out.println("Der Plural von " + input + " ist " + output);
			} else if (input.equals("woman")) {
				output = "women";
				System.out.println("Der Plural von " + input + " ist " + output);
			} else if (input.equals("child")) {
				output = "children";
				System.out.println("Der Plural von " + input + " ist " + output);
			} else if (input.equals("foot")) {
				output = "feet";
				System.out.println("Der Plural von " + input + " ist " + output);
			} else if (input.equals("tooth")) {
				output = "teeth";
				System.out.println("Der Plural von " + input + " ist " + output);
			} else if (input.equals("mouse")) {
				output = "mice";
				System.out.println("Der Plural von " + input + " ist " + output);
			} else {
				// If nothing applies
				System.out.println("Eingabe im Programm nicht berücksichtigt!");
			}

		}

	}

}
