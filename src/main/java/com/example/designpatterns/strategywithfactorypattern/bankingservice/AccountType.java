package com.example.designpatterns.strategywithfactorypattern.bankingservice;

public enum AccountType {
    SAVING (4.0d), CURRENT (2.0d), STANDARD_MONEY_MARKET(6.0d);

    private double rate;

    AccountType(final double rate) {
    this.rate = rate;
    }

    public double getRate() {
    return rate;
    }

}
