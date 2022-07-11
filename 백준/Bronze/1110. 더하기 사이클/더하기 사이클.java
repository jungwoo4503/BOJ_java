import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int count = 0; 
		int copy = n;
		
		while(true) {
			n = ((n%10) * 10) + (((n/10)+(n%10)) %10);
			count++;
			
			if(copy==n) {
				break;
			}
		}
		
		System.out.println(count);
		
		
	
	}
}