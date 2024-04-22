package org.ours;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import java.util.List;

public class Groovy {
    public void imprimir(List<Vehiculo> vehiculos) {
        System.out.println("""
                **************************************************
                CÓDIGO IMPLEMENTANDO GROOVY
                **************************************************
                Descrición: la función de arrancar vehículos está
                declarada en un string llamado script, este luego 
                dispara desde una shell de Groovy enviandole como
                parámetros una lista de vehículos
                """);

        Binding binding = new Binding();
        binding.setVariable("vehiculos", vehiculos);
        GroovyShell shell = new GroovyShell(binding);

        String script = """
            def arrancarVehiculos(vehiculos) {
                vehiculos.each { vehiculo ->
                    vehiculo.arrancar()
                }
            }

            arrancarVehiculos(vehiculos)
        """;

        shell.evaluate(script);

        System.out.println("""
                **************************************************
                FIN DE CÓDIGO IMPLEMENTANDO GROOVY
                **************************************************
                
                
                """);
    }
}
