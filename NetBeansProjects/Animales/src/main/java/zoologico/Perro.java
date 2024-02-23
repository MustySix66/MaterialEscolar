package zoologico;

public class Perro implements Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra: ¡Guau!");
    }
}