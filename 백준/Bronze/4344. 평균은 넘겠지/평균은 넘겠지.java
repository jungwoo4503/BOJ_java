import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] num;
		
		int testcase = input.nextInt();
		
		for(int i = 0 ; i < testcase ; i++) {
 
			int N = input.nextInt(); 
			num = new int[N];
			
			double sum = 0;	 
			
			for(int j = 0 ; j < N ; j++) {
				int val = input.nextInt();	 
				num[j] = val;
				sum += val;	 
			}
			
			double mean = (sum / N) ;
			double count = 0; 

			for(int j = 0 ; j < N ; j++) {
				if(num[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
			
		}
	}
	
}