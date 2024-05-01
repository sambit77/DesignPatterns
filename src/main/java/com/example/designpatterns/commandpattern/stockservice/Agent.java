package com.example.designpatterns.commandpattern.stockservice;


import java.util.ArrayList;
import java.util.List;

   public class Agent {
  
   List<Order> orders;

   public Agent()
   {
      this.orders = new ArrayList<>();
   }
   public void placeOrder(Order order){
      orders.add(order);
   }


   public void processOrders(){
   for(Order order : orders)
   {
      order.execute();;
   }
   orders.clear();
    
   }
}
