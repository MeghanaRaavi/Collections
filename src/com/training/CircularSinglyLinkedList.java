package com.training;

import java.util.LinkedList;
import java.util.Scanner;

public class CircularSinglyLinkedList
	{    
	    public static void main(String[] args)
	    {            
	        Scanner scan = new Scanner(System.in);
	       
	        LinkedList list = new LinkedList(); 
	        System.out.println("Circular Singly Linked List Test\n");          
	        char ch;
	   
	        do
	        {
	            System.out.println("2. insert at end");
	            System.out.println("3. insert at position");
	            System.out.println("4. delete at position");
	            System.out.println("5. check empty");
	            System.out.println("6. get size");            
	            int choice = scan.nextInt();            
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Enter integer element to insert");
	                list.addFirst( scan.nextInt() );                     
	                break;                          
	            case 2 : 
	                System.out.println("Enter integer element to insert");
	                list.addLast( scan.nextInt() );                     
	                break;                         
	            case 3 : 
	                System.out.println("Enter integer element to insert");
	                int num = scan.nextInt() ;
	                System.out.println("Enter position");
	                int pos = scan.nextInt() ;
	                list.add(pos, num);
	                break;                                          
	            case 4 : 
	                System.out.println("Enter position");
	                int p = scan.nextInt() ;
					list.remove(p);
	                break;
	            case 5 : 
	                System.out.println("Empty status = "+ list.isEmpty());
	                break;                   
	            case 6 : 
	                System.out.println("Size = "+ list.size() +" \n");
	                break;                         
	            default : 
	                break;   
	            }
	           
	           System.out.println(list);
	       
	            ch = scan.next().charAt(0);            
	        } while (ch == 'Y'|| ch == 'y');                    
	    } 
	}


