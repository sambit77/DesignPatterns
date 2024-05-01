package com.example.designpatterns.decoratorpattern.wafflemaker.waffle_decorator.chocolate;

import com.example.designpatterns.decoratorpattern.wafflemaker.waffle_decorator.BaseDecorator;
import com.example.designpatterns.decoratorpattern.wafflemaker.waffle_dough.BaseWaffle;

public abstract class BaseChocolate extends BaseDecorator {

    public BaseWaffle baseWaffle;

    public BaseChocolate(BaseWaffle waffleToDecorate){
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
