package zoologico;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Toby", "Labrador");
        Gato gato = new Gato("Michi", "Siamés");
        
        perro.hacerRuido();
        gato.hacerRuido();
        
        System.out.println("Nombre del perro: " + perro.getNombre());
        System.out.println("Raza del gato: " + gato.getRaza());
    }
}
