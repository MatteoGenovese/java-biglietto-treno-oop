package org.generation.italy;

import java.math.BigDecimal;

public class Ticket {
	
	private int km;
	private int age;
	private final static BigDecimal PER_KM_COST = new BigDecimal(0.21);
	private final static BigDecimal OVER_65_SAVING =new BigDecimal(0.4);
	private final static BigDecimal UNDER_18_SAVING = new BigDecimal(0.2);
	
	public Ticket(int km, int age) throws Exception {
		super();
		isValidKm(km);
		isValidAge(age);
	}
	
	public int getKm() {
		return km;
	}
	
	public void isValidKm(int km) throws Exception {
		
		if(km<=0)
		{
			throw new Exception("Invalid Value of Km: Real number > 0 is required"); 
		}
		this.km = km;
	}
	
	public int getAge() {
		return age;
	}
	
	public void isValidAge(int age) throws Exception {
		if(age<=0)
		{
			throw new Exception("Invalid Value of Age: Real number > 0 is required"); 
		}
		this.age = age;
	}
	
	public static BigDecimal getPerKmCost() {
		return PER_KM_COST;
	}

	public static BigDecimal getOver65Saving() {
		return OVER_65_SAVING;
	}

	public static BigDecimal getUnder18Saving() {
		return UNDER_18_SAVING;
	}

	public float getTicketPrice() {
		
		float FinalPrice=getKm()*getPerKmCost().floatValue();
		if(getAge()>65 || getAge()<18) {
			FinalPrice=getTicketPriceWithDiscout(FinalPrice);
			
		}
		return FinalPrice;
		
	}
	
	public float getTicketPriceWithDiscout(float ticketPriceWithoutDiscout) {
		if(getAge()>65)
		{
			return ticketPriceWithoutDiscout-ticketPriceWithoutDiscout*Ticket.OVER_65_SAVING.floatValue();
		}
		else {
			return ticketPriceWithoutDiscout-ticketPriceWithoutDiscout*Ticket.UNDER_18_SAVING.floatValue();
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nkm: "+getKm()+
				"\nage: "+getAge()+
				"\nprice:"+getTicketPrice();
	}
	
	
	

}
