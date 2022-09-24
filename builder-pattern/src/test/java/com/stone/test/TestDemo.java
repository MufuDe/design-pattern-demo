package com.stone.test;

import com.stone.builder.MealBuilder;
import com.stone.entity.Meal;
import org.junit.Test;

public class TestDemo {

    @Test
    public void test() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost() + " .");

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("No Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost() + " .");
    }
}
