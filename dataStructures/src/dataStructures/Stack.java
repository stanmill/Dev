package dataStructures;

import java.util.Vector;

public class Stack<E> {
	
	Vector<E> list = new Vector<E>();
	E element;
	
	
	void push(E element) {
		
		list.add(element);	
	}
	
	E pop() {
		
		E lastElement = list.lastElement();
		list.remove(lastElement);
		
		return lastElement;		
	}
	
	int checkSize() {return list.size();}
	
	boolean isEmpty() {return list.isEmpty();}
	
	E peek() {
		
		if(list.isEmpty()) System.exit(0);
		return list.lastElement();
	}

}
