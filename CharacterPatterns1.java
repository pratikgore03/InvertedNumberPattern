package patterns_1;
import java.util.Scanner;

public class CharacterPatterns1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N =s.nextInt();
		int i=1;
		int t=1;
		while(i<=N) {
			int j=1;
			char c=(char)('A'+i-1);
			while(j<=N) {
				
				
				System.out.print(c);
				 c= (char)(c + 1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
