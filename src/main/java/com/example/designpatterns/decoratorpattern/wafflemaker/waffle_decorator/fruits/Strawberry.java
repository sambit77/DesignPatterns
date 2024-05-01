package com.example.designpatterns.decoratorpattern.wafflemaker.waffle_decorator.fruits;

import com.example.designpatterns.decoratorpattern.wafflemaker.waffle_dough.BaseWaffle;

public class Strawberry extends BaseFruit {

    public Strawberry(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 0.5;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Strawberry ";
    }

}
