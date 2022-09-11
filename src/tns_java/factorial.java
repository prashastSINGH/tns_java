package tns_java;
// using recursion
public class factorial {
	static int factorial(int n, int i) {
		if (n == 0 || n == 1)
			return i ;
			
		return factorial(n-1, n*i);
		
		
	}
	 public static void main(String [] args) 
	    {
	   

	    	System.out.print(factorial(6,1));
	        
	    }

}
