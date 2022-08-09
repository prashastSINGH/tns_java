package tns_java;

public class oneton {
	static void printToN(int n)
	{
		if(n == 0)
			return;
		
		printToN(n - 1);

		System.out.print(n+" ");

	}
    public static void main(String [] args) 
    {
    	int n = 4;

    	printToN(n);
        
    }
}
