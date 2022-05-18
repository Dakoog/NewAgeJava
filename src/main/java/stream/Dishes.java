package stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dishes {
    private final String dishName;
    private final int calories;
    private final boolean vegetarian;
    private final Type type;

    public Dishes(String dishName, int calories, boolean vegetarian, Type type) {
        this.dishName = dishName;
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.type = type;
    }

    public String getDishName() {
        return dishName;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return dishName + " " + calories + "\n";
    }
}
