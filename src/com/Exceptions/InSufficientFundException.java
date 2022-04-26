package com.Exceptions;

// Checked -> Exception
// Unchecked (runtime) -> Runtime Exception

public class InSufficientFundException extends Exception {
    public InSufficientFundException() {
        super("Insufficient balance in your account. ");
    }

    public InSufficientFundException(String message) {
        super(message);
    }
}
