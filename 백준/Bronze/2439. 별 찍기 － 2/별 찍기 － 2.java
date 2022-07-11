import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int i;
		int j;
		int k;
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=n-i; j++) {
				System.out.print(" ");
				
			}
			for(k=1; k<=i; k++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}