import java.util.*;

class apples{
	public static void main(String args[]) {
		
		final Formatter x;
		
		try {
			x = new Formatter("fred.text");
			System.out.println("you crested a file");
		}
		catch(Exception e) {
			System.out.println("you got an error");
		}
		
    }
}
