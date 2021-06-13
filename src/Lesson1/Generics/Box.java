package Lesson1.Generics;

public class Box implements Comparable<Box> {               //можно сравнить
    private int size;

    public Box(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Box o) {
        return this.size - o.size;
    }

    //    @Override
//    public int compareTo(Object o) {
//        if(o == this) return 0;
//        if (o == null) throw new NullPointerException();
//        if (!(o instanceof Box)) throw new RuntimeException();
//        Box another = (Box) o;
//        return this.size - another.size;
//    }
}
