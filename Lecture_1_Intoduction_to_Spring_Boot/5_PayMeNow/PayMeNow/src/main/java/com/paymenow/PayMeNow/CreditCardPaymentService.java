package com.paymenow.PayMeNow;

public class CreditCardPaymentService implements PaymentService {

	double paymentAmount;
	String paymentMethod = "credit card";
	
	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing " + this.paymentMethod+ " payment of $"+this.paymentAmount);;
	}

	@Override
	public void setPaymentAmount(double amount) {
		this.paymentAmount = amount;
	}

}
