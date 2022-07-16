import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
 
		String num[] = new String[input.nextInt()];
 
		for (int i = 0; i < num.length; i++) {
			num[i] = input.next();
		}
		
		for (int i = 0; i < num.length; i++) {
			
			int count = 0;	
			int sum = 0;	
			
			for (int j = 0; j < num[i].length(); j++) {
				
				if (num[i].charAt(j) == 'O') {
					count++;
				} 
				else {
					count = 0;
				}
				sum += count;
			}
			
			System.out.println(sum);
		}
	}
}