package Assignment;

import java.util.Scanner;


public class ArrayException

{
	public static void main(String[] args) 
	{
		int arr[] = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter number");


		try {
			for(int i=0; i<10; i++)

			{
				arr[i] = s.nextInt();

			}
			System.out.println(" array is"+arr[12]);
			for(int i=0; i<10; i++)
			{
				System.out.println(" array is"+arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("error: arrray consists only 10 elements");
		}
	}

}

