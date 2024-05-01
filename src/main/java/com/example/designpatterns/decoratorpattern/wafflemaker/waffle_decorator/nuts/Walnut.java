package com.example.designpatterns.decoratorpattern.wafflemaker.waffle_decorator.nuts;

import com.example.designpatterns.decoratorpattern.wafflemaker.waffle_dough.BaseWaffle;

public class Walnut extends BaseNuts {

    public Walnut(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 1.00;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Walnut ";
    }
}
