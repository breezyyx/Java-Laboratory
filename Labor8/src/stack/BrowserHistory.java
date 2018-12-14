package stack;

public class BrowserHistory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringStack history = new ArrayStack();
		String webAdress = null;
		int counter = 0;

		do {
			if (history.top() == null) {
				System.out.println("Keine Historie verfügbar!");
			}
			webAdress = In.readLine("Adresse:");
			
			if (webAdress.equals("back")) {
				history.pop();
			} else {
				history.push(webAdress);
			}
			System.out.println("Aufgerufene Seite: " + webAdress);
		} while (counter == 0);

	}

}
