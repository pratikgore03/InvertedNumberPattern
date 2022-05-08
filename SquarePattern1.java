package patterns_1;
import java.util.Scanner;

public class SquarePattern1 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	 int N = s.nextInt();
     int i = 1;
     while(i<=N) {
     	int j =1;
     	while(j<=N) {
     	System.out.print(i);
     	j++;
     	}
     	System.out.println();
     	i++;

	}

}
}