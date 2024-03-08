package logica;

public class MagoImp extends Personaje implements Mago{
    
    public MagoImp() {
    }

    public MagoImp(String nombre, int vida, int mana, int nivel) {
        super(nombre, vida, mana, nivel);
    }
    
    // Metodo para lanzar un hechizo a un objetivo, define daño y probabilidad de critico.
    @Override
    public String lanzarHechizo(Hechizo hechizo, Personaje objetivo){
        int dañoCritico = Personaje.TirosCriticos(4);
        int dañoRecibido = (int) (hechizo.getDaño()*dañoCritico);
        objetivo.setVida(objetivo.getVida()-dañoRecibido);
        return ("** " + nombre + " ataca a: " + objetivo.getNombre() + " con " +hechizo.getNombre()+ " y le causó " +dañoRecibido
                + " de daño.\n");
    }

    // Metodo para atacar un objetivo
    @Override
    public String atacar(Personaje objetivo){
        return lanzarHechizo(new Hechizo("Fire ball", 15), objetivo);
    }
    
    // Metodo para defenderse (no imp)
    @Override
    public void defender(int daño){
        int dañoRecibido=(int) (daño * .7);
        vida -= dañoRecibido;
        System.out.println("*****" + nombre + " recibió " + dañoRecibido + " de daño.\n");
    }
    
    // Metodo que muestra la información del personaje.
    @Override
    public String mostrarInformacion(){
        return ("** nombre: " + nombre + "\n" +
        "** clase: " + "Mago" + "\n" +
        "** vida: "+ vida+ "\n" +
        "** mana: "+ mana+ "\n" +
        "** nivel: " + nivel+ "\n");
    }
}