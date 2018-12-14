import stack.ArrayStack;
import stack.StringStack;

/**
 * Testklasse für die Stack-Anwendung
 * 
 * @author Tobias Lauer
 */
public class StackTest {

	public static void main(String[] args) {
		StringStack mystack;						// Deklariere eine Variable vom Typ IStack
		mystack = new ArrayStack();		// Erstelle einen neuen ArrayStack 

		System.out.println("Füge Element 'First' ein.");
		mystack.push("First");
		
		System.out.println("Füge Element 'Second' ein.");
		mystack.push("Second");
		
		System.out.print("Top Element: ");
		System.out.print(mystack.top());
		System.out.println(" (korrekt wäre: 'Second')");

		System.out.print("Entferne Top Element: ");
		System.out.print(mystack.pop());
		System.out.println(" (korrekt wäre: 'Second')");
		
		System.out.print("Top Element: ");
		System.out.print(mystack.top());
		System.out.println(" (korrekt wäre: 'First')");

		System.out.println("Füge Element 'Third' ein.");
		mystack.push("Third");
		
		System.out.println("Füge Element 'Fourth' ein.");
		mystack.push("Fourth");
		
		System.out.print("Entferne Top Element: ");
		System.out.print(mystack.pop());
		System.out.println(" (korrekt wäre: 'Fourth')");
		System.out.print("Entferne Top Element: ");
		System.out.print(mystack.pop());
		System.out.println(" (korrekt wäre: 'Third')");
		System.out.print("Entferne Top Element: ");
		System.out.print(mystack.pop());
		System.out.println(" (korrekt wäre: 'First')");
		System.out.print("Entferne Top Element: ");
		System.out.print(mystack.pop());
		System.out.println(" (korrekt wäre: 'null')");
		System.out.print("Top Element: ");
		System.out.print(mystack.top());
		System.out.println(" (korrekt wäre: 'null')");
	}
}
