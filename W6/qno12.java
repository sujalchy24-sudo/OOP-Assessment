package W6;
import java.util.*;
public class qno12 {
public static void main(String[] args) {
		
		ArrayList <Integer> num = new ArrayList<>(List.of(69));
		
		Collections.addAll(num, 10,30,78,30);
		System.out.println("Normal");
		System.out.println(num);
		
		Collections.sort(num);
		System.out.println("Sorted:");
		System.out.println(num);
		
		Collections.reverse(num);
		System.out.println("Reversed:");
		System.out.println(num);
	}
}
