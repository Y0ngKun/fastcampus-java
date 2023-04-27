package ch04;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customerKim = new Customer(1, "김실버");
		customerKim.bonusPoint = 1000;
		int price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + " 가격은 " + price + "원 입니다.");
		
		VIPCustomer customerKwon = new VIPCustomer(777, "권용건");
		price = customerKwon.calcPrice(1000);
		customerKwon.bonusPoint = 9999;
		System.out.println(customerKwon.showCustomerInfo() + " 가격은 " + price + "원 입니다.");
		
		Customer vc = new VIPCustomer(12345, "가상메서드 테스트");
		System.out.println(vc.calcPrice(1000));
	
	}
}
