package Supplier.Hotel;

import java.util.function.Supplier;

public class PersonasEnHotel<T> {
    private T cantidadPersonas;

    public PersonasEnHotel(T cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public T getCantidadPersonas() {
        return cantidadPersonas;
    }

    public static void main(String[] args) {
        PersonasEnHotel<Integer> personasEnHotel = new PersonasEnHotel<>(50);
        Supplier<Integer> personasSupplier = personasEnHotel::getCantidadPersonas;
        int personas = personasSupplier.get();
        System.out.println("Personas en el Supplier.hotel: " + personas);
    }
}