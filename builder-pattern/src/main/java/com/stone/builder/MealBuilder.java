package com.stone.builder;

import com.stone.entity.*;

/**
 * @author Jeff
 * <p>
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new CokeCola());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
