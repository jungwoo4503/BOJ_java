import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int sum = 0;
		int i;
		
		for(i=1; i<=n; i++) {
			sum = sum += i;				
		}
		System.out.println(sum);
	}
}