package W6;
import java.util.*;
public class qno2 {
public static void main(String[] args) {
		
		LinkedList <Integer> number = new LinkedList<>();
		
		number.add(4);
		number.add(5);
		number.addFirst(2);
		number.addLast(3);
		
		System.out.println(number);
			if (number.isEmpty()) {
				System.out.println("The list is Empty");
			}
		}
}
