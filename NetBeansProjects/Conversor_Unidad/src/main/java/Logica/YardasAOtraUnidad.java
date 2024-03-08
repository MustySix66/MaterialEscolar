package Logica;

// En esta clase se manejan todas las conversiones que vienen originalmente de yd
public class YardasAOtraUnidad extends Formulas{

    public YardasAOtraUnidad() {
    }

    public YardasAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }
    
    @Override
    public String formula(double valor1, String tipoR){
        // Declaramos "factor" que es la conversion directa de 1 cm a 1 de la otra unidad
        double factor = 0;
        switch (tipoR) {
            case "Kilometro" -> factor = 0.0009144;
            case "Metro" -> factor = 0.9144;
            case "Centimetro" -> factor = 91.44;
            case "Milimetro" -> factor = 914.4;
            case "Milla" -> factor = 0.000568182;
            case "Pie" -> factor = 3;
            case "Pulgada" -> factor = 36;
            default -> {
                return "-1";
            }
        }
        // multiplicamos el valor que queremos por el factor de comunicación
        double resultado = factor * valor1;
        tipoR = String.valueOf(resultado);
        return tipoR;
    }
}
