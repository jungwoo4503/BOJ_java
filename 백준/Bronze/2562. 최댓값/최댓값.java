import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[9];
		int index = 0;
		int max = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = input.nextInt();
		}
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) 
			{
				max = num[i];
				index = i+1;
			}
					
		}
		
		System.out.println(max);
		System.out.println(index);
	
	}
}