import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		int i;
		
		for(i=1; i<=t; i++) {
			
			int a = input.nextInt();
			int b = input.nextInt();
			int c = a+b;
			
			System.out.println("Case #"+ i + ": " + a +" + "+ b + " = " + c);
		}
		
	}
}