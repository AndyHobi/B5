import java.util.Scanner;

public class PlaceToBeLewdedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = new String();
		System.out.println("Who do you want lewded?");
		string = scan.nextLine();
		LewdingClass.lewd(string);
		

	}

}
