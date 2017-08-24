package com.example.hp.mvpexample;

/**
 * Created by HP on 23-08-2017.
 */

public class TipsCalculator {
    private TipsCallback callback;

    public TipsCalculator(TipsCallback callback) {
        this.callback = callback;
    }

    public void Calculation(String value) {
        if (value.trim().length() > 0) {
            int tip = 10;
            int auxValue = Integer.parseInt(value);
            value = String.valueOf(auxValue * tip / 100);
            callback.sucess(value);
        } else {
            callback.blankinput();
        }
    }

}
