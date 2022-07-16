import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			h.add(input.nextInt() % 42);
		}
        
		System.out.print(h.size());
	}
}