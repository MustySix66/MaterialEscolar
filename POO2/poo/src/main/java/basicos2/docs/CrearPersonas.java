package basicos2.docs;

import java.time.LocalDate;

public class CrearPersonas {

    public static void main(String[] args) {
        Personas persona = new Personas();

        persona.setNombre("Arturo");
        System.out.println(persona.getNombre());

        persona = new Personas("Juan","Juarez","Jimenez",LocalDate.of(2003, 03, 12));

        System.out.println("Hola, mi nombre es: "+persona.getNombre()+" "+ persona.getPaterno() +" "+ persona.getMaterno()+" y mi cumpleaños es el "+ persona.getFechaNacimiento());

        Elector elector = new Elector(persona);
        System.out.println("Mi clave de elector es: "+elector.miClaveElector());

    }
}