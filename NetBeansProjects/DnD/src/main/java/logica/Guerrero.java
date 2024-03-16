package logica;

// En un metodo abstracto asignamos las acciones que va a cometer el guerrero, pero no como las hará.
public interface Guerrero {
    String atacarConEspada(Personaje objetivo);
    String atacarConEscudo(Personaje objetivo);
    
    // Añade una proteccion de un turno, reduce el daño en un 90%
    String defenderse();
}
