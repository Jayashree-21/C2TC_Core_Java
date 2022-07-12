package com.tns.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList class called to use by using reference variable name is 'll'
		 LinkedList ll = new LinkedList();
		 //add the elements into the linked list class 
		 ll.add(new Integer(10));
		 ll.add(new Integer(20));
		 ll.add(new Integer(30));
		 //add the LinkedList element by using index
		 ll.add(2,new Integer(40));
		 //adding the element in linkedlist in first place
		 ll.addFirst(50);
		 
		 //adding the element in linkedlist in last place
		 ll.addLast(60);
		 //remove the element
		 ll.remove();
		 ll.remove();
		 ll.remove(2);
		 Iterator i=ll.iterator();
		    while(i.hasNext())
		    {
		    	Integer i1=(Integer) i.next();
		    	System.out.println(ll);
		    }
		
		

	}

}
