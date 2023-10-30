package Supplier.Hotel;

import java.util.function.Supplier;

public class HabitacionesDisponibles<T> {
    private T cantidadHabitaciones;

    public HabitacionesDisponibles(T cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    public T getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public static void main(String[] args) {
        HabitacionesDisponibles<Integer> habitacionesDisponibles = new HabitacionesDisponibles<>(20);
        Supplier<Integer> habitacionesSupplier = habitacionesDisponibles::getCantidadHabitaciones;
        int habitaciones = habitacionesSupplier.get();
        System.out.println("Habitaciones disponibles: " + habitaciones);
    }
}
