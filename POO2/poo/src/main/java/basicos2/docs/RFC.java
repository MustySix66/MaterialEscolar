package basicos2.docs;

import java.time.*;

public class RFC {
    private String paterno, materno, nombre;
    private LocalDate fechaNacimiento = LocalDate.of(2000, 01, 01);

    public RFC(){
    }

    public RFC(String paterno, String materno, String nombre, LocalDate fechaNacimiento){
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String construirRFC(){
        String miRFC="";
        miRFC += this.paterno.substring(0,2);
        miRFC+=this.materno.charAt(0);
        miRFC+=this.nombre.substring(0,1);
        String anioString="";
        anioString += this.fechaNacimiento.getYear();
        miRFC+=anioString.substring(2,4);


        String mesString ="";
        mesString+= this.fechaNacimiento.getMonthValue();
        if (mesString.length()<2) {
            mesString=("0"+mesString);
        }
        miRFC+=mesString;

        String diaString="";
        diaString+= this.fechaNacimiento.getDayOfMonth();
        miRFC+=diaString.substring(0,2);

        return miRFC.toUpperCase();
    }
}