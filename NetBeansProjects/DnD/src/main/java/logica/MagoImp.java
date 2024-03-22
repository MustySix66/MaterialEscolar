package logica;

public class MagoImp extends Personaje implements Mago{
    String mensaje;
    
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
        mensaje= ("** " + nombre + " ataca a: " + objetivo.getNombre() + " con " +hechizo.getNombre()+ " y le causó " +dañoRecibido
                + " de daño.\n");
        return objetivo.estaVivo()? mensaje:("+++"+ objetivo.getNombre()+ " ha muerto");
    }

    // Metodo para atacar un objetivo
    @Override
    public String atacar1(Personaje objetivo){
        mensaje = lanzarHechizo(new Hechizo("Fire ball", 15), objetivo);
        return objetivo.estaVivo()? mensaje:("+++"+ objetivo.getNombre()+ " ha muerto");
    }
    
    @Override
    public String invocacionAncestral(Hechizo hechizo, Personaje objetivo){
        int dañoCritico = Personaje.TirosCriticos(2);
        int dañoRecibido = (int) (hechizo.getDaño()*dañoCritico);
        objetivo.setVida(objetivo.getVida()-dañoRecibido);
        mensaje = ("** " + nombre + " ataca a: " + objetivo.getNombre() + " con " +hechizo.getNombre()+ " y le causó " +dañoRecibido
                + " de daño.\n");
        return objetivo.estaVivo()? mensaje:("+++"+ objetivo.getNombre()+ " ha muerto");
        
    }
    
    @Override
    public String atacar2(Personaje objetivo){
        return lanzarHechizo(new Hechizo("Mil manos demoniacas", 30), objetivo);
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