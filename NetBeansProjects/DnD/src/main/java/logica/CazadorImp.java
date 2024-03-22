package logica;

// Clase CazadorImp que hereda de Personaje e implementa la interfaz Cazador
public class CazadorImp extends Personaje implements Cazador{
    String mensaje;

    // Constructor vacío de la clase
    public CazadorImp() {
    }

    // Constructor de la clase con parámetros
    public CazadorImp(String nombre, int vida, int mana, int nivel) {
        super(nombre, vida, mana, nivel);
    }
    
    // Método para atacar a un objetivo
    @Override
    public String atacar1(Personaje objetivo){
        return atacarConArco(objetivo);
    }
    
    // Método para defenderse de un ataque
    @Override
    public String atacar2(Personaje objetivo){
        return navajazosLocos(objetivo);
    }
    
    // Método para mostrar la información del personaje
    @Override
    public String mostrarInformacion(){
        return ("** nombre: " + nombre + "\n" +
        "** clase: " + "Cazador" + "\n" +
        "** vida: "+ vida+ "\n" +
        "** mana: "+ mana+ "\n" +
        "** nivel: " + nivel+ "\n");
    }
    
    // Método para atacar a un objetivo con un arco
    @Override
    public String atacarConArco(Personaje objetivo){
        int dañoCritico = Personaje.TirosCriticos(5);
        int dañoDeArco =(int)((nivel * 10) * dañoCritico); // 10 es el daño base de un flechazo del arco.
        objetivo.setVida(objetivo.getVida()-dañoDeArco);
        mensaje = ("** " + nombre + " ataca a: " + objetivo.getNombre()
        +" con el arco y le causó " + dañoDeArco + " de daño\n");
        return objetivo.estaVivo()? mensaje:("+++"+ objetivo.getNombre()+ " ha muerto");
    }
    
    @Override
    public String navajazosLocos(Personaje objetivo){
        int dañoCritico = Personaje.TirosCriticos(7);// los criticos aquí actuan como el numero de navajazos que podria asestar el cazador.
        int dañoDeArco =(int)((nivel * 7) * dañoCritico); // 7 es el daño base de un navajazo.
        objetivo.setVida(objetivo.getVida()-dañoDeArco);
        mensaje = ("** " + nombre + " ataca a: " + objetivo.getNombre()
        +" con el arco y le causó " + dañoDeArco + " de daño\n");
        return objetivo.estaVivo()? mensaje:("+++"+ objetivo.getNombre()+ " ha muerto");
    }
}
