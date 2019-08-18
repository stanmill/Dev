package dataStructures;

import java.util.Vector;

public class Queue<E> {
	
	Vector<E> list = new Vector<E>();
	E element;
	
	void add(E element) {
		list.add(element);
	}
	
	E poll() {
		
		E firstElement = list.firstElement();
		list.remove(firstElement);
		
		return firstElement;
	}
	
	int checkSize() {
		
		 System.out.println("The curent queue size is "+list.size());
		
		return list.size();
	}
	
	boolean isEmpty() {
		return list.isEmpty();
	}
	
	E peek() {
		return list.firstElement();
	}

}
