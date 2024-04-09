package Logica;

public class Extras extends Platillo{

    public Extras(String nombre, int ingrediente1, int ingrediente2, int ingrediente3, int ingrediente4) {
        super(nombre, ingrediente1, ingrediente2, ingrediente3, ingrediente4);
    }

    @Override
    public String mostrarInformacion() {
        String info_Platillo="\nlos siguientes "+ nombre + " son: "
                + "\nQueso = $" + IngreUno
                + "\nTortilla = $"+ IngreDos
                + "\nCarne = $" + IngreTres
                + "\nGuisado = $" + IngreCuatro;
        return info_Platillo;
    }

    @Override
    public String ingredientes() {
        String ingredientes="\n1) Queso";
        ingredientes +="\n2) Tortilla";
        ingredientes +="\n3) Carne";
        ingredientes +="\n4) Guisado";
    
        return ingredientes;
    }
    public int PrimerIngre(){
        return IngreUno;
    }
}
