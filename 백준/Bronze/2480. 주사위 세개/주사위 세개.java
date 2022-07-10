import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a==b && a==c && b==c) {
			System.out.println(10000+a*1000);
		}
		
		else if(a==b || a==c) {
			System.out.println(1000+a*100);
		}
		else if(b==c) {
			System.out.println(1000+b*100);
		}
		else {
			System.out.println(Math.max(a, Math.max(b, c))*100);
		}
				
	}
}