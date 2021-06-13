package hw1;

import java.util.ArrayList;
import java.util.Collections;

public class Box<T extends Fruit> {
    ArrayList<T> list = new ArrayList<>();
    float weight;

    public Box(T... fruit) {
        Collections.addAll(list, fruit);
    }

    public void put(T o) {
        list.add(o);
    }

    public float getWeight() {
        weight = 0.0f;
        for(T o : list) weight += o.getWeight();
            return weight;
        }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean compare(Box o) {
        return Math.abs(this.getWeight() - o.getWeight()) < 0.0001;
    }

    public void fill(Box<T> box) {
        box.list.addAll(list);
        this.list.clear();
    }
}
