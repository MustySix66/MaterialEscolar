package logica;

// Los elfos tienen la caracteristica de ser cazadores

public class ElfoImp extends Personaje implements Elfo{

    public ElfoImp() {
    }

    public ElfoImp(String nombre, int vida, int mana, int nivel) {
        super(nombre, vida, mana, nivel);
    }
    
    @Override
    public String atacar(Personaje objetivo){
        return atacarConArco(objetivo);
    }
    
    @Override
    public void defender(int daño){
        // TODO: Aquí debe de usar un random con las posibilidades que tiene de esquivar el daño
        int dañoRecibido = (int)(daño*.8);
        vida -= dañoRecibido;
        System.out.println("** " + nombre + " recibió " + dañoRecibido + " de daño.");
    }
    
    @Override
    public String mostrarInformacion(){
        return ("** nombre: " + nombre + "\n" +
        "** clase: " + "Elfo" + "\n" +
        "** vida: "+ vida+ "\n" +
        "** mana: "+ mana+ "\n" +
        "** nivel: " + nivel+ "\n");
    }
    
    @Override
    public String atacarConArco(Personaje objetivo){
        int dañoCritico = Personaje.TirosCriticos(5);
        int dañoDeArco =(int)((nivel * 10) * dañoCritico); // 10 es el daño base de un flechazo del arco.
        objetivo.setVida(objetivo.getVida()-dañoDeArco);
        return ("** " + nombre + " ataca a: " + objetivo.getNombre()
        +" con el arco y le causó " + dañoDeArco + " de daño\n");
    }
}