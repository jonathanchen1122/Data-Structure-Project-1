package packy;

import java.util.*;

class ProjectOne 
{
    
    static int[] A; 
    static int size;

    public static void main(String[] args) 
    { 
    	
    Scanner space = new Scanner(System.in);
	
	System.out.println("======================");
	System.out.println("** Assignment1 output **");
	System.out.println("Enter size of array :");
	size = space.nextInt();	
	A = new int[size];		
	System.out.println("Enter " + size + " integer data:");
	
	for( int count = 0; count < size ;count++ ) {
		A[count] = space.nextInt();
	}
	space.close();

	System.out.println("======================");	
	display(A);									
	System.out.println("======================");


        int temp = findMaximum(A); 
	System.out.println("Maximum value is : "+temp);

	
	System.out.println("Minimum value is : "+ findMinimum());
	System.out.println("======================");
	

	selectionSort(A);
	
	
	display(A);

	
	System.out.println("Maximum value is : "+A[size-1]);
	System.out.println("Minimum value is : "+A[0]);
	System.out.println("======================");
	
    } 
    
    
    static void display(int[] B) { 	
		for (int i=0; i<B.length; i++) {
			System.out.println("array value:"+i+":"+B[i]);
		}
    }
    

    static int findMaximum(int[] B) {
    	
    	int Max = B[0];
    	
    	for( int count = 0; count < B.length ;count++ ) {
    		if(B[count] > Max) {
    			Max = B[count];
    		}
  
    	}
	return Max; 
    }

    static int findMinimum() {
    	
    	int Min = A[0];
    	
    	for( int count = 0; count < size ;count++ ) {
    		if(A[count] < Min) {
    			Min = A[count];
    		}
  
    	}
	return Min;
    }

    
    static void selectionSort(int[] B) {

    	Arrays.sort(A);
    	
    }	
	
}
