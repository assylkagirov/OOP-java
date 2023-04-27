package lab3problem5;

public class Sort {
	
	static <E> void swap (E[] array, int i, int j) {
		E a = array[i];
		array[i] = array[j];
		array[j] = a;
		
	}
	
	static <E extends Comparable<Object>> void bubbleSort(Chocolate[] chocolates) {
	    for (int i = 0; i<chocolates.length; i++) {
	    	for (int j = 0; j<chocolates.length; j++) {
	    		if (chocolates[i].compareTo(chocolates[j]) == -1)
	    			swap(chocolates, i, j);
	    	}
	    }
	}
	
	
	static <E extends Comparable<Object>> void quickSort(E[] array) {
		quickSorting(array, 0, array.length -1);
	}
	
	private static <E extends Comparable<Object>> void quickSorting(E[] array, int l, int r) {
		if (l < r) {
			int pivot = p(array, l, r);
			quickSorting(array, l, pivot - 1);
			quickSorting(array, pivot + 1, r);
		}
	}
	
	static <E extends Comparable<Object>> int p(E[] array, int l, int r) {
		int min = l;
		
		for (int i = l; i < r; i++) {
			if (array[i].compareTo(array[r]) == -1) {
				swap(array, i, min);
				min++;
			}
		}
		swap(array, min, r);
		return min;	
	}
	
}