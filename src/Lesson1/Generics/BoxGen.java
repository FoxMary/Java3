package Lesson1.Generics;

public class BoxGen<T> {
    private T obj;
//    private static  T st = 10;      //нельзя создать статическое поле
        //нельзя создать обобщенное исключение

    public void doSomething() {
//        T myObj = new T();      //невозможно т к неизвестен тип
//        T[] arr = new T[20];      //невозможно создать массив

    }

    public BoxGen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
