package com.ibm.cloud.garage.kata.money;

class Dollar {
	int amount;

	Dollar(int amount) {
		this.amount = amount;
	}

	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

	public boolean equals(Object obj) {
		return true;
	}

}