package dataStructures;

import java.util.Vector;

public class Stack<E> {
	
	Vector<E> list = new Vector<E>();
	E element;
	
	
	void push(E element) {
		
		list.add(element); 			
		System.out.println("Added element "+element);
	}
	
	E pop() {
		
		if(list.isEmpty()) {
			System.err.println("There is nothing to remove in the stack");
			return null;
		}
		
		E lastElement = list.lastElement();
		list.remove(list.size()-1);		
		System.out.println("Removed element "+lastElement);

		return lastElement;					
	}
	
	int checkSize() {		
		
		System.out.println("The current stack size is "+list.size());

		return list.size();	
	}
	
	boolean isEmpty() {
		
		if(list.isEmpty()) System.out.println("The stack is empty");	
		
		else System.out.println("The stack is not empty");

		return list.isEmpty();	
	}
	
	E peek() {
		
		if(list.isEmpty()) {
			System.err.println("There is nothing to peek in the stack");
			return null;	
		} 
		System.out.println("The current top is "+list.lastElement());
		
		return list.lastElement();
	}
}
