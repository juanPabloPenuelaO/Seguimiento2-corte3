package Supplier.Cine;

import java.util.function.Supplier;

public class CantidadFuncionarios<T> {
    private T cantidadFuncionarios;

    public CantidadFuncionarios(T cantidadFuncionarios) {
        this.cantidadFuncionarios = cantidadFuncionarios;
    }

    public T getCantidadFuncionarios() {
        return cantidadFuncionarios;
    }

    public static void main(String[] args) {
        CantidadFuncionarios<Integer> cantidadFuncionarios = new CantidadFuncionarios<>(20);
        Supplier<Integer> funcionariosSupplier = cantidadFuncionarios::getCantidadFuncionarios;
        int funcionarios = funcionariosSupplier.get();
        System.out.println("Cantidad de funcionarios: " + funcionarios);
    }
}

