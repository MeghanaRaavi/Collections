package com.training;

public class LinkedListMiddle {
    
	
	    public static void main(String[] args) {
	         LinkedList linkedList = new LinkedList();        
	         linkedList.addElement( new LinkedList.Node("1"));
	         linkedList.addElement( new LinkedList.Node("2"));
	         linkedList.addElement( new LinkedList.Node("3"));
	         linkedList.addElement( new LinkedList.Node("6"));
	         linkedList.addElement( new LinkedList.Node("5"));
	         linkedList.addElement( new LinkedList.Node("6"));
	         linkedList.addElement( new LinkedList.Node("7"));
	        
	         
	         printMiddleElement(linkedList);
	    }
	 
	    private static void printMiddleElement(LinkedList linkedList) {
	        
	        
	    LinkedList.Node slowPointer = linkedList.getHeaderElement();
	    LinkedList.Node fastPointer = linkedList.getHeaderElement();
	     
	    if(linkedList!=null){
	            
	      while (fastPointer != null && fastPointer.next() != null)
	      {
	             fastPointer = fastPointer.next().next();
	             slowPointer = slowPointer.next();
	      }
	            
	    System.out.println("Middle element of linked list is " + slowPointer.value());
	            
	    }
	 }    
	 
	}