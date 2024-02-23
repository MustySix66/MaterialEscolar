package uta;

import java.time.LocalDate;

public abstract class Personas {
    protected String Nombre;
    protected LocalDate fechaNac;
    protected int telefono;

    public Personas(String Nombre, LocalDate fechaNac, int telefono) {
        this.Nombre = Nombre;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
    }
    
    public abstract void identificarse();
}


