public class SuperArrayIterator implements Iterator<String> {
    int index;
    SuperArray array;
    
    public SuperArrayIterator() {
	index = 0;
	array = this;
    }

    public SuperArray next() {
	if ( hasNext() ) {
	    return index++;
	}
	else {
	    throw new NoSuchElementException();
	}
    }

    public boolean hasNext() {
	return index < this.length;
    }
