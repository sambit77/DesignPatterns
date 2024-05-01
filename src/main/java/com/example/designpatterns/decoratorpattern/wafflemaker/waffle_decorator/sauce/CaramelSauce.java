package com.example.designpatterns.decoratorpattern.wafflemaker.waffle_decorator.sauce;

import com.example.designpatterns.decoratorpattern.wafflemaker.waffle_dough.BaseWaffle;

public class CaramelSauce extends BaseSauce {

    public CaramelSauce(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 1.00;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Caramel Sauce ";
    }
}
