package biConsumerEjemplo2;

import java.util.function.BiConsumer;
public class Main {
    public static void main(String[] args){
        Clothes clothes = new Clothes("Red",18);

        Color color = new Color("blue");

        BiConsumer<Clothes, Color> biConsumer = (clo, col) -> clo.setColor(col.getColor());
        biConsumer.accept(clothes, color);

        System.out.println("Color:" + clothes.getColor());
        System.out.println("Size:" + clothes.getSize());
    }
}
