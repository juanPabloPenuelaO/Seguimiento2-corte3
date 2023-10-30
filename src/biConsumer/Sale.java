package biConsumer;

import java.util.function.BiConsumer;

public class Sale {

    public static void main(String[] args) {
        Cars cars = new Cars("Mercedes Benz", "Blue", 2022,"new");

        Especification especification = new Especification("used");

        BiConsumer<Cars, Especification> biConsumer = (car, sta) -> car.setState(sta.getState());
        biConsumer.accept(cars, especification);

        System.out.println("Brand:" + cars.getBrand());
        System.out.println("Color:" + cars.getColor());
        System.out.println("Model:" + cars.getModel());
        System.out.println("State:" + especification.getState());
    }
}
