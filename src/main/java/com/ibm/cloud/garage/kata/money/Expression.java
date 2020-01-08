package com.ibm.cloud.garage.kata.money;

public interface Expression {
	Expression plus(Money addend);

	Money reduce(Bank bank, String to);
}
