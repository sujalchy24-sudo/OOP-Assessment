package W6;
import java.util.*;
public class qno6 {
public static void main(String[] args) {
		
		Stack <String> word = new Stack<>();
		
		word.push("Hello");
		word.push("Universe");
		System.out.println(word);
		
		List<String> reverse = word.reversed();
		System.out.println(reverse);
	}
}
