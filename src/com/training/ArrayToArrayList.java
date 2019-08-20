package com.training;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]={"HI","Myname","number","id"};
	    //method 1 to add array to Array List
	    //ArrayList<String> array= new ArrayList<String>(Arrays.asList(s));
	    //Method 2 to add array to Array List
		
			ArrayList<String> array=new ArrayList<String>();	
			array.addAll(Arrays.asList(s));
	    
	        for(int i = 0; i < array.size(); i++){
	            String m=array.get(i);
	        	System.out.println(m);
	    }
	}

}
