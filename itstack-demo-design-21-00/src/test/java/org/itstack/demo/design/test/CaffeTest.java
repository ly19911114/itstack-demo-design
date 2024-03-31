package org.itstack.demo.design.test;

import org.itstack.demo.design.teacoffice.CaffeineBeverageWithHook;
import org.itstack.demo.design.teacoffice.CoffeeWithHook;
import org.junit.Test;

public class CaffeTest {



    @Test
    public void test_Caffe() {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
