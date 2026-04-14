package W6;
import java.util.*;
public class qno13 {
public static void main(String[] args) {
		
		ArrayList <String> color = new ArrayList<>(List.of());
		
		Collections.addAll(color, "Red","Blue","White", "Green", "Yellow");
		
		System.out.println("Normal:");
		System.out.println(color);
		
		Collections.sort(color);
		
		System.out.println("Sorted");
		System.out.println(color);
		
		Collections.reverse(color);
		
		System.out.println("Reversed:");
		System.out.println(color);
	}
}
