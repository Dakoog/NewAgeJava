package apples;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.util.Comparator.comparing;

public class AppleMain {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.YELLOW),
                new Apple(120, Color.RED)
        );

//        inventory.sort(new Comparator<Apple>() {
//
//            @Override
//            public int compare(Apple a1, Apple a2) {
//                return Integer.a1.getWeight().compareTo(a2.getWeight());
//            }
//        });
        Comparator<Apple> byWeight =
                (Apple a1, Apple a2) -> Integer.compare(a1.getWeight(),a2.getWeight());


        Comparator<Apple> byWeights = Comparator
                .comparing(Apple::getWeight);
        inventory.sort(byWeight);
        inventory.sort(byWeights);
        System.out.println(inventory);



    }

}
