package Logica;

public class CarneImp extends Platillo implements CarneJugo{

    public CarneImp() {
    }

    public CarneImp(String nombre, String ingredientes, double precio) {
        super(nombre, ingredientes, precio);
    }
    
    @Override
    public String Preparacion(){
        // TODO: no finish
        String StrPrep = CoccionPlato();
        return StrPrep;
    }
    @Override
    public String Ingrendientes(){
        // TODO: no finich
        return "Carne jugo.";
    };
    @Override
    public double Costo(){
        // TODO: No finich
        return 1500;
    };

    public String CoccionPlato(){
        return "Corta finamente la carne en rodajas finas y luego en pequeños cubitos; coloca la carne en un recipiente de vidrio. \n Mezcla la salsa de soya, el jugo de limón y la pimienta y agrega la carne. \n Deja marinar la carne durante unos minutos mientras se cocina el tocino Fríe el tocino en un sartén de tamaño mediano a fuego medio hasta que esté crujiente, unos 8 minutos, transfiera el tocino con una cuchara de escurrir a un plato forrado con una toalla de papel y vierta todos menos 1 cucharada de grasa de la olla.\n "
        + "Añada la carne a la olla y cocina a fuego medio durante unos 8 minutos, durante este tiempo la carne va a liberar algunos de sus jugos. \n "
        + "Mientras la carne se está cocinando, coloca el ajo picado, cebolla, cilantro y chile Serrano en tu licuadora con una taza de caldo y \\n" + //
                        " licúa hasta que esté bien mezclado, (Si vas a añadir los tomatillos, agrégalos en este paso). \n"
        + "Vierta esta mezcla a la carne, agrega el resto del caldo, y pruebe para sazonar con sal, así como la pimienta molida. \n Lleva a ebullición y luego reduzca el fuego a bajo, coloca la tapa a la olla y cocine a fuego lento durante unos 20 minutos o más hasta que la carne esté tierna. \n Este último tiempo de cocción dependerá del corte de carne que estés usando."
        + "Para servir divida los frijoles calientes en tazones después de que añadas la carne con su caldo. \nDeje que todos adornen con el tocino, cebolla picada, cilantro y rábanos junto con algunas gotas de jugo de limón.";
    };

    public double PrecioPlato(){

    };

}
