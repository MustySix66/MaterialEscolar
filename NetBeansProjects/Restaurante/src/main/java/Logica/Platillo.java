package Logica;

public abstract class Platillo {
    protected String nombre;
    protected String ingredientes;
    protected double precio;
    protected double precioIngrediente;

    public Platillo() {
    }

    public Platillo(String nombre, String ingredientes, double precio) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioIngrediente() {
        return precioIngrediente;
    }

    public void setPrecioIngrediente(double precioIngrediente) {
        this.precioIngrediente = precioIngrediente;
    }
    
    public abstract String Preparacion();
    public abstract String Ingrendientes();
    public abstract double Costo();
}
