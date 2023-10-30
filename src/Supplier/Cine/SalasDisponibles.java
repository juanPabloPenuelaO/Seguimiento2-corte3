package Supplier.Cine;

import java.util.function.Supplier;

public class SalasDisponibles<T> {
    private T cantidadSalas;

    public SalasDisponibles(T cantidadSalas) {
        this.cantidadSalas = cantidadSalas;
    }

    public T getCantidadSalas() {
        return cantidadSalas;
    }

    public static void main(String[] args) {
        SalasDisponibles<Integer> salasDisponibles = new SalasDisponibles<>(5);
        Supplier<Integer> salasSupplier = salasDisponibles::getCantidadSalas;
        int salas = salasSupplier.get();
        System.out.println("Salas disponibles: " + salas);
    }
}

