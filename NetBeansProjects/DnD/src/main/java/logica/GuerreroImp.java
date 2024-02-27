package logica;

public class GuerreroImp extends Personaje implements Guerrero{

    public GuerreroImp() {
    }

    public GuerreroImp(String nombre, int vida, int mana, int nivel) {
        super(nombre, vida, mana, nivel);
    }
    
    @Override
    public void atacar(Personaje objetivo){
        atacarConEspada(objetivo);
    }
    
    @Override
    public void defender(int daño){
        int dañoRecibido = (int)(daño*.8);
        vida -= dañoRecibido;
        System.out.println("*****" + nombre + " recibió " + dañoRecibido + " de daño.");
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("** nombre: " + nombre);
        System.out.println("** clase: " + "Guerrero");
        System.out.println("** vida: "+ vida);
        System.out.println("** mana: "+ mana);
        System.out.println("** nivel: " + nivel);
    }
    
    @Override
    public void atacarConEspada(Personaje objetivo){
        int dañoDeEspada=(int)(nivel *5);
        objetivo.setVida(objetivo.getVida()-dañoDeEspada);
        System.out.println("**" + nombre + " ataca a: " + objetivo.getNombre()
        +" con la espada y le causó " + dañoDeEspada + " de daño");
    }
    
    @Override
    public void atacarConEscudo(Personaje objetivo){
        int dañoDeEscudo=(int)(nivel *3);
        objetivo.setVida(objetivo.getVida()-dañoDeEscudo);
        System.out.println("**" + nombre + " ataca a: " + objetivo.getNombre()
        +" con la espada y le causó " + dañoDeEscudo + " de daño");
    }
}
