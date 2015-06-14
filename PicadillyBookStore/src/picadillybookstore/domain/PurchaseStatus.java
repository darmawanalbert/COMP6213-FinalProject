package picadillybookstore.domain;

/**
 * PurchaseStatus.java
 * This file contains PurchaseStatus Enumeration
 * @author Albert Darmawan
 * @version 1.0
 * @since 2015-05-28
 */

public enum PurchaseStatus {
	// Enumerate the values that the enum can assume.
	success("Purchasing successful!"), 
	noStock("Purchasing failed! This book is not available anymore"), 
	creditCardInvalid("Purchasing failed! Your credit card is invalid!");

	// This represents the value of an enum instance.
	private final String value;

	// A "constructor" of sorts (used above).
	PurchaseStatus(String value) {
		this.value = value;
	}

	// Accessor for the value of an enum instance.
	public String value() {
		return value;
	}
}
