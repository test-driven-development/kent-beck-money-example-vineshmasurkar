package com.ibm.cloud.garage.kata.money;

public class Sum implements Expression {

	public Money augend;
	public Money addend;

	Sum(Money augend, Money addend) {
		this.augend = augend;
		this.addend = addend;
	}

	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount
				+ addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}

	@Override
	public Expression plus(Money addend) {
		return null;
	}
}
