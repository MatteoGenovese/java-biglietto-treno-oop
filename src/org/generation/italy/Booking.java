package org.generation.italy;

import java.util.Scanner;

public class Booking {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Insert km:");
		int km = sc.nextInt();
		
		System.out.print("Insert age:");
		int age = sc.nextInt();
		
		
		System.out.println("START");
		
		try {
		
			Ticket newTicket= new Ticket(km, age);
			
			System.out.println(newTicket);

			
		
		}
		catch (Exception e) {

			System.err.println(e.getMessage());
		}
		
		System.out.println("END");
	}

}
