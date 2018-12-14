/**
 * 
 */
package stack;

/**
 * @author dszill
 *
 */

public interface StringStack {
	
	public void push(String newElement);
	public String pop();
	public String top();
	public boolean isEmpty();
}
