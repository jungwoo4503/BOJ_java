import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = input.nextInt();
		}
		
		int max = num[0];
		int min = num[0];
		
		for(int i=0; i<n; i++) {
			if(max>num[i]) {
				max = num[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(min<num[i]) {
				min = num[i];
			}
		}
		
		System.out.println(max + " " + min);
	
	}
}