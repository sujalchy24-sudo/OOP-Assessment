package W6;
import java.util.*;
public class qno9 {
public static void main(String[] args) {
		
		HashSet <String> set1 = new HashSet<>();
		
		set1.add("Dog");
		set1.add("Cat");
		set1.add("Elephant");
		set1.add("Lion");
		
		System.out.println("First Set:");
		System.out.println(set1);
		
		HashSet<String> set2 = new HashSet<>();
		
		set2.add("Cat");
		set2.add("Giraffe");
		set2.add("Dog");
		set2.add("Monkey");
		
		System.out.println("Second Set:");
		System.out.println(set2);
		
		System.out.println("Union:");
		System.out.println(performUnion(set1,set2));
		
		System.out.println("Intersection:");
		System.out.println(performIntersection(set1,set2));
		
		System.out.println("Difference:");
		System.out.println(performDifference(set1,set2));
		
	}
	
	public static HashSet<String> performUnion(HashSet<String> set1, HashSet<String> set2){
		HashSet<String> union = new HashSet<>(set1);
		union.addAll(set2);
		return union;
	}
	public static HashSet<String> performIntersection(HashSet<String>set1, HashSet<String> set2){
		HashSet<String> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		return intersection;
	}
	public static HashSet<String> performDifference(HashSet<String>set1, HashSet<String> set2){
		HashSet<String> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		return difference;
	}
}
