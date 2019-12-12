import java.util.*;
public class bucky {
	public static void main(String args[]) {
		
		//create an array and convert to lsit
		Character[] ray = {'p', 'w', 'n'};
		List<Character> l = Arrays.asList(ray);
		System.out.println("List is : ");
		output(l);
		
		
		//reverse and print out the lsit
		Collections.reverse(l);
		System.out.println("After reverse : ");
		output(l);
		
		//createa new array and a new lsit
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		//copy contents of list into lsitcopy
		Collections.copy(listCopy, l);
		System.out.println("Copy of list : ");
		output(listCopy);
		
		//fill collection with crap
		Collections.fill(l, 'X');
		System.out.println("After filling the lsit : ");
		output(l);
	}
	private static void output(List<Character> thelist) {
		
		for(Character thing: thelist) {
			System.out.printf("%s ", thing);
		}
		System.out.println();
	}
	
}
