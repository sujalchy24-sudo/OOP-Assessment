package W6;
import java.util.*;

public class qno5 {
public static void main(String[] args) {
		
		Stack<String> task = new Stack<>();
		
		task.push("Read");
		task.push("Write");
		task.push("Code");
		
		System.out.println(task);
		
		task.pop();
		System.out.println(task);
		
		task.push("Debug");
		task.push("Test");
		System.out.println(task);
		
		String top = task.peek();
		System.out.println(task);
		
		System.out.println(task);
	}
}
