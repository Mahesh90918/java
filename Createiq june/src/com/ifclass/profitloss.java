package com.ifclass;

public class profitloss {
	public static void main(String[] args) {
		int sp = 1000;
		int cp = 300;
		int profit;
		int loss = cp - sp;
		if (sp > cp) {
			profit = sp - cp;
			System.out.println("profit  :" + profit);
		} else if (cp > sp) {
			loss = cp - sp;
			System.out.println("loss  :" + loss);
		} else {
			System.out.println("no profit and loss");
		}

	}
}