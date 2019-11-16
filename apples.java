class apples{
	public static void main(String args[]) {
		int age;
		age = 6;
		
		switch (age) {
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3,4,5,6,7:
			System.out.println("You can get in trouble");
			break;
		default:
			System.out.println("I don't know how old you are");
			break;
		}
	}
}
