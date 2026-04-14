package W6;
import java.util.*;

public class qno3 {
public static void main(String[] args) {
		
		ArrayList <Integer> num = new ArrayList<>(List.of(1));
		
		Collections.addAll(num, 2,3,4,5,6);
		System.out.println(num);
		
		Collections.rotate(num, 2);
		
		System.out.println(num);
	}
}
