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
}
