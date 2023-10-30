package Supplier.Hotel;

import java.util.function.Supplier;

public class TrabajadoresAhora<T> {
    private T cantidadTrabajadores;

    public TrabajadoresAhora(T cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public T getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public static void main(String[] args) {
        TrabajadoresAhora<Integer> trabajadoresAhora = new TrabajadoresAhora<>(10);
        Supplier<Integer> trabajadoresSupplier = trabajadoresAhora::getCantidadTrabajadores;
        int trabajadores = trabajadoresSupplier.get();
        System.out.println("Trabajadores en el hotel ahora: " + trabajadores);
    }
}
