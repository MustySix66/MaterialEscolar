package Logica;

// En esta clase se manejan todas las conversiones que vienen originalmente de km
public class KilometrosAOtraUnidad extends Formulas {

    public KilometrosAOtraUnidad() {
    }

    public KilometrosAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }
    
    // Declaramos "factor" que es la conversion directa de 1 km a 1 de la otra unidad
    @Override
    public String formula(double valor1, String tipoR){
        double factor = 0;
        switch (tipoR) {
            case "Metro" -> factor = 1000;
            case "Centimetro" -> factor = 100000;
            case "Milimetro" -> factor = 1000000;
            case "Milla" -> factor = 0.621371;
            case "Yarda" -> factor = 1093.61;
            case "Pie" -> factor = 3280.84;
            case "Pulgada" -> factor = 39370.1;
            default -> {
                return "-1";
            }
        }
        // multiplicamos el valor que queremos por el factor de comunicación
        double resultado = factor * valor1;
        // y casteamos a string
        tipoR = String.valueOf(resultado);
        return tipoR;
    }
}
