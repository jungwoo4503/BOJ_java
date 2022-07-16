import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner input = new Scanner(System.in);
 
		double num[] = new double[input.nextInt()];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = input.nextDouble();
		}
		
		double sum = 0;
		Arrays.sort(num);
		
		for(int i = 0; i < num.length; i++) {
			sum += ((num[i] / num[num.length-1]) * 100);
		}
		System.out.print(sum / num.length);
	}
}
