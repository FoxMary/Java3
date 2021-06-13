package hw1;

import java.util.*;
/**
 * 1. Написать метод, который меняет два элемента массива местами. (массив может быть любого ссылочного типа)
 * 2. Написать метод, который преобразует массив в ArrayList
 * 3. Большая задача:
 * Есть классы Fruit -> Apple, Orange (больше не надо)
 * Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, по этому в одну коробку
 * нельзя сложить и яблоки, и апельсины;
 * Для хранения фруктов внутри коробки можно использовать ArrayList;
 * Сделать метод getWeight(), который высчитывает вес коробки, зная количество фруктов и вес одного фрукта (вес яблока – 1.0f,
 * апельсина – 1.5f. Не важно, в каких это единицах);
 * Внутри класса Коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare
 * в качестве параметра, true – если она равны по весу, false – в противном случае (коробки с яблоками мы можем сравнивать
 * с коробками с апельсинами);
 * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую (помним про сортировку фруктов:
 * нельзя яблоки высыпать в коробку с апельсинами). Соответственно, в текущей коробке фруктов не остается, а в другую
 * перекидываются объекты, которые были в этой коробке;
 * Не забываем про метод добавления фрукта в коробку.
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5));
        System.out.println(list);
        changeByIndex(list, 1, 3);
        System.out.println(list);

        Integer[] arr = {1,2,3,4,5,6};
        ArrayList<Integer> list1 = new ArrayList<>();
        toArray(list1, arr);
        System.out.println(list1);

    }

    public static  <T> void changeByIndex(List<T> list, int index1, int index2) {
        T element = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, element);
    }

    public static void changeByIndex1(List<Object> list, int index1, int index2) {      //аналог (дженерик ни на что не влияет
        Object element = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, element);
    }

    public static <T> void toArray(ArrayList<T> list, T[] arr) {
        Collections.addAll(list, arr);
    }

    public static <T> ArrayList<T> arrayToList(T[] arr) {               //аналог
        return new ArrayList<>(Arrays.asList(arr));
    }
}
