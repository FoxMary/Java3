package Lesson1.Generics;

public class BoxTwoGen<T, N> {
    private T tObj1;
    private  T tObj2;
    private N nObj1;

    public BoxTwoGen(T tObj1, T tObj2, N nObj1) {
        this.tObj1 = tObj1;
        this.tObj2 = tObj2;
        this.nObj1 = nObj1;
    }

    public void info() {
        System.out.println("t1: " + tObj1.getClass().getSimpleName()+ " = " + tObj1);
        System.out.println("t2: " + tObj2.getClass().getSimpleName()+ " = " + tObj2);
        System.out.println("n1: " + nObj1.getClass().getSimpleName()+ " = " + nObj1);
    }
}
