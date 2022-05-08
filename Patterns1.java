package patterns_1;
import java.util.Scanner;
/**
 * @author prati
 *
 */
public class Patterns1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter a number n = ");
        int n = s.nextInt();
        int i = 1;
        while(i<=n) {
        	int j =1;
        	while(j<=n) {
        	System.out.print("*");
        	j++;
        	}
        	System.out.println();
        	i++;
        }
        
	}

}
