package tns_java;

public class Nto1 {
	static void Nto1(int n) {
		if(n==0)
			return;
		System.out.print(n+" ");
		Nto1(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 4;
        Nto1(4);
	}

}
