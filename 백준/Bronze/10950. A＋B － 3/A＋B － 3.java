import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();		
		int i;
		
		for(i=0; i<t; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			System.out.println(a+b);
		}
	}
}