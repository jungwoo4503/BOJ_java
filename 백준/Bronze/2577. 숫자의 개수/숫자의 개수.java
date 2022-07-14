import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int num = a*b*c;
		int[] count = new int [10];
		
		while(num>0) {
			count[num%10]++;
			num/=10;
		}
		for(int i=0; i<10; i++) {
			System.out.println(count[i]);
		}
	
	}
}