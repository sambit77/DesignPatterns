package com.example.designpatterns.decoratorpattern.wafflemaker.waffle_decorator.fruits;

import com.example.designpatterns.decoratorpattern.wafflemaker.waffle_dough.BaseWaffle;

public class Pineapple extends BaseFruit {

    public Pineapple(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 0.5;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Pineapple ";
    }
}