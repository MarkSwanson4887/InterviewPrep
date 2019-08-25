import java.util.Scanner;

class Ivy {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in); 

		System.out.println("Enter your first number Ivy!");
		int firstInt;
		firstInt = s.nextInt();

		System.out.println("Enter your second number Ivy!");
		int secInt;
		secInt = s.nextInt();

		System.out.println("Your Result is " + firstInt + secInt + "!");

	}
}