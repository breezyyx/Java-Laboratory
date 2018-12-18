package stack;

public class PointerStack implements StringStack {
	private StackElement top;
	private int counter;

	// Constructor
	public PointerStack() {

	}

	//Pushes a new Element into the stack
	@Override
	public void push(String newElement) {
		// TODO Auto-generated method stub
		StackElement old = this.top;
		top = new StackElement(newElement, old);
		counter++;
	}

	// Deletes and returns the top element
	@Override
	public String pop() {
		// TODO Auto-generated method stub
		String result = top.getNewElement();
		top = top.getNextElement();
		counter--;
		return result;
	}

	// Returns top element of the stack
	@Override
	public String top() {
		// TODO Auto-generated method stub
		return top.getNewElement();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
