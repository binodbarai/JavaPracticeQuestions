import java.util.Scanner;

public class inputOutput{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		// input of integer
		System.out.println("Enter an Integer");
		int a = in.nextInt();
		System.out.println("You entered: "+a);
		// input of float
		System.out.println("Enter an Float");
		float f = in.nextFloat();
		System.out.println("You entered: "+f);
		//input of byte 
		System.out.println("Enter an byte");
		byte b = in.nextByte();
		System.out.println("You entered: "+b);
		//input of string
		System.out.println("Enter your name: ");
		String name = in.nextLine();
		System.out.println("You entered: "+name);
		// we must close the scanner object
		in.close();
	}
}