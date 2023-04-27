package ch06;

import java.nio.channels.Pipe;

public class GoldCustomer extends Customer {
	
	double salesRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		salesRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "Gold";
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price - (int)(price * salesRatio);
	}
	
	
	
	
}
