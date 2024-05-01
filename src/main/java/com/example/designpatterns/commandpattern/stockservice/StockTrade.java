package com.example.designpatterns.commandpattern.stockservice;

public class StockTrade {
	
    public void buy(String stockName, int numShares){
       System.out.println("Stock [ Name: "+stockName+", Quantity: " + numShares +" ] bought");
    }
    public void sell(String stockName, int numShares){
       System.out.println("Stock [ Name: "+stockName+", Quantity: " + numShares +" ] sold");
    }
 }
 
