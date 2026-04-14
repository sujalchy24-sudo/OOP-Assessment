package W6;
import java.util.*;

public class qno1 {
	public static void main(String[] args) {
		ArrayList <String> students = new ArrayList<>();
		
		students.add("Sujal");
		students.add("Ghimire");
		students.add("Sanjam");
		students.add("Ujwal");
		students.add("Saugat");
		
		students.remove(1);
		
		System.out.println(students);
	}
}
