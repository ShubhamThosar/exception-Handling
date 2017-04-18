package Assignment;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("enter custno");
			c.setCustNo(s.next());
			System.out.println("enter customer name");
			c.setCustName(s.next());
			System.out.println("enter category");
			c.setCategory(s.next());
			System.out.println(c);
			
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
