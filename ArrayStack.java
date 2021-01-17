import java.util.EmptyStackException;

public class ArrayStack implements Stack { 
	
	private int array[];
	private int size = 0;
	private int x;
	private int [] counter;
	int npCounter = 0 , flipCounter = 0;
	
	public ArrayStack() {
		
	
	}
	
	public ArrayStack(int capacity) {
		array = new int[capacity];
		counter = new int[capacity];
		size  = 0;
		
	}
	
	private void resize() {
		int[] newElements = new int[2 * size];
		
		for (int i = 0; i < size; i++) {
			newElements[i] = array[i];
		}
		array = newElements;
	}
	///
	public void push ( int value){ 
	
		if (size == array.length) {
			resize();
		}
		array[size] = value;
		size++;
		
	}
	//////
	public int pop(){
		if (size == 0) {
			throw new EmptyStackException();
		}
		
		int top = array[size - 1];
		array[size - 1] = 0;
		size--;
		return top;
	}
	
	
	//////
	public boolean isEmpty() {
		return size == 0;
	}

	////
	public int size() {
			return size;
	}

	////
	public int top() {
			if (size == 0) 
			throw new EmptyStackException();
	
		return array[size - 1];
	}

	
	////
	public void PrintArray() {
		for( int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}	
	}

	public void set(int x) {
		this.x = x;
	}
	
	public int counter(int n) { 
		int x = 0;
		for(int i = 0 ; i < counter.length; i++ ) {
			x = counter[i];
		}
		return x; 
		
		
		//how would this work so lets say with a max function you are able to count the number of switches
		//because depending on where the max number is the counter will go count the distance therefore deciding upon 
		//how many switches it has done. It gets complicated when there are multiple swaps to be done on paper.However, much
		//more complicated to write code for. So my thought process is implementing n amount of switches where that 
		//would decide how many pancake flips on a single take. That would be the 
		//only way to get to return into an array how many flips it has made per iteration. 
		//So after every iteration what would happen would be that the 
		//number of flips would then be recorded into a different array to be 
		//returned at the end. 
		//SO how do you flip an N amount of numbers and in what order 
		//obviously i will need a check method that would make sure the numbers are in order at 
		//the end. My issue is that how will it know which switch and what amount of integers it should  flip.
		//Unless it is a guess an check code where essentially every iteration is checked to see if it  
		//runs in order 
		
	}
	
	public void pancakeSort() 
    { 
		for( int i = 0; i < array.length; i++) { // iterates through the whole array [ ends lets say 5 ] 0 - not counting 5;
			
			for(int j = 0; j < (array.length-1); j++) { // iterates from the beginning but it ends at 				
										// array length - 1;         [ ends at 4; so 0 - not counting 4 
				npCounter = 0;
				
				
				if(array[i] < 0 ) array[i] *= -1; 
				
				int k = j+1;
				int a = array[j];
				int b = array[k];
				
				flipCounter = 0; 
				 if( b < a ) {
					
					int temp = a;
					int temp1 = b;
					array[j] = b;
					array[k] = a;
					flipCounter++;
				}
				 if(npCounter == flipCounter) {
					 counter[i] = 2;
						
						
					}else
					if(npCounter != flipCounter) {
						counter[i] = 1;	
						
					}	
			 
			}//end  of inner loop
		
		}//end of outside loop 
		
		System.out.print("Counter Length: " + counter.length + " | Number of Pancake Flips( " );
		for( int d = 0; d < counter.length; d++) {
			System.out.print(counter[d] + " ");
		}
		
		System.out.print(")\n\nArray Length: " + array.length + " " 
					+ " | Sorted Array: ");
		for( int e = 0; e < array.length; e++) {
			System.out.print(array[e] + " ");
		}
		
    }// closing bracket 
 ////////////////////////////////////////////////////////////////////////

	@Override
	public void push(Object e) {
		// TODO Auto-generated method stub
		
	}

	


	
}

