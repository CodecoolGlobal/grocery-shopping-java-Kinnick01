package com.codecool.groceryshopping.service;

import java.io.BufferedReader;

public class ShoppingUI {

    private static final String BUY_COMMAND = "buy";
    private static final String LIST_COMMAND = "list";
    private final BufferedReader br;

    public ShoppingUI(BufferedReader br) {
        this.br = br;
    }

    /**
     * Use `br.readLine().strip();` to read a "line" from the console input
     *
     * Prompt text: "Put an item in your cart or type 'buy' to see the check: "
     * Error text: "You've tried to add an invalid product, please try again! Type 'list' to see your options."
     */

    /**
     * Pretty printed cart example
     *
     * Your cart
     *           product           :  quantity  :  net unit  : net total  :  tax rate  : tax total  : gross total
     * ----------------------------------------------------------------------------------------------------------
     * "Pampas" T-bone steak       :    6  pcs  : 1500 coins : 9000 coins :     18%    : 1620 coins : 10620 coins
     * "Gnutella" monster box      :    1  pcs  :  300 coins :  300 coins :     25%    :   75 coins :   375 coins
     * "Petito" chips              :    7  pcs  :  200 coins : 1400 coins :     15%    :  210 coins :  1610 coins
     * "White Noise" rice crackers :    5  pcs  :  100 coins :  500 coins :     15%    :   75 coins :   575 coins
     * "Porky Pork" sausage        :    1  pcs  :  300 coins :  300 coins :      3%    :    9 coins :   309 coins
     * ----------------------------------------------------------------------------------------------------------
     * Total price: 13489 coins
     *
     */
}
