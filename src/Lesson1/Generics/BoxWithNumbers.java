package Lesson1.Generics;

public class BoxWithNumbers<T extends Number> {
//public class BoxWithNumbers<T extends Number & Serializable & Closeable> {      //extends интерфейс - особенность
    private T[] arr;

    public BoxWithNumbers(T... arr) {
        this.arr = arr;
    }

    public double avg() {
        double d = 0.0;
        for (int i = 0; i < arr.length; i++) {
            d += arr[i].doubleValue();          //привести к double
        }
        d /= arr.length;
        return d;
    }

    public boolean saveAvg (BoxWithNumbers<?> another) {        //метасимвольный аргумент\шаблон\маска
//        return this.avg() == another.avg();                         //так сравнивать нельзя, возникает ошибка округление
        return  Math.abs(this.avg() - another.avg()) < 0.0001;
    }
}