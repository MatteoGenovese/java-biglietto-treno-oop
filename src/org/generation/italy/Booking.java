package org.generation.italy;

import java.util.Scanner;

public class Booking {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Insert km:");
		String kmStr = sc.nextLine();
		int km = Integer.parseInt(kmStr);
		
		System.out.print("Insert age:");
		String ageStr = sc.nextLine();
		int age = Integer.parseInt(ageStr);
		
		
		System.out.print("Is date flexible: (y/n)");
		String isDateFlexible = sc.nextLine();
		
		
		System.out.println("START");
		
		try {
		
			Ticket newTicket= new Ticket(km, age, isDateFlexible);
			
			System.out.println(newTicket);

			
		
		}
		catch (Exception e) {

			System.err.println(e.getMessage());
		}
		finally {
			sc.close();
		}
		
		System.out.println("END");
	}

}
