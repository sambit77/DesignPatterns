package com.example.designpatterns.decoratorpattern.wafflemaker.waffle_decorator.chocolate;

import com.example.designpatterns.decoratorpattern.wafflemaker.waffle_dough.BaseWaffle;

public class Caramel extends BaseChocolate {

    public Caramel(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 2.0;
    }

    public String getDescription() {

        return baseWaffle.getDescription() + " , Caramel ";
    }
}
