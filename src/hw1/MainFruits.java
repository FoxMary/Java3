package hw1;

import hw1.fruits.Apple;
import hw1.fruits.Orange;

public class MainFruits    {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> box2 = new Box<>(new Orange(), new Orange(), new Orange());

        box2.put(new Orange());

        Box<Apple> box4 = new Box<>(new Apple());
        box1.fill(box4);

        System.out.println(box1.compare(box2));
        System.out.println(box1.getWeight());
        System.out.println(box4.getWeight());

    }
}
