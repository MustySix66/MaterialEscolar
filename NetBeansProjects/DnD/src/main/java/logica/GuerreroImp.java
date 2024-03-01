package logica;

public class GuerreroImp extends Personaje implements Guerrero{

    public GuerreroImp() {
    }

    public GuerreroImp(String nombre, int vida, int mana, int nivel) {
        super(nombre, vida, mana, nivel);
    }
    
    @Override
    public String atacar(Personaje objetivo){
        return atacarConEspada(objetivo);
    }
    
    @Override
    public void defender(int daño){
        int dañoRecibido = (int)(daño*.8);
        vida -= dañoRecibido;
        System.out.println("***** " + nombre + " recibió " + dañoRecibido + " de daño.");
    }
    
    @Override
    public String mostrarInformacion(){
        return ("** nombre: " + nombre + "\n" +
        "** clase: " + "Guerrero" + "\n" +
        "** vida: "+ vida+ "\n" +
        "** mana: "+ mana+ "\n" +
        "** nivel: " + nivel+ "\n");
    }
    
    @Override
    public String atacarConEspada(Personaje objetivo){
        int dañoCritico = Personaje.TirosCriticos(3);
        int dañoDeEspada=(int)(nivel * dañoCritico);
        objetivo.setVida(objetivo.getVida()-dañoDeEspada);
        return ("** " + nombre + " ataca a: " + objetivo.getNombre()
        +" con la espada y le causó " + dañoDeEspada + " de daño\n");
    }
    
    @Override
    public String atacarConEscudo(Personaje objetivo){
        int dañoDeEscudo=(int)(nivel *3);
        objetivo.setVida(objetivo.getVida()-dañoDeEscudo);
        return ("** " + nombre + " ataca a: " + objetivo.getNombre()
        +" con la espada y le causó " + dañoDeEscudo + " de daño\n");
    }
}
