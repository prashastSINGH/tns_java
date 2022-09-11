package tns_java;
public class sumOfN {
 static int sumOfN(int n){
 if(n ==0)
  return 0;
  
  return n + sumOfN(n -1);
 
 }
 public static void main(String [] args) 
    {
    	int n = 4;

    	System.out.print(sumOfN(n));
        
    }
 
}

