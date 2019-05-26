package day5;

interface Pair {
    int pair(int a , int b);
}

interface Cons {
	 Pair cons();
}

public class Answer5 {

	
	
	 public static void main(String args[]){
		
		 
		 Pair left = (a,b) -> {
			 return b;
		 };		
		 
		 Pair right = (a,b) -> {
			 return a;
		 };	
		 
		 Cons car = () -> {
			return left;
			 
		 };
		 
		 Cons crd = () -> {
			return right;
				 
		};
		
		System.out.println(car.cons().pair(3, 4));
			 
		System.out.println(crd.cons().pair(3, 4));	 
		 
		 
	 }
}
