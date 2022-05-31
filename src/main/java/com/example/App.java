package com.example;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.Persona.Sexo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //Listado de personas
        List<Persona> personas = Persona.personas();

        //salario promedio
        // al usar .stream la coleccion deja de ser coleccion
        // y pasa a ser un flujo de bytes
        // por eso mapToDouble - a pesar de que el salario ya es double
        var salarioPromedio =
        personas.stream().mapToDouble(Persona::getSalario)
                            .average()
                            .getAsDouble();
        
        System.out.println(salarioPromedio);

        // si solo vas a llamar una propiedad y no vas a hacer ningun calculo
        // no es necesario hacer map(p -> p.getApellidos() )
        // sino map(Persona::getSalario)


        // personas.stream().map(p -> p.getSalario() + 100).collect(collector);

        // Coleccion de solo mujeres
        //  p.getSexo().equals(Persona.Sexo.MUJER)
        List<Persona> mujeres =
        personas.stream().filter(p -> p.getSexo() == Sexo.MUJER)
                        .collect(Collectors.toList());

        for (Persona persona : mujeres) {
            System.out.println(persona);
        }

    }
}
