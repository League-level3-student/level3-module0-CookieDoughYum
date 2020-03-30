package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		print();
		ReversePrint();
		OddPrint();
		RandomPrint();
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void print() {
		String[] array = {"cat", "dog", "hamster", "snake"};
	      for(int i=0; i<array.length; i++) {
	    	  System.out.println(array[i]);
	      }
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void ReversePrint() {
		String[] array = {"cat", "dog", "hamster", "snake"};
	      for(int i=array.length-1; i>=0; i--) {
	    	
	    	  System.out.println(array[i]);
	      }
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void OddPrint() {
		String[] array = {"cat", "dog"
				+ "", "hamster", "snake"};
	      for(int i=0; i<array.length; i++) {
	    	  if(i%2==0) {
	    	  System.out.println(array[i]);
	    	  }
	      }
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different orde
	static void RandomPrint() {
	String[] s = {"cat", "dog", "hamster", "snake"};
	ArrayList<String> list= new ArrayList<String>(Arrays.asList(s));
	Random r = new Random();

	while(list.size()>0){
	    int index = r.nextInt(list.size());
	    System.out.println(list.get(index));
	    list.remove(index);
	}

	}
}
