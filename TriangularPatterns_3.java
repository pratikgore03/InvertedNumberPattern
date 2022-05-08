package patterns_1;

import java.util.Scanner;

public class TriangularPatterns_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int N = s.nextInt();
	    int i =1;
	    int t= 1;
	    while(i<=N ) {
	    	int j = 1;
	    	
	    	while( j<=i ) {
	    		System.out.print(t);
	    		t++;
	    		j++;
	    	}
	    	System.out.println();
	    	i++;
	    }

	}

}
