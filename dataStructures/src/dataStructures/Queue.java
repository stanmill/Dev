package dataStructures;

import java.util.Vector;

public class Queue<E> {
	
	Vector<E> list = new Vector<E>();
	E element;
	
	void add(E element) {
		
		list.add(element);
		System.out.println("Added element "+element);
		
	}
	
	E poll() {
		
		if(list.isEmpty()) {
			System.err.println("There is nothing to pull in the queue");
			return null;
			
		}
		E firstElement = list.firstElement();
		list.remove(firstElement);
		
		return firstElement;
	}
	
	int checkSize() {
		
		 System.out.println("The curent queue size is "+list.size());
		
		return list.size();
	}
	
	boolean isEmpty() {
		
		if(list.isEmpty()) System.out.println("The queue is empty");	
		
		else System.out.println("The queue is not empty");
		
		return list.isEmpty();
	}
	
	E peek() {
		
		if(list.isEmpty()) { 
			System.err.println("There is nothing to peek in the queue");
			return null;
		}
		System.out.println("The current queue is "+list.firstElement());
		
		return list.firstElement();
	}

}
