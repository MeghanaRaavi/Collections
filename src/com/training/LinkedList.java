package com.training;

class LinkedList{
	private Node headerElement;
    private Node tailorElement;
  
    public LinkedList(){
        this.headerElement = new Node("HeaderElement");
        tailorElement = headerElement;
    }
  
    public Node getHeaderElement(){
        return headerElement;
    }
  
    public void addElement(Node node){
        tailorElement.next = node;
        tailorElement = node;
    }
  
  
    public static class Node{
        private Node next;
        private String value;
 
        public Node(String value){
            this.value = value;
        }
      
        public String value() {
            return value;
        }
 
        public Node next() {
            return next;
        }
      
        public String toString(){
            return this.value;
        }
    }

}
