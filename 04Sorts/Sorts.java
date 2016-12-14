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
}
