import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int x = input.nextInt();
		int i;

	
		for(i=1; i<=n; i++) {
			int num = input.nextInt();
			
			if(num<x) {
				System.out.print(num+" ");
			}
				
		}
			
	}
}