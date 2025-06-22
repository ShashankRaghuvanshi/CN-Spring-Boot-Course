package com.paymenow.PayMeNow;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PayMeNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayMeNowApplication.class, args);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter payment amount");
		int amount = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter payment method (CreditCard, PayPal, or BankTransfer) ");
		
		String paymentMethod= null;
		String choice = sc.nextLine();
		
		switch(choice) {
			case "CreditCard" -> {
				paymentMethod = "creditCardPaymentService";
				break;
			}
			case "PayPal" -> {
				paymentMethod = "payPalPaymentService";
				break;
			}
			case "BankTransfer" -> {
				paymentMethod = "bankTransferPaymentService";
				break;
			}
			default -> {
				System.out.println("Invalid");
				break;
			}
		}
		
		PaymentService paymentService = context.getBean(paymentMethod, PaymentService.class);
		
		paymentService.setPaymentAmount(amount);
		
		paymentService.processPayment();
		
		
		sc.close();
		context.close();
	}

}
