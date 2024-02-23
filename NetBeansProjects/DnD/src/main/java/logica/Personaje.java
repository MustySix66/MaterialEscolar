package logica;

public abstract class Personaje {
    // Acercaos todos a escuchar la leyenda del ChupaChota
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
    
    public abstract void atacar(Personaje objetivo);
    public abstract void defender(int daño);
    public abstract void mostrarInformacion();
    
    public boolean estaVivo(){
        return vida>0;
    }
}
