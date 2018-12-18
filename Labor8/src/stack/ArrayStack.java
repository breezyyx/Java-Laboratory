package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStack implements StringStack {

	private String[] elements;
	private int counter = 0;
	private List<String> test;

	
	// Constructor that initializes the elements Arraay
	public ArrayStack() {
		elements = new String[5];
	}

	// Pushes a new element into the stack and deletes the bottom one if stack is full
	@Override 
	public void push(String newElement) {
		// TODO Auto-generated method stub

		if (counter > 4) {
			counter = 4;
		} else if (counter < 0) {
			counter = 0;
		}

		if (elements[4] != null) {
			test = new ArrayList<String>(Arrays.asList(elements));
			test.remove(elements[0]);
			elements = test.toArray(elements);
		}

		if (elements[counter] == null) {
			elements[counter] = newElement;
		}

		counter++;
	}

	// Deletes and returns top element of the stack
	@Override
	public String pop() {
		// TODO Auto-generated method stub
		String temp;
		counter--;

		if (isEmpty()) {
			return null;
		}

		boolean full = true;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == null) {
				full = false;
				break;
			}
		}

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == null) {
				temp = elements[i - 1];

				test = new ArrayList<String>(Arrays.asList(elements));
				test.remove(elements[i - 1]);
				elements = test.toArray(elements);
				return temp;
			} else if (full == true) {
				temp = elements[4];

				test = new ArrayList<String>(Arrays.asList(elements));
				test.remove(elements[4]);
				elements = test.toArray(elements);
				return temp;
			}
		}
		return null;
	}

	// Returns top element of the stack
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

	// returns boolean of stack is empty or not
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean empty = true;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != null) {
				empty = false;
				break;
			}
		}
		return empty;
	}
}
