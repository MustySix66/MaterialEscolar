package Logica;

/**
 *
 * @author kevin
 */
public class Tacos extends Platillo implements InterPlatillo{

    public Tacos(String nombre, int IngreUno, int IngreDos, int IngreTres, int IngreCuatro) {
        super(nombre, IngreUno, IngreDos, IngreTres, IngreCuatro);
    }
    
    @Override
    public String DescripcionProducto() {
        return "\n Una deliciosa tortilla hecha a mano llena de guisado a eleccion del cliente.";
    }

    @Override
    public String ingredientes() {
        String ingredientes="\n1) Tortilla";
        ingredientes += "\n2) Carne";
        ingredientes += "\n3) Verdura";
        ingredientes += "\n4) Salsa";
        
        return ingredientes;
    }

    @Override
    public String pasosElaboracion() {
        String Pasos ="\n 1) Tortilla en el comal caliente";  
        Pasos+= "\n 2) Carne elegida por el cliente al asador";
        Pasos+= "\n 3) Poner carne en la tortilla";
        Pasos+="\n 4) Doblar la tortila y repetir";
        Pasos+="\n 5) Emplatar";
        return Pasos;    
    }
    @Override
    public String totalCosto(int cantidad) {
        int costo_Total = (IngreUno + IngreDos + IngreTres + IngreCuatro)* cantidad;
        return "\n El platillo "+ nombre +" tiene un costo de: $" + String.valueOf(costo_Total)+ " IVA no incluido";
    }
    
    @Override
    public String mensajePreparacion() {
        return "\n Tus tacos están siendo preparados";
    }

    @Override
    public String mostrarInformacion() {
    String info_Platillo="\n Los "+ nombre + " tendrán un costo por ingrediente de: "
                + "\n Tortilla = $"+ IngreUno
                + "\n Carne = $" + IngreDos
                + "\n Verdura = $"+ IngreTres
                + "\n Salsa = $"+ IngreCuatro;

        return info_Platillo;    
    }
}