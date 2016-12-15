public class Sorts {
    public static String name(){
	return "10.Chen.Evan";
    }
    
    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    
    public static void selectionSort(int[] data) {
	for ( int i = 0; i < data.length; i++ ) {
	    int min = i;
	    for ( int current = i+1; current < data.length; current++ ) {
		if ( data[current] < data[min] ) {
		    min = current;
		}
	    }
	    if ( i != min ) {
		int temp = data[min];
		data[min] = data[i];
		data[i] = temp;
	    }
		
	}
    }

    public static void insertionSort(int[] data) {
	for ( int index = 1; index < data.length; index++ ) {
	    for ( int j = index; j > 0; j-- ) {
		if ( data[j] < data[j-1] ) {
		    int temp = data[j];
		    data[j] = data[j-1];
		    data[j-1] = temp;
		}
	    }
	}
    }

    public static void bubbleSort(int[] data) {
	for ( int i = 0; i < data.length; i++ ) {
	    for ( int j = 0; j < data.length-1; j++ ) {
		if ( data[j] > data[j+1] ) {
		    int temp = data[j];
		    data[j] = data[j+1];
		    data[j+1] = temp;
		}
		System.out.println(data);
	    }
	}
    }

}
