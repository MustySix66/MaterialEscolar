package zoologico;

public class Gato extends Animal{
    public Gato(String nombre, String raza){
        super(nombre, raza);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    @Override
    public void hacerRuido(){
        System.out.println("Miau, miau!");
    }
}
