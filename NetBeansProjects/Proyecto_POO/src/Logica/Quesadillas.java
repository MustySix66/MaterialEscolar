package Logica;

/**
 *
 * @author kevin
 */
public class Quesadillas extends Platillo implements InterPlatillo{

    public Quesadillas() {
    }

    public Quesadillas(String nombre, int IngreUno, int IngreDos, int IngreTres, int IngreCuatro) {
        super(nombre, IngreUno, IngreDos, IngreTres, IngreCuatro);
    }
    
    @Override
    public String DescripcionProducto() {
        
        return "Platillo mexicano consiste en una tortilla rellena de queso ";

    }

    @Override
    public String ingredientes() {
        String ingredientes="\n1) Queso";
        ingredientes +="\n2) Tortilla";
        ingredientes +="\n3) Carne";
        ingredientes +="\n4) Guisado a elegir";
    
        return ingredientes;
    }

    @Override
    public String pasosElaboracion() {
        String Pasos ="1) Poner torilla en el comal caliente";  
        Pasos+= "\n 2) Poner queso en la tortilla junto el guisado";
        Pasos+="\n 3) Doblar la quesadilla por la mitad";
        Pasos+="\n 4) Servir";
        return Pasos;
    }  
    
    @Override
    public String totalCosto(int cantidad) {
        
        int costo_Total = (IngreUno + IngreDos + IngreTres + IngreCuatro) * cantidad;
        return "El platillo "+ nombre +" tiene un costo total de: $" + String.valueOf(costo_Total)+ " IVA no incluido";
        
    }
    
    @Override
    public String mensajePreparacion() {
        
        return "Tu quesadilla está siendo elaborada";
    }

    @Override
    public String mostrarInformacion() {
        String info_Platillo="\nLa "+ nombre + " Tendrá un costo por ingrediente de: "
                + "\nQueso = $" + IngreUno
                + "\nTortilla = $"+ IngreDos
                + "\nCarne = $" + IngreTres
                + "\nGuisado = $" + IngreCuatro;
        return info_Platillo;
    }
}