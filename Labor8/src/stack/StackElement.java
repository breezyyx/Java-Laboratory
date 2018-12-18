package stack;

public class StackElement {

	private String newElement;
	private StackElement next;

	public StackElement(String newElement, StackElement next) {
		// TODO Auto-generated constructor stub
		this.newElement = newElement;
		this.next = next;
	}
	
	public String getNewElement() {
		return newElement;
	}
	
	public StackElement getNextElement() {
		return next;
	}
	
	public void setNewElement(String newElement) {
		this.newElement = newElement;
	}
	
	public void setStackElement(StackElement next) {
		this.next = next;
	}
}
