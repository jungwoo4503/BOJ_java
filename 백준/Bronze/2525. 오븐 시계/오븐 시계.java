import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int hour = input.nextInt();
		int min = input.nextInt();
		int C = input.nextInt();
		
		int x = hour*60 + min + C;
		hour = x / 60;
		min = x % 60;
		
		if(hour>=24) {
			hour=hour-24;
		}
		
		System.out.println(hour+" "+min);
		
		
	}
}