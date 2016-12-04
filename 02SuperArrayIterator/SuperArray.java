public class SuperArray implements Iterator<String> {
    private String[] data;
    private int size;

    public SuperArray() {
	this.data = new String[10];
	this.size = 0;
    }
    
    public SuperArray(int initialCapacity) {
	if ( initialCapacity < 0 ) {
	    throw new IllegalArgumentException();
	}
	this.data = new String[initialCapacity];
	this.size = 0;
    }

    public int size() {
	return size;
    }
    public String[] getData() {
	return data;
    }

    public String get(int index) {
	if ( index < 0 || index >= size() ) {
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }
    
    /*
    public void add(int n) {
	if ( size() > data.length-1 ) {
	    grow();
	}
	data[size] = n;
	size++;
    }
    */

    boolean add(String element) {
	if ( size() > data.length-1 ) {
	    grow();
	}
	data[size] = element;
	size++;
	return true;
    }
    
    public void grow() {
	String[] temp = new String[data.length * 2 + 1];
	for ( int i = 0; i < data.length; i++ ) {
	    temp[i] = data[i];
	}
	data = temp;
    }

    public void clear() {
	size = 0;
    }

    public boolean isEmpty() {
	return size() == 0;
    }

    public String set(int index, String element) {
	if ( index < 0 || index >= size() ) {
	    throw new IndexOutOfBoundsException();
	}
	String old = data[index];
	data[index] = element;
	return old;
    }

    public void add(int index, String element) {
	if ( index < 0 || index > size() ) {
	    throw new IndexOutOfBoundsException();
	}
	if (size() == data.length) {
	    grow();
	}
	String[] temp = new String[size+1];
	for ( int i = 0; i < index; i++ ) {
	    temp[i] = data[i];
	}
	for ( int j = index; j < size; j++  ) {
	    temp[j+1] = data[j];
	}
	temp[index] = element;
	data = temp;
	size++;
    }

    public String remove(int index) {
	if ( index < 0 || index >= size() ) {
	    throw new IndexOutOfBoundsException();
	}
	String[] temp = new String[size];
	String stuff = data[index];
	for ( int i = 0; i < index; i++ ) {
	    temp[i] = data[i];
	}
	for ( int j = index; j < size-1; j++ ) {
	    temp[j] = data[j+1];
	}
	data = temp;
	size--;
	return stuff;
    }

    public String[] toArray() {
	String[] stuff = new String[size()];
	for ( int i = 0; i < size(); i++ ) {
	    stuff[i] = data[i];
	}
	return stuff;
    }
    
    public String toString() {
	String stuff = "[ ";
	for ( int i = 0; i < size(); i++ ) {
	    if ( i != size()-1 ) {
		stuff += get(i) + ", ";
	    }
	    else {
		stuff += get(i) + "]";
	    }
	}
	if ( size() == 0 ) {
	    stuff += "]";
	}
	return stuff;
    }

    public int indexOf(String element) {
	for ( int i = 0; i < size(); i++ ) {
	    if ( element.equals(data[i]) ) {
		return i;
	    }
	}
	return -1;
    }

    public int lastIndexOf(String element) {
	for (int i = size() - 1; i > 0; i-- ) {
	    if ( element.equals(data[i]) ) {
		return i;
	    }
	}
	return -1;
    }

    void trimToSize() {
	String[] temp = new String[size()];
	for ( int i = 0; i < size(); i++ ) {
	    temp[i] = data[i];
	}
	data = temp;
    }
    
    public String toStringDebug() {
	String res = "[ ";
        for ( int i = 0; i < size(); i++ ) {
	    res += data[i] + ", ";
	}
	for ( int i = size(); i < data.length; i++ ) {
	    if ( i != data.length-1 ) {
		res += "_, ";
	    }
	    else {
		res += "]";
	    }
	}
	return res;
    }

    public Iterator<String> iterator(){
	return new SuperArrayIterator(0,data);
  }
}
