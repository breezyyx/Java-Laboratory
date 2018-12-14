package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStack implements StringStack {

	private String[] elements;
	private int counter = 0;
	private List<String> test;

	public ArrayStack() {
		elements = new String[5];
	}

	@Override
	public void push(String newElement) {
		// TODO Auto-generated method stub

		if (counter > 4 || counter < 0) {
			counter = 0;
		}

		if (elements[4] != null) {
			elements[0] = null;
		}

		if (elements[counter] == null) {
			elements[counter] = newElement;
		}

		counter++;
	}

	public String[] return1() {
		return elements;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		String temp;
		counter--;

		if (elements[0] == null) {
			return null;
		}

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == null) {
				temp = elements[i - 1];

				test = new ArrayList<String>(Arrays.asList(elements));
				test.remove(elements[i - 1]);
				elements = test.toArray(elements);
				return temp;
			}
		}
		return null;
	}

	@Override
	public String top() {
		// TODO Auto-generated method stub
		String temp;
		if (elements[0] == null) {
			return null;
		}

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == null) {
				temp = elements[i - 1];
				return temp;
			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (elements[0] == null) {
			return true;
		} else {
			return false;
		}
	}
}
