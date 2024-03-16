package logica;

// Clase GuerreroImp que hereda de Personaje e implementa la interfaz Guerrero
public class GuerreroImp extends Personaje implements Guerrero{

    // Constructor vacío de la clase
    public GuerreroImp() {
    }

    // Constructor de la clase con parámetros del personaje
    public GuerreroImp(String nombre, int vida, int mana, int nivel) {
        super(nombre, vida, mana, nivel);
    }
    
    // Método para atacar a un objetivo
    @Override
    public String atacar(Personaje objetivo){
        return atacarConEspada(objetivo);
    }
    
    // Método para defenderse de un ataque (no imp)
    @Override
    public void defender(int daño){
        int dañoRecibido = (int)(daño*.8);
        vida -= dañoRecibido;
        System.out.println("***** " + nombre + " recibió " + dañoRecibido + " de daño.");
    }
    
    // Método para mostrar la información del personaje
    @Override
    public String mostrarInformacion(){
        return ("** nombre: " + nombre + "\n" +
        "** clase: " + "Guerrero" + "\n" +
        "** vida: "+ vida+ "\n" +
        "** mana: "+ mana+ "\n" +
        "** nivel: " + nivel+ "\n");
    }
    
    // Método para atacar a un objetivo con una espada
    @Override
    public String atacarConEspada(Personaje objetivo){
        int dañoCritico = Personaje.TirosCriticos(3);
        int dañoDeEspada=(int)(nivel * dañoCritico);
        objetivo.setVida(objetivo.getVida()-dañoDeEspada);
        return ("** " + nombre + " ataca a: " + objetivo.getNombre()
        +" con la espada y le causó " + dañoDeEspada + " de daño\n");
    }
    
    // Método para atacar a un objetivo con un escudo (no implementado aún)
    @Override
    public String atacarConEscudo(Personaje objetivo){
        int dañoDeEscudo=(int)(nivel *3);
        objetivo.setVida(objetivo.getVida()-dañoDeEscudo);
        return ("** " + nombre + " ataca a: " + objetivo.getNombre()
        +" con la espada y le causó " + dañoDeEscudo + " de daño\n");
    }
    
    @Override
    public String defenderse(){
        // reducir daño en un 90%
        return "";
    }
}
