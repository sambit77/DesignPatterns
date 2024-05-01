package com.example.designpatterns.strategywithfactorypattern.bankingservice;

public interface InterestCalculationStrategy {  
    double calculateInterest(double principal, double rate, int term);
}
