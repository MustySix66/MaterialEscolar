package uta;

import java.time.LocalDate;

public class Profesores extends Personas {

    public Profesores(String Nombre, LocalDate fechaNac, int telefono) {
        super(Nombre, fechaNac, telefono);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public void identificarse(){
        System.out.println("Soy Maestro");
    }
    
}
