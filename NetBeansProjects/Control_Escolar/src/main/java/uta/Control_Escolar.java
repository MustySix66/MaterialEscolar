package uta;

import java.time.LocalDate;

public class Control_Escolar {

    public static void main(String[] args) {
        Alumnos alumno = new Alumnos("federico", LocalDate.of(1999, 10, 25), 449164);
        Profesores profe = new Profesores("Manuel", LocalDate.of(1989, 05, 14), 449678);
        
        alumno.identificarse();
        profe.identificarse();
        
        System.out.println("soy "+ alumno.getNombre());
        System.out.println("Soy "+ profe.getNombre());
    }
}
