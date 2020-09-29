import model.Apple;
import model.Avocado;
import model.Color;

public class Main {

    public static void main(String[] args) {
        Apple a1 = new Apple(10, Color.GREEN);

        Apple a2 = new Apple(10000, Color.PINK);
        Avocado av1 = new Avocado(20);
        // Cet avocat est un hybride
        av1.setHybrid(true);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println(av1);
        System.out.println(a1);


    }
}
