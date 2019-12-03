import java.io.File;;
class apples{
	public static void main(String args[]) {
		File x = new File("C:\\test\\fhkdjsf.txt");
		
		if (x.exists()) {
			System.out.println(x.getName() + "exist!");
		}else {
			System.out.println("this thing doestnt eisists");
		}
    }
}
