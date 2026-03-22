package com.learning.day4;

public class InsufficientBalanceException extends RuntimeException {
    /*
    We extend RuntimeException because these are unchecked exceptions caused by invalid input or state, and
    we don’t want to force the caller to handle them explicitly

    🔹 Exception (Checked)
	•	Must be handled or declared
	•	Used for:
	•	file I/O
	•	database
	•	network
     */

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
