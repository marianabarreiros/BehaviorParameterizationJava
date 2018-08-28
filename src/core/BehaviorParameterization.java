package core;

import implemetations.FilterAppleByWeight;
import implemetations.FilterGreenApples;
import implemetations.FilterRedApples;
import interfaces.ApplePredicate;
import java.util.Arrays;
import java.util.List;
import product.Apple;
import filteringapples.FilteringApples;

public class BehaviorParameterization {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("red", 160),
                                              new Apple("green", 110),
                                              new Apple("green", 200),
                                              new Apple("green", 50),
                                              new Apple("red", 175),
                                              new Apple("red", 183),
                                              new Apple("red", 80));
        
        FilteringApples filteringApples = new FilteringApples();
        
        System.out.println(filteringApples.filterApples(inventory, (Apple apple) -> "red".equals(apple.getColor())));
        System.out.println(filteringApples.filterApples(inventory, new FilterRedApples()));
        System.out.println(filteringApples.filterApples(inventory, new FilterAppleByWeight()));
    }
    
}
