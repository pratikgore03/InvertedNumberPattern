package patterns_1;

import java.util.Scanner;

public class SquarePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Integer N (Total no. of rows) = ");
        int N = s.nextInt();
        int i = 1;
        while(i<=N) {
        	int j =1;
        	while(j<=N) {
        	System.out.print("* ");
        	j++;
        	}
        	System.out.println();
        	i++;
        }
        

	}

}
