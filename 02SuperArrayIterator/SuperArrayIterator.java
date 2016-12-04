import java.util.*;
public class SuperArrayIterator implements Iterator<String> {
    int index;
    SuperArray array;
    
    public SuperArrayIterator(int ind, SuperArray arr) {
	this.index = ind;
	this.array = arr;
    }

    public String next() {
	if ( this.hasNext() ) {
	    index++;
	    return array.get(index);
	}
	else {
	    throw new NoSuchElementException();
	}
    }

    public boolean hasNext() {
	return index < array.size();
    }

    public void remove() {
	throw new UnsupportedOperationException();
    }

}
