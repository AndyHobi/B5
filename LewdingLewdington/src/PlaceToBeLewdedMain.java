import java.util.Scanner;

public class PlaceToBeLewdedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Begin LA 1\n============\n");
		
		Scanner kbd = new Scanner(System.in);

		String input;
		String string;
		System.out.println("who do you want to be lewded?");
		string = kbd.nextLine();
		LewdingClass.lewd(string);
		
		
		
		int rows = 0;
		int columns = 0;
		
		System.out.println("Enter number of rows in range [5, 20]:"); 
		
		while(true) {
			
		
			input = kbd.nextLine();
			
			try {
				rows = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Input must be an integer. Re-enter:");
				continue;
			}
			
			if(rows < 5 || rows > 20) {
				System.out.println("Invalid Input!");
				System.out.println("Enter number of rows in range [5, 20]:");
			} else { break; }
		
		} 
		
		System.out.println("Enter number of columns in range [5, 20]:"); 
		System.out.println("This must be different from number of rows:");
		
		while(true) {
				
			input = kbd.nextLine();
			
			try {
				columns = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Input must be an integer. Re-enter:");
				continue;
			}
			
			if(columns < 5 || columns > 20) {
				System.out.println("Invalid Input!");
				System.out.println("Enter number of columns in range [5, 20].");
				System.out.println("This must be different from number of rows:");
				continue;
			} else if(columns == rows) {
				System.out.println("Number of columns is the same as number of rows!");
				System.out.println("Enter number of columns in range [5, 20].");
				System.out.println("This must be different from number of rows:");
				continue;
			}
			
			break;
		} 
		
		ProcessArray arr = new ProcessArray(columns,rows);
			
		arr.randomlyFillArray();
		arr.computeArrayValues();
		
		System.out.println();
		System.out.println("Initial array with random numbers:");
		System.out.println();
		ProcessArray.printArray(arr.getFirstArray());
		
		System.out.println();
		System.out.println("Computed array:");
		System.out.println();
		ProcessArray.printArray(arr.getSecondArray());
		
		kbd.close();
		
		System.out.println();
		System.out.println("============");
		System.out.println("End LA 1");
		}
		
	}

