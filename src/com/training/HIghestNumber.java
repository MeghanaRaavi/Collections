package com.training;

public class HIghestNumber {

	public static void main(String[] args) {
	
		    int i,max=0,index=0;
		    int large[] = new int[10];
		    int array[] = { 2,5,76,45,32,5,7,454,65,67,988,23,12,423,1,54 };

			max = array[0];
			for (i = 0; i < array.length; i++) {
				if (array[i] > max) {
					max = array[i];
				}
			}

			System.out.println("Highest Number In and Array " +   " : " + max);
		    }
	
	}

