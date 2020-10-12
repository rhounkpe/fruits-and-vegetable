package generics;

import model.Apple;
import model.Fruit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Basket<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T getOne() {
        return t;
    }

    public <S extends Fruit> void inspect(S s) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("S: " + t.getClass().getName());
    }


    /*
    private List items = new LinkedList<>();

    public static <T> void add(<T extends Apple> item) {
        items.add(apple);
    }

    public void display() {
        for (Apple apple : items) {
            System.out.println(apple);
        }
    }

     */
}
