import java.util.Scanner;
class apples{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int total, average, grade, counter;
		total = 0;
		counter = 0;
		
		while(counter < 10) {
			grade = input.nextInt();
			total += grade;
			counter++;
		}
		
		average = total/10;
		
		System.out.println("Your average is " + average);
	}
}
