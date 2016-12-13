public class Sorts {
    public static String name(){
	return "10.Chen.Evan";
    }
    
    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    
    public static void selectionSort(int[] data) {
	for ( int start = 0; start < data.length; start++ ) {
	    int small = data[start];
	    //keep track of a variable index instead
	    
	    for ( int current = start+1; current < data.length-2; current++ ) {
		if ( data[current] < small ) {
		    small = data[current];
		}
	    }
	    
	    data[current] = data[start];
	    data[start] = small;
	}
    }
}

