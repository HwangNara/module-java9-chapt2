package com.packt.sortstrings.app;

import com.packt.sortstrings.data.ShoppingBag;
import com.packt.sortstrings.input.UserInputUtil;

import java.util.logging.Logger;

public class Application {

    private static final Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        logger.info("Shopping Bag application: Started");

        ShoppingBag shoppingBag = new ShoppingBag();
        UserInputUtil userInputUtil = new UserInputUtil();
        String itemName;
        do {
            itemName = userInputUtil.getUserInput("Enter item (Type '" + ShoppingBag.END_TOKEN + "' when done): " );
            shoppingBag.addToBag(itemName);
        } while (!ShoppingBag.END_TOKEN.equals(itemName));
        userInputUtil.close();
        shoppingBag.prettyPrintBag();
        logger.info("Shopping Bag application: Completed");
    }
}