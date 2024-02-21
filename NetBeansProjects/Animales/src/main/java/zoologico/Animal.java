package zoologico;

public abstract class Animal {
    
    protected String nombre, raza;

    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    public abstract void hacerRuido();
}
