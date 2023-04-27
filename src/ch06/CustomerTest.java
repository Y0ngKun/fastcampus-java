package ch06;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		
	
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer cT = new Customer(1,"tomas"); 
		Customer cJ = new Customer(2,"will"); 
		Customer cK = new GoldCustomer(3,"james"); 
		Customer cP = new GoldCustomer(4,"ana"); 
		Customer cY = new VIPCustomer(5,"kwon");
		
		customerList.add(cT);
		customerList.add(cJ);
		customerList.add(cK);
		customerList.add(cP);
		customerList.add(cY);
		
//		for(Customer cus : customerList) {
//			System.out.println(cus.showCustomerInfo());
//		}
//		
//		int price = 10000;
//		for(Customer cus : customerList) {
//			int cost = cus.calcPrice(price);
//			System.out.println(cus.getCustomerName()+"님의 가격은 "+cost);
//			System.out.println(cus.getCustomerName()+"님의 포인트는 "+cus.bonusPoint);
//		}
		
		if(cP instanceof GoldCustomer) {
			GoldCustomer vc = (GoldCustomer) cP;
			System.out.println(cP.showCustomerInfo());
		}
	}
}
