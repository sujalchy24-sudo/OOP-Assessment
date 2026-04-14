package W6;
import java.util.*;

public class qno4 {
public static void main(String[] args) {
		
		LinkedList <String> color = new LinkedList<>(List.of("Red"));
		
		Collections.addAll(color, "Blue","White","Yellow","Red");
		
		Collections.shuffle(color);
		
		Iterator<String> a = color.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
	}
}
