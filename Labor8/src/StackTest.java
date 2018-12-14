import stack.ArrayStack;
import stack.StringStack;

/**
 * Testklasse f�r die Stack-Anwendung
 * 
 * @author Tobias Lauer
 */
public class StackTest {

	public static void main(String[] args) {
		StringStack mystack;						// Deklariere eine Variable vom Typ IStack
		mystack = new ArrayStack();		// Erstelle einen neuen ArrayStack 

		System.out.println("F�ge Element 'First' ein.");
		mystack.push("First");
		
		System.out.println("F�ge Element 'Second' ein.");
		mystack.push("Second");
		
		System.out.print("Top Element: ");
		System.out.print(mystack.top());
		System.out.println(" (korrekt w�re: 'Second')");

		System.out.print("Entferne Top Element: ");
		System.out.print(mystack.pop());
		System.out.println(" (korrekt w�re: 'Second')");
		
		System.out.print("Top Element: ");
		System.out.print(mystack.top());
		System.out.println(" (korrekt w�re: 'First')");

		System.out.println("F�ge Element 'Third' ein.");
		mystack.push("Third");
		
		System.out.println("F�ge Element 'Fourth' ein.");
		mystack.push("Fourth");
		
		System.out.print("Entferne Top Element: ");
		System.out.print(mystack.pop());
		System.out.println(" (korrekt w�re: 'Fourth')");
		System.out.print("Entferne Top Element: ");
		System.out.print(mystack.pop());
		System.out.println(" (korrekt w�re: 'Third')");
		System.out.print("Entferne Top Element: ");
		System.out.print(mystack.pop());
		System.out.println(" (korrekt w�re: 'First')");
		System.out.print("Entferne Top Element: ");
		System.out.print(mystack.pop());
		System.out.println(" (korrekt w�re: 'null')");
		System.out.print("Top Element: ");
		System.out.print(mystack.top());
		System.out.println(" (korrekt w�re: 'null')");
	}
}
