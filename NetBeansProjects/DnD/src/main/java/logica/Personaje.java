package logica;

import java.util.Random;

public abstract class Personaje {
    // Acercaos todos a escuchar la leyenda del viejo mago que en su bosque encantado lloró
    protected String nombre;
    protected int vida;
    protected int mana;
    protected int nivel;

    public Personaje() {
    }
    
    public Personaje(String nombre, int vida, int mana, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.mana = mana;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    //Metodo que da un tiro critico multiplicando el daño base.
    protected static int TirosCriticos(int maxCritico){
        Random aleatorio = new Random();
        return aleatorio.nextInt(1, maxCritico);
    }
    
    //Metodos abstractos de los personajes.
    public abstract String atacar1(Personaje objetivo);
    public abstract String atacar2(Personaje objetivo);
    public abstract String mostrarInformacion();
    
    //Metodo para ver si está vivo el personaje o no.
    public boolean estaVivo(){
        return vida>0;
    }
}
