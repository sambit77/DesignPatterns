package com.example.designpatterns.decoratorpattern.wafflemaker.waffle_decorator.sauce;

import com.example.designpatterns.decoratorpattern.wafflemaker.waffle_decorator.BaseDecorator;
import com.example.designpatterns.decoratorpattern.wafflemaker.waffle_dough.BaseWaffle;

public abstract class BaseSauce extends BaseDecorator {

    public BaseWaffle baseWaffle;

    public BaseSauce(BaseWaffle waffleToDecorate){
        this.baseWaffle = waffleToDecorate;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getPrice() {
        return (this.baseWaffle.getPrice() + this.price);
    }
}
