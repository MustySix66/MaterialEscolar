package Logica;

/**
 * @author kevin
 */
public abstract class Platillo {
    protected String nombre;
    protected String descripcion;
    protected String ingredientes;
    protected double costo;
    protected String pasosReceta;

    public Platillo() {
    }

    public Platillo(String nombre, String descripcion, String ingredientes, double costo, String pasosReceta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
        this.costo = costo;
        this.pasosReceta = pasosReceta;
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getPasosReceta() {
        return pasosReceta;
    }

    public void setPasosReceta(String pasosReceta) {
        this.pasosReceta = pasosReceta;
    }
    
    public abstract String metodoPreparación();
    public abstract float costoPreparacion();
    
}
