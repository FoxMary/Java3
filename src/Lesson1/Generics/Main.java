package Lesson1.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        public static <T> void copy(List<? super T> dest, List<? extends T> src)
//                                               (либо Т либо родитель, либо Т либо наследник)

        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30));
        System.out.println(sumOfList(nums));
        List<String> ls = new ArrayList<>(Arrays.asList("A", "B", "C"));

        Integer i = getFirstElement(nums);
        System.out.println(getFirstElement(ls));
    }

    public static <T> T getFirstElement(List<T> list) {     //метод использует обобщенный тип данных <T>, в который подастся List<T>, типы значения должны совпадать
        return list.get(0);
    }

    public static double sumOfList(List<? extends Number> numbers) {        //реализация наследования в дженериках
        double d = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            d += numbers.get(i).doubleValue();
        }
        return d;
    }

    private static void boxWithNumbersEx() {
        double a = 0.7;
        double b = 0.0;
        for (int i = 0; i < 70; i++) {
            b += 0.01;
        }

        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);                  //ошибка округления


        BoxWithNumbers<Float> floatBox1 = new BoxWithNumbers<>(1.0f, 2.0f, 3.0f);
        BoxWithNumbers<Float> floatBox2 = new BoxWithNumbers<>(1.0f, 2.0f, 3.0f);

        System.out.println(floatBox1.saveAvg(floatBox2));
        BoxWithNumbers<Integer> intBox = new BoxWithNumbers<>(1, 2, 3);

        intBox.saveAvg(floatBox1);

        System.out.println("float box1 avg: " + floatBox1.avg());
        System.out.println("int box avg: " + intBox.avg());
//        BoxWithNumbers<String > bwn1 = new BoxWithNumbers<String>("1");         //ограничение Numbers
    }

    private static void genObjectsEx() {
        BoxGen<Integer> bi1 = new BoxGen<>(20);
        BoxGen<Integer> bi2 = new BoxGen<>(40);

//        bi1.setObj("Java");       //ошибку видно сразу

        int sum = bi1.getObj() + bi2.getObj();
        System.out.println(sum);

        BoxGen<String> bs = new BoxGen<>("Java");
        System.out.println(bs.getObj());

        BoxTwoGen<String , Integer> b2g = new BoxTwoGen<>("A", "B", 20);
        b2g.info();
    }

    private static void simpleBoxEx() {
        SimpleBox box1 = new SimpleBox(1);
        SimpleBox box2 = new SimpleBox(2);
        //...
        box1.setObj("Java");                //ошибку видно только на этапе компиляции
        //...
        if (box1.getObj() instanceof  Integer && box2.getObj() instanceof Integer) {        //надо проверять тот ли тип там лежит
            int sum = (int) box1.getObj() + (int) box2.getObj();                                            //постоянно надо делать касты
            System.out.println("sum = " + sum);
        }
    }
}
