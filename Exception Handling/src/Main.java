import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		try {
			
			System.out.println("Enter a whole number to divide:");
			int x = scanner.nextInt();
			System.out.println("Enter a number to divide by:");
			int y = scanner.nextInt();
			int z = x/y;
			System.out.println("result: "+z);
			
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("You can't divide by zero! IDIOT!");
			
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a number OMFG!!!!");
		}
		catch(Exception e) {
			System.out.println("Something went wrong?");
		}
		finally {
			scanner.close();
		}
	}

}
