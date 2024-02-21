package Documentos;

import java.time.*;

public class miRFC {
    public static void main(String[] args) {
        RFC tuRFC = new RFC("Perez", "Garcia", "Juan", LocalDate.of(2001,02,22)); 
        System.out.println("Tu RFC es: " + tuRFC.construirRFC());
    }
}
