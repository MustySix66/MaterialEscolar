package logica;

public class MagoImp extends Personaje implements Mago{

    public MagoImp() {
    }

    public MagoImp(String nombre, int vida, int mana, int nivel) {
        super(nombre, vida, mana, nivel);
    }
    
    @Override
    public void lanzarHechizo(Hechizo hechizo, Personaje objetivo){
        int dañoRecibido = (int) (hechizo.getDaño()*.8);
        objetivo.setVida(objetivo.getVida()-dañoRecibido);
        System.out.println(
                "**" +
                objetivo.getNombre() +
                "recibe" +
                dañoRecibido +
                "de daño del Hechizo" +
                hechizo.getNombre()+
                "***********");
    }
    @Override
    public void atacar(Personaje objetivo){
        lanzarHechizo(new Hechizo("Fire ball", 5), objetivo);
    }
    
    @Override
    public void defender(int daño){
        int dañoRecibido=(int) (daño * .7);
        vida -= dañoRecibido;
        System.out.println("*****" + nombre + " recibió " + dañoRecibido + " de daño.");
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("** nombre: " + nombre);
        System.out.println("** clase: " + "Mago");
        System.out.println("** vida: "+ vida);
        System.out.println("** mana: "+ mana);
        System.out.println("** nivel: " + nivel);
    }
}
