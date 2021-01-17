
import java.util.*; 
public class FlipPancake {
  
public static void main(String[] args){ 
        
		System.out.print("Input the N number of pancakes "
				+ "followed by the pancakes: ");
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
	
		ArrayStack fp = new ArrayStack(x);
		for(int i = 0; i < x; i++ ) {
			int y = kb.nextInt();
			fp.push(y);
		}
		
		
		System.out.print("Pancake Stack Size: " + fp.size() + " ( ");
		//fp.size();
		fp.PrintArray();
		System.out.print(")\n");
		
		fp.pancakeSort();
		System.out.println();
		
	
		////////////	////////////	////////////	////////////
		/*
		System.out.println("\n");
		System.out.print("Input a New number of pancakes "
				+ "followed by the pancakes: ");
		
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
	
		
		ListStack<Integer> list = new ListStack<Integer>();
		for(int i = 0; i < x; i++ ) {
			int num = scan.nextInt();
			list.push(num);
		}
		
		
		list.sortPancake();
		System.out.println();
		*/
		
		
    } 
} 


