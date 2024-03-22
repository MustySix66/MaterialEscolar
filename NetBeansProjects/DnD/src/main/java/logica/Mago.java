package logica;

// En un metodo abstracto asignamos las acciones que va a cometer el mago, pero no como las hará.
public interface Mago {
    String lanzarHechizo(Hechizo hechizo, Personaje objetivo);
    String invocacionAncestral(Hechizo hechizo, Personaje objetivo);
}
