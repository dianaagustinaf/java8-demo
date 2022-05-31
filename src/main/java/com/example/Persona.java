package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persona {
    
    private Long id;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private int edad;
    private Sexo sexo;
    private Double salario;
    private static List<Persona> personas;

    public enum Sexo {
        HOMBRE,MUJER,OTRO
    }


    public static List<Persona> personas() {
        
        personas = new ArrayList<>();

        personas.add(Persona.builder()
                            .nombre("Gaia")
                            .apellidos("Fernandez")
                            .fechaNacimiento(LocalDate.of(2019, Month.MARCH, 15))
                            .sexo(Sexo.OTRO)
                            .salario(1879.0)
                            .build());

        personas.add(Persona.builder()
                            .nombre("Greta")
                            .apellidos("Rainis")
                            .fechaNacimiento(LocalDate.of(2018, Month.SEPTEMBER, 30))
                            .sexo(Sexo.OTRO)
                            .salario(1990.0)
                            .build());

        personas.add(Persona.builder()
                            .nombre("Gina")
                            .apellidos("Acosta")
                            .fechaNacimiento(LocalDate.of(2017, Month.OCTOBER, 5))
                            .sexo(Sexo.MUJER)
                            .salario(1270.0)
                            .build());

        personas.add(Persona.builder()
                            .nombre("Kevin")
                            .apellidos("Menendez")
                            .fechaNacimiento(LocalDate.of(2020, Month.JUNE, 11))
                            .sexo(Sexo.MUJER)
                            .salario(1322.0)
                            .build());

        personas.add(Persona.builder()
                            .nombre("Santi")
                            .apellidos("Martel")
                            .fechaNacimiento(LocalDate.of(1945, Month.NOVEMBER, 15))
                            .sexo(Sexo.OTRO)
                            .salario(1659.0)
                            .build());

        personas.add(Persona.builder()
                            .nombre("Azahara")
                            .apellidos("Menendez")
                            .fechaNacimiento(LocalDate.of(1986, Month.APRIL, 17))
                            .sexo(Sexo.HOMBRE)
                            .salario(1869.0)
                            .build());

        personas.add(Persona.builder()
                            .nombre("Schair")
                            .apellidos("Menendez")
                            .fechaNacimiento(LocalDate.of(1998, Month.AUGUST, 19))
                            .sexo(Sexo.HOMBRE)
                            .salario(1579.0)
                            .build());
        
        return personas;
    }

}
