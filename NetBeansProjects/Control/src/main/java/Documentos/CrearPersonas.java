package Documentos;

import java.time.LocalDate;

public class CrearPersonas {

    public static void main(String[] args) {
        Personas persona = new Personas();

        persona.setNombre("Juan");
        System.out.println(persona.getNombre());

        persona = new Personas("Kevin","Andrade","Lopez",LocalDate.of(1999, 10, 25),"Masculino","Aguascalientes");

        System.out.println("Hola, mi nombre es: "+persona.getNombre()+" "+ persona.getPaterno() +" "+ persona.getMaterno()+" y mi cumpleaños es el "+ persona.getFechaNacimiento());

        Elector elector = new Elector(persona);
        System.out.println("Mi clave de elector es: "+elector.miClaveElector());

    }
}