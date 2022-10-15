package com.ifclass;

public class currntbill {
public static void main(String[] args) {
	int units=100;
	double amount,totalamount,servicecharge;
	if(units<=50) {
		amount=units*0.50;
		System.out.println("Amount  :"+amount);
	}else if((units>=51)&&(units<=100)) {
		amount=25+(units*0.75);
		System.out.println("Amount  :"+amount);
	}else if((units>=101)&&(units<=500)) {
		amount=250+(units*3.50);
		System.out.println("Amount  :"+amount);
	}else {
		amount=220+(units*3.50);
		System.out.println("amount  ;"+amount);
	}
		servicecharge=amount*0.20;
		totalamount=amount+servicecharge;
		System.out.println("total amount  :"+totalamount);
	}
}
