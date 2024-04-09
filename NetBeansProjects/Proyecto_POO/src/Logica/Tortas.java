package Logica;

/**
 *
 * @author kevin
 */
public class Tortas extends Platillo implements InterPlatillo {

    public Tortas() {
    }

    public Tortas(String nombre, int IngreUno, int IngreDos, int IngreTres, int IngreCuatro) {
        super(nombre, IngreUno, IngreTres, IngreTres, IngreCuatro);
    }
    
    @Override
    public String DescripcionProducto() {
        return "Delicioso bolillo del dia relleno de lechuga, jitomate, cebolla y /o el guisado del día";
    }

    @Override
    public String ingredientes() {
        
        String ingredientes="\n 1) Bolillo";
        ingredientes +="\n 2) Verdura";
        ingredientes +="\n 3) Carne";
        ingredientes +="\n 4) Guisado";
    
        return ingredientes;
    }

    @Override
    public String pasosElaboracion() {
        String Pasos ="\n 1) Poner bolillo en el comal caliente";
        Pasos += "\n 2) Calentar guisado";
        Pasos += "\n 3) Poner carne dentro del bolillo";
        Pasos += "\n 4) emplatar";
        return Pasos;

    }
    
    @Override
    public String totalCosto(int cantidad) {
        int costo_Total = (IngreUno + IngreDos + IngreTres + IngreCuatro) * cantidad;
        return "Tu platillo "+ nombre +" tiene un costo total de: " + String.valueOf(costo_Total)+ " IVA no incluido";
    }

    @Override
    public String mensajePreparacion() {
        return"Tu orden de torta(s) está siendo elaboradass";
        
    }

    @Override
    public String mostrarInformacion() {
        String info_Platillo="\n La "+ nombre + " Tendrá un costo por ingrediente de: "
                + "\n Bolillo = $" + IngreUno
                + "\n Verdura = $"+ IngreDos
                + "\n Carne = $" + IngreTres
                + "\n Guisado = $" + IngreCuatro;
                
        return info_Platillo;
    }
}