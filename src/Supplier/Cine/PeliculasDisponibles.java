package Supplier.Cine;

import java.util.function.Supplier;

public class PeliculasDisponibles<T> {
    private T cantidadPeliculas;

    public PeliculasDisponibles(T cantidadPeliculas) {
        this.cantidadPeliculas = cantidadPeliculas;
    }

    public T getCantidadPeliculas() {
        return cantidadPeliculas;
    }

    public static void main(String[] args) {
        PeliculasDisponibles<Integer> peliculasDisponibles = new PeliculasDisponibles<>(10);
        Supplier<Integer> peliculasSupplier = peliculasDisponibles::getCantidadPeliculas;
        int peliculas = peliculasSupplier.get();
        System.out.println("Películas disponibles: " + peliculas);
    }
}

