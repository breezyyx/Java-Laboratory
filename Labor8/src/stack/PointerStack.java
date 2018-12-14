package stack;

public class PointerStack implements StringStack {
	private StackElement[] stack;

	public PointerStack() {

	}

	@Override
	public void push(String newElement) {
		// TODO Auto-generated method stub
		int counter = 1;
		stack[counter] = new StackElement(newElement, (counter - 1));
		stack[stack.length] = stack[counter];
		stack[counter] = null;
		counter++;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		StackElement temp = stack[stack.length];
		stack[stack.length] = null;
		for (int i = 1; i < stack.length; i++) {
			stack[stack.length] = stack[stack.length - i];
			stack[i] = null;
		}
		return temp.toString();
	}

	@Override
	public String top() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
