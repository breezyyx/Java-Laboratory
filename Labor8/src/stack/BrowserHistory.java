package stack;

public class BrowserHistory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringStack history = new ArrayStack();
		String[] test = new String[5];
		String webAdress = null;
		int counter = 0;
		
		do {

			webAdress = In.readLine("Eingabe:");

			if (webAdress.equals("back")) {
				history.pop();
				if (history.top() == null) {
					System.out.println("Keine Historie verfügbar!");
				} else {
					System.out.println("zuletz aufgerufene Seite: " + history.top());
				}
			} else {
				history.push(webAdress);
				System.out.println("Aufgerufene Seite: " + webAdress);
			}

		} while (counter == 0);

	}

}
