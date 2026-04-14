package W6;
import java.util.*;
public class qno14 {
public static void main(String[] args) {
		
		ArrayList <Integer> binary = new ArrayList<>(List.of());
		
		Collections.addAll(binary, 1,2,3,4,5,6,7,8,9,10);
		
		int result = Collections.binarySearch(binary,7);
		
		System.out.println("Index: "+result);
	}
}
