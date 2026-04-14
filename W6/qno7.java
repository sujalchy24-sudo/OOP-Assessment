package W6;
import java.util.*;
public class qno7 {
	public static void main(String[] args) {
		Deque<String> job = new ArrayDeque<>();
		
		job.add("Document 1");
		job.add("Document 2");
		job.add("Document 3");
		System.out.println(job);
		
		job.remove();
		System.out.println(job);
		
		job.add("Document 4");
		job.add("Document 5");
		System.out.println(job);
		
		System.out.println(job.peek());
		System.out.println(job);
	}
}
