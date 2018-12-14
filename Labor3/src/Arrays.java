
public class Arrays {

	// Method to return the smallest element in the array
	public static double smallestElement(int[] array) {
		int setSmallest = array[0];

		for (int j = 0; j < array.length; j++) {
			if (setSmallest > array[j]) {
				setSmallest = array[j];
			}
		}

		return setSmallest;
	}

	// Method to return the biggest element in the array
	public static double biggestElement(int[] array) {
		int setBiggest = array[0];

		for (int j = 0; j < array.length; j++) {
			if (setBiggest < array[j]) {
				setBiggest = array[j];
			}
		}

		return setBiggest;
	}

	// Method that calculates and returns the average value of the array
	public static double averageValue(int[] array) {
		double setAverage = 0;

		for (int i = 0; i < array.length; i++) {
			setAverage = setAverage + array[i];
		}

		setAverage = setAverage / array.length;

		return setAverage;
	}

	// Method that sorts an array from biggest to smallest value
	public static int[] arraySort(int[] array) {
		
		// Temp variable to store the bigger value in order to switch it
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	// Method that creates a random array
	public static int[] createArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (int) (Math.random() * 101);
		}
		return newArray;
	}

	public static void main(String[] args) {

		int[] newArray = new int[] { 2, 4, 1, 20, 33, 55, 7,0, 10, 8, 5, 3, 99, 88, 77 };
		System.out.println("Kleinster Wert im Array: " + smallestElement(newArray));
		System.out.println("Größter Wert im Array: " + biggestElement(newArray));
		System.out.println("Mittelwert des Arrays: " + averageValue(newArray));

		System.out.print("Sortiert: ");
		int[] sortedArray = arraySort(newArray);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}

		System.out.print("\nZufallsarray: ");
		int[] randomArray = createArray(10);
		for (int i = 0; i < randomArray.length; i++) {
			System.out.print(randomArray[i] + " ");
		}
	}

}
