package generics;

import model.Apple;
import model.Avocado;
import model.Color;
import model.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        Apple a1 = new Apple(10, Color.GREEN);
        Apple a2 = new Apple(10000, Color.PINK);
        Apple a3 = new Apple(15, Color.RED);
        Apple a4 = new Apple(20, Color.GREEN);
        Apple a5 = new Apple(22, Color.PINK);
        Apple a6 = new Apple(24, Color.RED);
        Apple a7 = new Apple(17, Color.GREEN);
        Apple a8 = new Apple(28, Color.PINK);
        Apple a9 = new Apple(12, Color.GREEN);
        Apple a10 = new Apple(7, Color.RED);


        List<Apple> basket = new ArrayList<>();

        basket = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10);

        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.add(new Apple(14, Color.PINK));

        fruitBasket.inspect(new Avocado(4));
        // fruitBasket
        /*
        Basket<Fruit> appleBasket = new Basket();
        appleBasket.add(a1);
        appleBasket.add(a2);
        appleBasket.add(a3);
        appleBasket.add(a4);

        // appleBasket.add("sdjkhsdfhj");

        appleBasket.add(new Avocado(14));
        appleBasket.add(new Avocado(7));

        appleBasket.display();


 */

    }
}
