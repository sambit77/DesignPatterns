package com.example.designpatterns.commandpattern.stockservice;

public class BuyStockCommand implements Order {


    private StockTrade stockTrade;
    private String stockName;
    private int numShares;
   public BuyStockCommand(StockTrade abcStock, String stockName, int numShares){
     this.stockTrade = abcStock;
     this.stockName = stockName;
     this.numShares = numShares;
   }

   public void execute() {
     if(stockTrade != null)
     {
      stockTrade.buy(stockName, numShares);
     }
   }
 }
