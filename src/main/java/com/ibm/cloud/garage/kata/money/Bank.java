package com.ibm.cloud.garage.kata.money;

public class Bank {
	public Money reduce(Expression source, String to) {
		Sum sum = (Sum) source;
		return sum.reduce(to);
	}
}
