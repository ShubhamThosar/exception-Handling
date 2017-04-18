package Assignment;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		Handle h = new Handle();
		System.out.println("Enter numerator");
		h.setNum(s.nextInt());
		System.out.println("Enter denominator");
		try {
			h.setDen(s.nextInt());
			h.Divide();
			
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
}
