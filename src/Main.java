import model.Apple;
import model.Color;


import java.util.Arrays;
import java.util.List;

public class Main {

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


        List<Apple> panier = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10);


    }
}
