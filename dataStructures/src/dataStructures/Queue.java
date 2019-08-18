package dataStructures;

import java.util.Vector;

public class Queue<E> {
	
	Vector<E> list = new Vector<E>();
	E element;
	
	void add(E element) {
		list.add(element);
	}
	
	E poll() {
		E temp = list.firstElement();
		E firstElement = temp;
		list.remove(temp);
		
		return firstElement;
	}
	
	int checkSize() {
		return list.size();
	}
	
	boolean isEmpty() {
		return list.isEmpty();
	}
	
	E peek() {
		return list.firstElement();
	}

}
