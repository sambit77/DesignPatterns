package com.example.designpatterns.strategywithfactorypattern.bankingservice;

public class SimpleInterest implements InterestCalculationStrategy{
    @Override
    public double calculateInterest(final double principal, final double rate, final int term) {
    return ((principal * term * rate) / 100);
    }

    @Override
    public String toString() {
    return "Simple Interest";
    }
}
