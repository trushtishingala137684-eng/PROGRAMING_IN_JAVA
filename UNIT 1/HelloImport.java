import java.lang.*;
import java.util.Scanner;

class HelloImport
{
	public static void main(String args[])
	{
		int no1,no2,no3;

		System.out.println("enter no:");
		Scanner sc = new Scanner(System.in);
		no1 = sc.nextInt();

		System.out.println("enter no:");
		no2 = sc.nextInt();

		System.out.println("enter no:");
		no3 = sc.nextInt();

		System.out.println("total no is: " + (no1+no2+no3));
	}
}