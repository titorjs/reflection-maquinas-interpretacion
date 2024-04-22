package org.ours;

import java.util.List;

public class Interfaz {
    public void imprimir(List<Vehiculo> vehiculos) {
        System.out.println("""
                **************************************************
                SE ARRANCAN LOS VEHÍCULOS A TRAVÉS DE UNA INTERFAZ
                **************************************************
                DESCRIPCIÓN:
                Los vehículos: Carro, Moto, AVión. Implementan una
                interfaz y se llama a un método por cada objeto.
                
                Como sigue:
                
                
                """);

        for (Vehiculo v: vehiculos){
            v.arrancarParticular();
        }

        System.out.println("""
                
                **************************************************
                FINALIZACIÓN DE ARRANQUE CON INTERFAZ
                **************************************************
                """);
    }
}